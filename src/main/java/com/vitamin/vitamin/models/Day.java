package com.vitamin.vitamin.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "days")
@Data
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy="day", fetch=FetchType.EAGER)
    private List<DayItem> dayItems;
}
