package br.com.codenation.loglab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenation.loglab.dto.LogDTO;
import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.mappers.LogMapper;
import br.com.codenation.loglab.service.LogServiceInterface;

@RestController
@RequestMapping("/log")
public class LogController {

	@Autowired
	private LogServiceInterface logService;
	
	@Autowired
	private LogMapper logMapper;
	
	@GetMapping("/{id}")
	public ResponseEntity<LogDTO> findbyId(@PathVariable Integer id){
		Optional<Log> log = logService.findById(id);
		return ResponseEntity.ok(logMapper.toLogDTO(log.get()));
	}
}
