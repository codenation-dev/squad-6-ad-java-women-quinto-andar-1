package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    private UserRepository userRepository;


    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}
