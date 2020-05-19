package com.vitamin.vitamin.services;

import com.vitamin.vitamin.models.User;
import java.util.List;

public interface UserService {

    User save(User user);

    User update(long id, User user);

    List<User> findAll();

    User findById(long id);

    void deleteById(long id);


}
