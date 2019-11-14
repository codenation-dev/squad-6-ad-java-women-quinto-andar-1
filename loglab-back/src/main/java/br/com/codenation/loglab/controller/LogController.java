package br.com.codenation.loglab.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	private LogMapper logMapper = new LogMapper();
	
	@PostMapping
	public ResponseEntity<LogDTO> createUser(@RequestBody @Valid LogDTO logDTO) {
		Log log= logService.save(logMapper.toLog(logDTO));
		return new ResponseEntity<>(logMapper.toLogDTO(log), HttpStatus.CREATED);

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LogDTO> findbyId(@PathVariable Integer id){
		Optional<Log> log = logService.findById(id);
		return ResponseEntity.ok(logMapper.toLogDTO(log.get()));
	}
	
	@GetMapping("/level/{level}")
	public ResponseEntity<LogDTO> findByLevelType(@PathVariable String level){
		Log log = logService.findByLevel(level);
		return ResponseEntity.ok(logMapper.toLogDTO(log));
	}
	
	@GetMapping("/orderLevel")
	public ResponseEntity<List<LogDTO>> orderByLevelType(){
		List<Log> log = logService.findAllOrderByLevelType();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}
	
	@GetMapping("/orderQuantity")
	public ResponseEntity<List<LogDTO>> orderByQuantity(){
		List<Log> log = logService.orderByQuantity();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}
	
	
}
