package com.vitamin.vitamin.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Product {
    @Id
    private String id;

    private String name;
    private List<Vitamin> vitamins;


}
