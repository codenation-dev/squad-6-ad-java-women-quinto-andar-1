package br.com.codenation.loglab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.entity.User;
import br.com.codenation.loglab.repository.LogRepository;

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
    public Log findByLevel(String level) {
        return logRepository.findByLevelType(level) ;
    }

    @Override
    public Log findByQuantity(Long quantity) {
        return logRepository.findByQuantity(quantity) ;
    }

    @Override
    public List<Log> findAllOrderByLevelType() {
        return logRepository.findAllOrderByLevelType();
    }

    @Override
    public List<Log> orderByQuantity() {
        return logRepository.OrderByQuantity();
    }

	@Override
	public Log save(Log log) {
		return logRepository.save(log);
	}
}