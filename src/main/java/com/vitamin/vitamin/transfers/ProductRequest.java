package com.vitamin.vitamin.transfers;

import com.vitamin.vitamin.models.CountType;
import lombok.Data;

@Data
public class ProductRequest {

    private long id;

    private int count;

    private CountType  count_type;

    private String name;
}
