package br.com.codenation.loglab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Integer id;
	private String email;
	private String password;
	private String sourceIp;

}
