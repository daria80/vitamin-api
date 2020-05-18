package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
