package com.vitamin.vitamin.models;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy="product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vitamin> vitamins = new ArrayList<>();

    private CountType countType;
    private int count;

}
