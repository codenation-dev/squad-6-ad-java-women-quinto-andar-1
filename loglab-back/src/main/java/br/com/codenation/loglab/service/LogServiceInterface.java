package br.com.codenation.loglab.service;

import br.com.codenation.loglab.entity.Log;

import java.util.List;
import java.util.Optional;
//order by level, events. find by level,descrição,origem
public interface LogServiceInterface  {

   public Optional<Log> findById(Integer id);
   public Log findByLevelType(String level);
   public Log findByQuantity(Long quantity);
   public List<Log> orderByLevel(String level);
   public List<Log> orderByQuantity();
}
