package com.vitamin.vitamin.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String email;
    private String password;
    private long registrationDate;
    private String firstName;
    private String lastName;
}
