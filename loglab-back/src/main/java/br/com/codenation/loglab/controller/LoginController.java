package br.com.codenation.loglab.controller;


import br.com.codenation.loglab.config.TokenUtil;
import br.com.codenation.loglab.entity.AuthenticationRequest;
import br.com.codenation.loglab.entity.UserLogin;
import br.com.codenation.loglab.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @RequestMapping(value = "/authenticate", method = { RequestMethod.POST })
    public ResponseEntity<UserLogin> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        try {
            String email = authenticationRequest.getEmail();
            String password = authenticationRequest.getPassword();
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(email, password);
            Authentication authentication = this.authenticationManager.authenticate(token);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetails userDetails = this.customUserDetailService.loadUserByUsername(email);
            List<String> roles = new ArrayList();

            for (GrantedAuthority authority : userDetails.getAuthorities()) {
                roles.add(authority.toString());
            }

            return new ResponseEntity<UserLogin>(new UserLogin(userDetails.getUsername(), roles,
                    TokenUtil.createToken(userDetails), HttpStatus.OK), HttpStatus.OK);

        } catch (BadCredentialsException bce) {
            return new ResponseEntity<UserLogin>(new UserLogin(), HttpStatus.UNPROCESSABLE_ENTITY);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
