package br.com.codenation.loglab.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import br.com.codenation.loglab.entity.User;

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
    @JoinColumn(name="user_id")//----------------
    private User user;

    private String details;

    @Column(name = "created_at")//-------------
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
    

    public Log(@NotNull String levelType, @NotNull String titleError, User user, String details,
               @NotNull LocalDateTime createdAt, Long quantity, Boolean filed, String environment) {
        this.levelType = levelType;
        this.titleError = titleError;
        this.user = user;
        this.details = details;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.filed = filed;
        this.environment = environment;
    }
    
    public Log(Integer id, @NotNull String levelType, @NotNull String titleError, User user, String details,
    		@NotNull LocalDateTime createdAt, Long quantity, Boolean filed, String environment) {
    	this(levelType, titleError, user, details,
    			createdAt, quantity, filed, environment);
    	this.id = id;
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

    public Boolean getFiled() {
        return filed;
    }

    public void setFiled(Boolean filed) {
        this.filed = filed;
    }

    public String getEnvironment() {
        return environment;
    }
}
