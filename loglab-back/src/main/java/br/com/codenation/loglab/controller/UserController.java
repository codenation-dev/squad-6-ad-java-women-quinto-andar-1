package br.com.codenation.loglab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
		User user = userService.save(userMapper.toUser(userDTO));
		return new ResponseEntity<>(userMapper.toUserDTO(user), HttpStatus.CREATED);
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(path = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
		Optional<User> user = userService.findById(id);
		return ResponseEntity.ok(userMapper.toUserDTO(user.get()));
	}
}