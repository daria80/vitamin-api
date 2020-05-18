package com.vitamin.vitamin.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Day {

    @Id
    private String id;
    private List<DayItem> items;
}
