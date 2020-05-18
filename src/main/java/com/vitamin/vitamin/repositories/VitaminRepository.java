package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.Vitamin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VitaminRepository extends MongoRepository<Vitamin, String> {
}
