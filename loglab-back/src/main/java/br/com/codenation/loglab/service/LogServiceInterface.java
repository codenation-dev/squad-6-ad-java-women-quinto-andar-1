package br.com.codenation.loglab.service;

import java.util.List;
import java.util.Optional;

import br.com.codenation.loglab.entity.Log;
//order by level, events. find by level,descrição,origem
public interface LogServiceInterface  {

   public Optional<Log> findById(Integer id);
   public List<Log> findByLevel(String level);
   public Log findByQuantity(Long quantity);
   public List<Log> findAllByOrderByLevelType();
   public List<Log> orderByQuantity();
   public Log save(Log log);
   public List<Log> findAll();
   public List<Log> findByEnvironment(String environment);
   public void deleteAll(List<Log> id);
   public void filed(List<Log> id);
   public List<Log> unarchive();
}
