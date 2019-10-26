package br.com.codenation.loglab.repository;

import br.com.codenation.loglab.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

    public Log findByLevelType(String levelType);
    public Log findByQuantity(Long quantity);
    public List<Log> orderByLevel(String level);
    public List<Log> orderByQuantity();


}
