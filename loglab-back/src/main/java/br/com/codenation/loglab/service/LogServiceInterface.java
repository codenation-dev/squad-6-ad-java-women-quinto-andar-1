package br.com.codenation.loglab.service;

import java.util.List;
import java.util.Optional;

import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.entity.User;
//order by level, events. find by level,descrição,origem
public interface LogServiceInterface  {

   public Optional<Log> findById(Integer id);
   public Log findByLevel(String level);
   public Log findByQuantity(Long quantity);
   public List<Log> findAllOrderByLevelType();
   public List<Log> orderByQuantity();
   public Log save(Log log);
}
