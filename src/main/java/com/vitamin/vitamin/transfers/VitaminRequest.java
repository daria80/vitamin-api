package com.vitamin.vitamin.transfers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vitamin.vitamin.models.Vitamin;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class VitaminRequest {

    private String name;
    private int norma;
//
//    @JsonProperty("product_id")
    private long productId;


}
