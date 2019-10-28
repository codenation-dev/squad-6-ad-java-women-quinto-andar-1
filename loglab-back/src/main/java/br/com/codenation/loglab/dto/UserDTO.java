package br.com.codenation.loglab.dto;

public class UserDTO {
	private Integer id;
	private String email;
	private String password;
	private String sourceIp;

	public UserDTO(Integer id, String email, String password, String sourceIp) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.sourceIp = sourceIp;
	}
}
