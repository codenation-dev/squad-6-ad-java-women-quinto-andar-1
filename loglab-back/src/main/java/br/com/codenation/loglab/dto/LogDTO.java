package br.com.codenation.loglab.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class LogDTO {

	@NotBlank(message = "{level.not.blank}")
	private String level;
	@NotBlank(message = "{titleError.not.blank}")
	private String titleError;
	@NotNull
	private UserDTO userDTO;
	private String details;
	@NotNull
	private LocalDateTime createdAt;
	private Long quantity;
	boolean filed;
	private String environment;

	public LogDTO() {
	}

	public LogDTO(@NotBlank(message = "{level.not.blank}") String level,
			@NotBlank(message = "{titleError.not.blank}") String titleError, @NotNull UserDTO userDTO, String details,
			LocalDateTime createdAt, Long quantity, boolean filed, String environment) {
		this.level = level;
		this.titleError = titleError;
		this.userDTO = userDTO;
		this.details = details;
		this.createdAt = createdAt;
		this.quantity = quantity;
		this.filed = filed;
		this.environment = environment;
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

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO user) {
		this.userDTO = user;
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
