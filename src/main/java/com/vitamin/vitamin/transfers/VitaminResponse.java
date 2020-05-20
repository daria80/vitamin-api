package com.vitamin.vitamin.transfers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VitaminResponse {

    private long id;
    private String name;
    private int norma;
    private long productId;
}
