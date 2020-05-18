package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.DayItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DayItemRepository extends MongoRepository<DayItem,String> {
}
