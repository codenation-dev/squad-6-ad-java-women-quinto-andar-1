package br.com.codenation.loglab.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import br.com.codenation.loglab.dto.LogDTO;
import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.mappers.LogMapper;
import br.com.codenation.loglab.service.LogServiceInterface;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/log")
public class LogController {

	@Autowired
	private LogServiceInterface logService;
	private LogMapper logMapper = new LogMapper();

	// Por enquanto controller nao tera cadastro
	@PostMapping
	public ResponseEntity<LogDTO> createLog(@RequestBody @Valid LogDTO logDTO) {
		Log log = logService.save(logMapper.toLog(logDTO));
		return new ResponseEntity<>(logMapper.toLogDTO(log), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/{id}")
	public ResponseEntity<LogDTO> findbyId(@PathVariable Integer id,
			@AuthenticationPrincipal UserDetails userDetails){
		Optional<Log> log = logService.findById(id);
		return ResponseEntity.ok(logMapper.toLogDTO(log.get()));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/logs")
	public ResponseEntity<List<LogDTO>> logs() {
		List<Log> logs = logService.findAll();
		return ResponseEntity.ok(logMapper.toLogDTOs(logs));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/level/{level}")
	public ResponseEntity<List<LogDTO>> findByLevelType(@PathVariable String level) {
		List<Log> logs = logService.findByLevel(level);
		return ResponseEntity.ok(logMapper.toLogDTOs(logs));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/environment/{environment}")
	public ResponseEntity<List<LogDTO>> findByEnvironment(@PathVariable String environment) {
		List<Log> logs = logService.findByEnvironment(environment);
		return ResponseEntity.ok(logMapper.toLogDTOs(logs));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/orderLevel")
	public ResponseEntity<List<LogDTO>> orderByLevelType() {
		List<Log> log = logService.findAllByOrderByLevelType();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/orderQuantity")
	public ResponseEntity<List<LogDTO>> orderByQuantity() {
		List<Log> log = logService.orderByQuantity();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@PutMapping
	public void filed(@RequestBody List<LogDTO> logDTO) {
		logService.filed(logMapper.toLogs(logDTO));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@DeleteMapping
	public void delete(@RequestBody List<LogDTO> ids) {
		logService.deleteAll(logMapper.toLogs(ids));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/filedArchived")
	public ResponseEntity<List<LogDTO>> filedArchived() {
		List<Log> log = logService.filedArchived();
		return ResponseEntity.ok(logMapper.toLogDTOs(log));
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/unarchive")
	public void unarchive(@RequestBody List<LogDTO> logDTO) {
		logService.unarchive(logMapper.toLogs(logDTO));
	}

}
