package br.com.codenation.loglab.dto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDTO {

	private Integer id;
	private String email;
	private String password;
	private String sourceIp;

	public UserDTO() {

	}

	public UserDTO(Integer id, String email, String password, String sourceIp) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.sourceIp = sourceIp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		//this.password = password;
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = (passwordEncoder.encode(password));	
		//this.password = password;
		this.password = hashedPassword;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

}
