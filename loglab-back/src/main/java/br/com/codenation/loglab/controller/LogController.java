package br.com.codenation.loglab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping
	public ResponseEntity<LogDTO> createUser(@RequestBody LogDTO logDTO) {
		Log log= logService.save(logMapper.toLog(logDTO));
		return new ResponseEntity<>(logMapper.toLogDTO(log), HttpStatus.CREATED);

	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/{id}")
	public ResponseEntity<LogDTO> findbyId(@PathVariable Integer id){
		Optional<Log> log = logService.findById(id);
		return ResponseEntity.ok(logMapper.toLogDTO(log.get()));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/level/{level}")
	public ResponseEntity<LogDTO> findByLevelType(@PathVariable String level){
		Log log = logService.findByLevel(level);
		return ResponseEntity.ok(logMapper.toLogDTO(log));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/orderLevel")
	public ResponseEntity<List<LogDTO>> orderByLevelType(){
		List<Log> log = logService.findAllOrderByLevelType();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/orderQuantity")
	public ResponseEntity<List<LogDTO>> orderByQuantity(){
		List<Log> log = logService.orderByQuantity();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}
	
	
}
