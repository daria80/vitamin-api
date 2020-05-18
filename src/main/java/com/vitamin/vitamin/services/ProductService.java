package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;

public interface ProductService {

    Product save(Product product);

    Product update(String id, Product product);

    Product findById(String id);

    void deleteById(String id);


}
