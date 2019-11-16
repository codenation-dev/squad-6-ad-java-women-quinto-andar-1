package br.com.codenation.loglab.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDTO {

	@Email(message = "{email.not.valid}")
	@NotBlank(message = "{email.not.blank}")
	private String email;

	@NotBlank(message = "{password.not.blank}")
	private String password;

	@NotBlank(message = "{sourceIp.not.blank}")
	private String sourceIp;

	public UserDTO() {

	}

	public UserDTO(@Email(message = "{email.not.valid}") @NotBlank(message = "{email.not.blank}") String email,
			@NotBlank(message = "{password.not.blank}") String password,
			@NotBlank(message = "{sourceIp.not.blank}") String sourceIp) {
		super();
		this.email = email;
		this.password = password;
		this.sourceIp = sourceIp;
	}


//	public UserDTO(String email,
//			String password,
//			String sourceIp) {
//		this.email = email;
//		this.password = password;
//		this.sourceIp = sourceIp;
//	}

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
		this.password = password;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

}
