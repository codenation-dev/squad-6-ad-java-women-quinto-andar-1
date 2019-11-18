package br.com.codenation.loglab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.codenation.loglab.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

	public List<Log> findByLevelType(String levelType);

	public Log findByQuantity(Long quantity);

	public List<Log> findByEnvironment(String environment);

	public List<Log> findAllByOrderByLevelType();

	public List<Log> OrderByQuantity();

	public List<Log> findByFiledTrue();

}
