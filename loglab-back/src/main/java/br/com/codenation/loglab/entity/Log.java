package br.com.codenation.loglab.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
<<<<<<< Updated upstream
    private User user;
=======
    @JoinColumn(name="user_id")//----------------
    private Usuario usuario;
>>>>>>> Stashed changes

    private String details;

    @CreatedDate
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "frequency")
    private Long quantity;

    private Boolean filed;

    private String environment;
<<<<<<< Updated upstream
=======

    public Integer getId() {
        return id;
    }

    public Log() {
    }

    public Log(Integer id, @NotNull String levelType, @NotNull String titleError, Usuario usuario, String details,
               @NotNull LocalDateTime createdAt, Long quantity, Boolean filed, String environment) {
        this.id = id;
        this.levelType = levelType;
        this.titleError = titleError;
        this.usuario = usuario;
        this.details = details;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.filed = filed;
        this.environment = environment;
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

    public Usuario getUser() {
        return usuario;
    }

    public void setUser(Usuario usuario) {
        this.usuario = usuario;
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
>>>>>>> Stashed changes
}
