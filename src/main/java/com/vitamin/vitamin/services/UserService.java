package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.Product;
import com.vitamin.vitamin.models.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User update(String id, User user);

    User findById(String id);

    void deleteById(String id);


}
