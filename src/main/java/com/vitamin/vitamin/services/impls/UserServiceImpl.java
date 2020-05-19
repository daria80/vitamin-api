package com.vitamin.vitamin.services.impls;

import com.vitamin.vitamin.models.User;
import com.vitamin.vitamin.repositories.UserRepository;
import com.vitamin.vitamin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        } else {
            throw new RuntimeException("UserNotFound by id");
        }
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("UserNotFound by id"));
    }

    @Override
    public void deleteById(long id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("UserNotFound by id");
        }
    }
}
