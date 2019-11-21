package br.com.codenation.loglab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.dom4j.tree.AbstractEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Email(message = "E-mail inválido!")
	private String email;

	@NotBlank
	@NotNull
	@NotEmpty(message = "O campo senha é obrigatório")
	//@JsonIgnore
	private String password;

	@Column(name = "origin")
	@NotBlank
	@NotNull
	private String sourceIp;


	public User() {

	}

	public User(
			@Email(message = "E-mail inválido!") @NotEmpty(message = "O campo e-mail é obrigatório") @NotNull String email,
			@NotBlank @NotNull @NotEmpty(message = "O campo senha é obrigatório") String password,
			@NotBlank @NotNull String sourceIp) {
		this.email = email;
		this.password = password;
		this.sourceIp = sourceIp;
	}

	public User(Integer id,
			@Email(message = "E-mail inválido!") @NotEmpty(message = "O campo e-mail é obrigatório") @NotNull String email,
			@NotBlank @NotNull @NotEmpty(message = "O campo senha é obrigatório") String password,
			@NotBlank @NotNull String sourceIp) {
		this(email, password, sourceIp);
		this.id = id;
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
