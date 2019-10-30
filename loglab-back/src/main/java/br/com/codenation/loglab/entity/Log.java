package br.com.codenation.loglab.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "level")
    @NotNull
    private String levelType;

    @Column(name = "title")
    @NotNull
    private String titleError;

    @ManyToOne
    private User user;

    private String details;

    @CreatedDate
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "frequency")
    private Long quantity;

    private Boolean filed;

    private String environment;

    public Integer getId() {
        return id;
    }

    public Log() {
    }

    public Log(Integer id, @NotNull String levelType, @NotNull String titleError, User userId, String details,
               @NotNull LocalDateTime createdAt, Long quantity, Boolean filed, String environment, User userSourceIp) {
        this.id = id;
        this.levelType = levelType;
        this.titleError = titleError;
        this.userId = userId;
        this.details = details;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.filed = filed;
        this.environment = environment;
        this.userSourceIp = userSourceIp;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getTitleError() {
        return titleError;
    }

    public void setTitleError(String titleError) {
        this.titleError = titleError;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
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

    public Boolean getFiled() {
        return filed;
    }

    public void setFiled(Boolean filed) {
        this.filed = filed;
    }

    public String getEnvironment() {
        return environment;
    }

    public User getUserSourceIp() {
        return userSourceIp;
    }
}
