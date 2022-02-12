package com.asparts.reactdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asparts.reactdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
