package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.repository.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogService implements  LogServiceInterface{

    private LogRepository logRepository;


    @Override
    public Optional<Log> findById(Integer id) {
        return logRepository.findById(id);
    }

    @Override
    public Optional<Log> findByLevelType(String level) {
        return Optional.empty();
    }

    @Override
    public Optional<Log> findByQuantity(Long quantity) {
        return Optional.empty();
    }

    @Override
    public List<Log> orderByLevel(String level) {
        return null;
    }

    @Override
    public List<Log> orderByQuantity(Long quanntity) {
        return null;
    }
}