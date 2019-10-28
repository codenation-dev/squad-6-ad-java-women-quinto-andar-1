package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogService implements  LogServiceInterface{

    private LogRepository logRepository;
//precisa instanciar a repository

    @Autowired
    LogService (LogRepository repository){
        this.logRepository = repository;
    }

    @Override
    public Optional<Log> findById(Integer id) {
        return logRepository.findById(id);
    }

    @Override
    public Log findByLevelType(String level) {
        return logRepository.findByLevelType(level) ;
    }

    @Override
    public Log findByQuantity(Long quantity) {
        return logRepository.findByQuantity(quantity) ;
    }

    @Override
    public List<Log> orderByLevelType(String level) {
        return logRepository.OrderByLevelType(level);
    }

    @Override
    public List<Log> orderByQuantity() {
        return logRepository.orderByQuantity();
    }
}