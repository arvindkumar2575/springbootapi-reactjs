package com.arvindkumar2575.springbootapi.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arvindkumar2575.springbootapi.entities.User;
import com.arvindkumar2575.springbootapi.repositories.UserRepository;
import com.arvindkumar2575.springbootapi.services.UserService;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getUser'");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getUser'");
        return userRepository.findById(id);
    }
    
}
