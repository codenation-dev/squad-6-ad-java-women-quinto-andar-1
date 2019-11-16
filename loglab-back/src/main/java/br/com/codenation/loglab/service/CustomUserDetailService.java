package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.springframework.security.core.authority.AuthorityUtils.createAuthorityList;
@Component
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = Optional.ofNullable(userRepository.findByEmail(email))
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
        List<GrantedAuthority> authorityListAdmin =  AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN");
        List<GrantedAuthority> authorityListUser =  AuthorityUtils.createAuthorityList("ROLE_USER");
        return new org.springframework.security.core.userdetails.User
                (user.getEmail(), user.getPassword(), authorityListAdmin);

    }
}
