package com.mycompany.classicmodels.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import static java.util.stream.Collectors.joining;

@Controller
@SessionScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1236266305156001176L;

    public String getUsername() {
        return getAuthentication().getName();
    }

    public String getRoles() {
        return getAuthentication()
                .getAuthorities()
                .stream()
                .map(Object::toString)
                .collect(joining(","));
    }

    private Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}