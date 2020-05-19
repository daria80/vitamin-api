package com.vitamin.vitamin.transfers;

import com.vitamin.vitamin.models.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VitaminResponse {

    private long id;
    private String name;
    private int norma;
    //
//    @JsonProperty("product_id")
    private Product product;


}
