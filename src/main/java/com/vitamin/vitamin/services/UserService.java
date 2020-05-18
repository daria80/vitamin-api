package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.User;

import java.util.List;

public interface UserService {

    User saveOrUpdate(User user);

    List<User> findAll();

    User  findById(String id);

    void deleteById(String id);

}
