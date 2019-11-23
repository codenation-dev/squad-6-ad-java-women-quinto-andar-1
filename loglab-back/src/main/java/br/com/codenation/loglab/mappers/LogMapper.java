package br.com.codenation.loglab.mappers;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.loglab.dto.LogDTO;
import br.com.codenation.loglab.dto.UserDTO;
import br.com.codenation.loglab.entity.Log;
import br.com.codenation.loglab.entity.User;

public class LogMapper {
	
	public LogDTO toLogDTO(Log log) {
		return new LogDTO(log.getId(),
				log.getLevelType(),
				log.getTitleError(),
				new UserDTO(
						log.getUser().getId(),
						log.getUser().getEmail(),
						log.getUser().getPassword(),
						log.getUser().getSourceIp()),
				log.getDetails(),
				log.getCreatedAt(),
				log.getQuantity(),
				log.getFiled(),
				log.getEnvironment());
	}
		
	public List<LogDTO> toLogDTOs(List<Log> logs){
		List<LogDTO> list = new ArrayList<>();
		for(Log l : logs) {
			list.add(toLogDTO(l));
		}
		return list;
	}	
	
	public List<Log> toLogs(List<LogDTO> logs){
		List<Log> list = new ArrayList<>();
		for(LogDTO l : logs) {
			list.add(toLog(l));
		}
		return list;	
	}
	public Log toLog (LogDTO logDTO) {
		return new Log(
				logDTO.getId(),
				logDTO.getLevel(),
				logDTO.getTitleError(),
				new User(
						logDTO.getUserDTO().getId(),
						logDTO.getUserDTO().getEmail(),
						logDTO.getUserDTO().getPassword(),
						logDTO.getUserDTO().getSourceIp()),
				logDTO.getDetails(),
				logDTO.getCreatedAt(),
				logDTO.getQuantity(),
				logDTO.getFiled(),
				logDTO.getEnvironment());
	}
}
