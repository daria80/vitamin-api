package com.vitamin.vitamin.models;

import org.springframework.data.annotation.Id;

public class DayItem {
    @Id
    private String id;

    private String productId;
    private int count;
}
