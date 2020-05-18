package com.vitamin.vitamin.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vitamin {

    @Id
    private String id;

    private String name;
    private int  norma;

}
