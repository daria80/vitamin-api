package com.vitamin.vitamin.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "vitamins")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vitamin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int norma;

    @ManyToOne
    @JoinColumn(name = "product_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
}
