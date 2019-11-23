package br.com.codenation.loglab.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	private UserRepository userRepository;

	@Autowired
	UserService(UserRepository repository) {
		this.userRepository = repository;
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
}
