package br.com.codenation.loglab.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDTO {
	
	@NotBlank(message = "{id.not.blank}")
	private Integer id;
	@Email(message = "{email.not.valid}")
	@NotBlank(message = "{email.not.blank}")
	private String email;

	@NotBlank(message = "{password.not.blank}")
	private String password;

	@NotBlank(message = "{sourceIp.not.blank}")
	private String sourceIp;
	
	public UserDTO(@NotBlank(message = "{id.not.blank}") Integer id,
			@Email(message = "{email.not.valid}") @NotBlank(message = "{email.not.blank}") String email,
			@NotBlank(message = "{password.not.blank}") String password,
			@NotBlank(message = "{sourceIp.not.blank}") String sourceIp) {
		this(email, password, sourceIp);
		this.id = id;
	}
	
	public UserDTO(@Email(message = "{email.not.valid}") @NotBlank(message = "{email.not.blank}") String email,
			@NotBlank(message = "{password.not.blank}") String password,
			@NotBlank(message = "{sourceIp.not.blank}") String sourceIp) {
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

	public Integer getId() {
		return id;
	}
	
	public void Id(Integer id) {
		this.id = id;
	}

}
