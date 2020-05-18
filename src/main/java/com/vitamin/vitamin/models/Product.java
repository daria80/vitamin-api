package com.vitamin.vitamin.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Product {
    @Id
    private String id;

    private String name;
    private List<Vitamin> vitamins;
    private CountType countType;
    private int count;

}
