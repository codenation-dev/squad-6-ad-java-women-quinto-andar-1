package br.com.codenation.loglab.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDTO {

	@Email(message = "{email.not.blank}")
	@NotEmpty(message = "{email.not.empty}")
	@NotNull
	private String email;

	@NotBlank(message = "{password.not.blank}")
	@NotNull(message = "{password.not.null}")
	@NotEmpty(message = "{password.not.empty}")
	private String password;

	@NotBlank(message = "{sourceIp.not.blank}")
	@NotNull(message = "{password.not.null}")
	private String sourceIp;

	public UserDTO() {

	}

	public UserDTO(@Email(message = "{email.not.blank}") @NotEmpty(message = "{email.not.empty}") @NotNull String email,
			@NotBlank(message = "{password.not.blank}") @NotNull(message = "{password.not.null}") @NotEmpty(message = "{password.not.empty}") String password,
			@NotBlank(message = "{sourceIp.not.blank}") @NotNull(message = "{password.not.null}") String sourceIp) {
		super();
		this.email = email;
		this.password = password;
		this.sourceIp = sourceIp;
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
		this.password = password;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

}
