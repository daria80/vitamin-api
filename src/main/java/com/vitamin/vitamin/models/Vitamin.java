package com.vitamin.vitamin.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    @JoinColumn(name = "productId", referencedColumnName = "id")
    @EqualsAndHashCode.Exclude
    private Product product;

}
