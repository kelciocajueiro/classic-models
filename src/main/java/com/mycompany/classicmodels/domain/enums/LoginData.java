package com.mycompany.classicmodels.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum LoginData {

    USER_ONE("Test1", "test1@mytest.com", "USER"),
    USER_TWO("Test2", "test2@mytest.com", "USER");

    @Getter
    private String username;

    @Getter
    private String password;

    @Getter
    private String role;

}
