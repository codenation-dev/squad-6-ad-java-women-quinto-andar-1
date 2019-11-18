package br.com.codenation.loglab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.repository.LogRepository;

@Service
public class LogService implements LogServiceInterface {

	private LogRepository logRepository;
//precisa instanciar a repository

	@Autowired
	LogService(LogRepository repository) {
		this.logRepository = repository;
	}

	@Override
	public Optional<Log> findById(Integer id) {
		return logRepository.findById(id);
	}

	@Override
	public List<Log> findByLevel(String level) {
		return logRepository.findByLevelType(level);
	}

	@Override
	public Log findByQuantity(Long quantity) {
		return logRepository.findByQuantity(quantity);
	}

	@Override
	public List<Log> findAllByOrderByLevelType() {
		return logRepository.findAllByOrderByLevelType();
	}

	@Override
	public List<Log> orderByQuantity() {
		return logRepository.OrderByQuantity();
	}

	@Override
	public Log save(Log log) {
		return logRepository.save(log);
	}

	@Override
	public List<Log> findAll() {
		return logRepository.findAll();
	}

	@Override
	public List<Log> findByEnvironment(String environment) {
		return logRepository.findByEnvironment(environment);
	}

	@Override
	public void deleteAll(List<Log> logDTO) {
		for (Log logs : logDTO) {
			logRepository.deleteById(logs.getId());
		}
	}

	@Override
	public void filed(List<Log> logDTO) {
		for (Log logs : logDTO) {
			Optional<Log> log =logRepository.findById(logs.getId());
			log.get().setFiled(true);
			logRepository.save(log.get());
		}
	}

	@Override
	public List<Log> unarchive() {
		return logRepository.findByFiledTrue();
	}
}