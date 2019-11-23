package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.User;

import java.util.Optional;

public interface UserServiceInterface {
	public Optional<User> findById(Integer id);
	
	public User findByEmail(String email);

	public User save(User user);
}
