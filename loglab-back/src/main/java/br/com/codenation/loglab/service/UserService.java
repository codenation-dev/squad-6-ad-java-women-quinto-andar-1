package br.com.codenation.loglab.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	private UserRepository userRepository;


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

	@Override
	public User findByEmail(String email){
		return userRepository.findByEmail(email);
	}
}
