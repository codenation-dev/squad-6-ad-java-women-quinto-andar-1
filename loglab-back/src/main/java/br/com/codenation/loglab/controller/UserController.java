package br.com.codenation.loglab.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import br.com.codenation.loglab.dto.UserDTO;
import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.mappers.UserMapper;
import br.com.codenation.loglab.service.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceInterface userService;
	private UserMapper userMapper = new UserMapper();

	@PostMapping(path = "user")
	public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
		User user = userService.save(userMapper.toUser(userDTO));
		return new ResponseEntity<>(userMapper.toUserDTO(user), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
		Optional<User> user = userService.findById(id);
		return ResponseEntity.ok(userMapper.toUserDTO(user.get()));
	}

}