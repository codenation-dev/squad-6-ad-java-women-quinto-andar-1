package br.com.codenation.loglab.dto;

import java.time.LocalDateTime;

import br.com.codenation.loglab.entity.Usuario;

public class LogDTO {

	private Integer id;
	private String level;
	private String titleError;
	private Usuario usuario;
	private String details;
	private LocalDateTime createdAt;
	private Long quantity;
	boolean filed;
	private String environment;

	public LogDTO(Integer id, String level, String titleError, Usuario usuarioId, String details, LocalDateTime createdAt,
			Long quantity, boolean filed, String environment) {
		this.id = id;
		this.level = level;
		this.titleError = titleError;
		this.usuario = usuarioId;
		this.details = details;
		this.createdAt = createdAt;
		this.quantity = quantity;
		this.filed = filed;
		this.environment = environment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTitleError() {
		return titleError;
	}

	public void setTitleError(String titleError) {
		this.titleError = titleError;
	}

	public Usuario getUser() {
		return usuario;
	}

	public void setUser(Usuario user) {
		this.usuario = user;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public boolean getFiled() {
		return filed;
	}

	public void setFiled(boolean filed) {
		this.filed = filed;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
