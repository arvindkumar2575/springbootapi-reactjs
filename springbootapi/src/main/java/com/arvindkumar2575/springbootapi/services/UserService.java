package com.arvindkumar2575.springbootapi.services;

import java.util.List;
import java.util.Optional;

import com.arvindkumar2575.springbootapi.entities.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    Optional<User> getUser(Long id);
}
