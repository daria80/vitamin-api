package com.vitamin.vitamin.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
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
