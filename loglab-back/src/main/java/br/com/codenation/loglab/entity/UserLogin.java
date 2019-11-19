package br.com.codenation.loglab.entity;

import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

public class UserLogin {
    private String email;
    private List<String> roles;
    private String token;
    private HttpStatus status;

    public UserLogin(String email, List<String> roles, String token, HttpStatus status) {
        this.roles = roles;
        this.token = token;
        this.email = email;
        this.status = status;
    }

    public UserLogin() {
        this.token = "";
        this.email = "";
        this.roles = Collections.emptyList();
        this.status = HttpStatus.NOT_FOUND;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public String getToken() {
        return this.token;
    }

    public String getEmail() {
        return this.email;
    }

    public HttpStatus getStatus() {
        return this.status;
    }
}
