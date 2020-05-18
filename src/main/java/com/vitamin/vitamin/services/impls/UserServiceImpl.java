package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.User;
import com.vitamin.vitamin.repositories.UserRepository;
import com.vitamin.vitamin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public User update(String id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        } else {
            throw new RuntimeException("UserNotFound by id");
        }
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("UserNotFound by id"));
    }

    @Override
    public void deleteById(String id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("UserNotFound by id");
        }
    }
}
