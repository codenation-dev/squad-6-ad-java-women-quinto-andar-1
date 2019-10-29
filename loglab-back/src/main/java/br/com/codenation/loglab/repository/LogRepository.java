package br.com.codenation.loglab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.codenation.loglab.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

	public Log findByLevelType(String levelType);

	public Log findByQuantity(Long quantity);

	@Query("SELECT log FROM Log log ORDER BY log.levelType")
	public List<Log> findAllOrderByLevelType();

	public List<Log> OrderByQuantity();

}
