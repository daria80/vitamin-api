package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
