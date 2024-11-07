package com.shop.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unused.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    
}