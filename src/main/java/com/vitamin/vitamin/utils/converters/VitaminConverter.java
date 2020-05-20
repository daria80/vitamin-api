package com.vitamin.vitamin.utils.converters;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.transfers.VitaminRequest;
import com.vitamin.vitamin.transfers.VitaminResponse;

public class VitaminConverter {

    // принимаем модель vitamin и преобразовываем в VitaminResponse(dto)-то что отправляем пользователю(клиенту)

    public static VitaminResponse toResponse(Vitamin vitamin) {
        return VitaminResponse.builder()
                .id(vitamin.getId())
                .name(vitamin.getName())
                .norma(vitamin.getNorma())
                .productId(vitamin.getProduct().getId())
                .build();
    }

    // то что отправил пользователь преобразовываем(mapping) в модель

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
