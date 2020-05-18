package com.vitamin.vitamin.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {
    @Id
    private String id;

    private String username;
    private String email;
    private String password;
    private long registrationDate;
    private String firstName;
    private String lastName;
}
