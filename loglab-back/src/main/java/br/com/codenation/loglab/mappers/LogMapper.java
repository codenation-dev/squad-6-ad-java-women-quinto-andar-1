package br.com.codenation.loglab.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.codenation.loglab.dto.LogDTO;
import br.com.codenation.loglab.entity.Log;

@Mapper
public interface LogMapper {

	public LogDTO toLogDTO(Log log);
		
	public List<LogDTO> toLogDTOs(List<Log> logs);
	
	public Log toLog (LogDTO logDTO);
}
