package com.mycompany.classicmodels.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginData {

    USER_ONE("Test1", "test1@mytest.com", "USER"),
    USER_TWO("Test2", "test2@mytest.com", "USER");

    private String username;
    private String password;
    private String role;

}
