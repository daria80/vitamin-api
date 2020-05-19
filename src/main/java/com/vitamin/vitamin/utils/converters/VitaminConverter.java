package com.vitamin.vitamin.utils.converters;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.transfers.VitaminRequest;
import com.vitamin.vitamin.transfers.VitaminResponse;

public class VitaminConverter {

    public static VitaminResponse toResponse(Vitamin vitamin) {
        return VitaminResponse.builder()
                .id(vitamin.getId())
                .name(vitamin.getName())
                .norma(vitamin.getNorma())
                .product(vitamin.getProduct())
                .build();
    }

    public static Vitamin toModel(VitaminRequest vitamin) {
        Product product =  new Product();
        product.setId(vitamin.getProductId());
        return Vitamin.builder()
                .name(vitamin.getName())
                .norma(vitamin.getNorma())
                .product(product)
                .build();
    }




}
