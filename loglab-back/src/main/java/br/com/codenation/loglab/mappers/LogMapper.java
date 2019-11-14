package br.com.codenation.loglab.mappers;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.loglab.dto.LogDTO;
import br.com.codenation.loglab.entity.Log;

public class LogMapper {

	
	public LogDTO toLogDTO(Log log) {
		return new LogDTO(log.getLevelType(),
				log.getTitleError(),
				log.getUser(),
				log.getDetails(),
				log.getCreatedAt(),
				log.getQuantity(),
				log.getFiled(),
				log.getEnvironment());
		}
		
	public List<LogDTO> toLogDTOs(List<Log> logs){
		List<LogDTO> lista = new ArrayList<>();
		for(Log l : logs) {
			lista.add(new LogDTO(l.getLevelType(),
					l.getTitleError(),
					l.getUser(),
					l.getDetails(),
					l.getCreatedAt(),
					l.getQuantity(),
					l.getFiled(),
					l.getEnvironment()));
		}
		return lista;
	}
	
	public Log toLog (LogDTO logDTO) {
		return new Log(
				logDTO.getLevel(),
				logDTO.getTitleError(),
				logDTO.getUser(),
				logDTO.getDetails(),
				logDTO.getCreatedAt(),
				logDTO.getQuantity(),
				logDTO.getFiled(),
				logDTO.getEnvironment());
	}
}
