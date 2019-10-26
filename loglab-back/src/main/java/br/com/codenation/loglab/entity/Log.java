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
    private User user;

    private String details;

    @CreatedDate
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "frequency")
    private Long quantity;

    private Boolean filed;

    private String environment;
}
