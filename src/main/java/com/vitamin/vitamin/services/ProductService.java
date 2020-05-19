package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    Product update(long id, Product product);

    List<Product> findAll();

    Product findById(long id);

    void deleteById(long id);


}
