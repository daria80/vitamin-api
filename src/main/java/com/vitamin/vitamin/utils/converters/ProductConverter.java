package com.vitamin.vitamin.utils.converters;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.transfers.ProductRequest;
import com.vitamin.vitamin.transfers.ProductResponse;
import com.vitamin.vitamin.transfers.VitaminRequest;

public class ProductConverter {

    public static Product toModel(ProductRequest productRequest) {

        Product product = new Product();
        product.setId(productRequest.getId());
        product.setCountType(productRequest.getCount_type());
        product.setCount(productRequest.getCount());
        return product;
    }


    public static ProductResponse toResponse(Product product) {

        ProductResponse productResponse =  new ProductResponse();
        productResponse.setId(productResponse.getId());
        productResponse.setName(productResponse.getName());
        productResponse.setCount_type(productResponse.getCount_type());
        productResponse.setCount(productResponse.getCount());
        return productResponse;
    }


}
