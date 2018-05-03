package com.basicspringproject.fullstackdemo.dao;

import com.basicspringproject.fullstackdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserDao extends JpaRepository<User, Serializable>{
}
