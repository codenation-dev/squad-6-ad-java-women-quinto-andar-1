package br.com.codenation.loglab.dto;

import java.time.LocalDateTime;

import br.com.codenation.loglab.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LogDTO {

	private Integer id;
	private String levelType;
	private String titleError;
	private User userId;
	private String details;
	private LocalDateTime createdAt;
	private Long quantity;
	boolean filed;
	private String environment;
	private User userSourceIp;
	
	
}
