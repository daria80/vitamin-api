package com.vitamin.vitamin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    private List<Vitamin> vitamins;

    private CountType countType;
    private int count;

}
