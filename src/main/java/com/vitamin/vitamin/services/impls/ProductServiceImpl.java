package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.Vitamin;
import com.vitamin.vitamin.repositories.ProductRepository;
import com.vitamin.vitamin.repositories.VitaminRepository;
import com.vitamin.vitamin.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        return productRepository.save(product);
    }

    @Override
    public Product update(String id, Product product) {
        if(productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        } else {
            throw new RuntimeException("ProductNotFound by id");
        }
    }

    @Override
    public Product findById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
