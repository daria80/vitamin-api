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
        product.setName(productRequest.getName());
        product.setCountType(productRequest.getCount_type());
        product.setCount(productRequest.getCount());
        return product;
    }


    public static ProductResponse toResponse(Product product) {

        ProductResponse productResponse =  new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setCount_type(product.getCountType());
        productResponse.setCount(product.getCount());
        return productResponse;
    }


}
