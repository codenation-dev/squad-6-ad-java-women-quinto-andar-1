package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.User;

import java.util.Optional;

public interface UserServiceInterface {
    public Optional<User> findById(Integer id);
}
