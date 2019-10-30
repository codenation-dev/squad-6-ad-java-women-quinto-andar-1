package br.com.codenation.loglab.dto;

import java.time.LocalDateTime;

import br.com.codenation.loglab.entity.User;

public class LogDTO {

	private Integer id;
	private String level;
	private String titleError;
	private User user;
	private String details;
	private LocalDateTime createdAt;
	private Long quantity;
	boolean filed;
	private String environment;

	public LogDTO(Integer id, String level, String titleError, User userId, String details, LocalDateTime createdAt,
			Long quantity, boolean filed, String environment) {
		this.id = id;
		this.level = level;
		this.titleError = titleError;
		this.user = userId;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
