package com.vitamin.vitamin.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="day_items")
@Data
public class DayItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productId;
    private int count;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="day_id")
    private Day day;
}
