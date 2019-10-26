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
    private Double sourceIp;

}
