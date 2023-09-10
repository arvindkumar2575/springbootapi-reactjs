package com.arvindkumar2575.springbootapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arvindkumar2575.springbootapi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}
