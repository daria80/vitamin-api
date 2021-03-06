package com.vitamin.vitamin.transfers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VitaminResponse {

    private long id;
    private String name;
    private int norma;
    private long productId;
}
