package com.vitamin.vitamin.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Day {

    @Id
    private String id;
    private List<DayItem> items;
}
