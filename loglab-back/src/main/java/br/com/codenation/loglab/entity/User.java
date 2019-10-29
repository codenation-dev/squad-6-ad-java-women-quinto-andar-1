package br.com.codenation.loglab.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Email(message = "E-mail inválido!")
	@NotEmpty(message = "O campo e-mail é obrigatório")
	@NotNull
	private String email;

	@NotBlank
	@NotNull
	@NotEmpty(message = "O campo senha é obrigatório")
	private String password;

	@Column(name = "origin")
	@NotBlank
	@NotNull
	private String sourceIp;
	
	public User() {
		
	}

	public User(Integer id,
			@Email(message = "E-mail inválido!") @NotEmpty(message = "O campo e-mail é obrigatório") @NotNull String email,
			@NotBlank @NotNull @NotEmpty(message = "O campo senha é obrigatório") String password,
			@NotBlank @NotNull String sourceIp) {
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
		this.password = password;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

}
