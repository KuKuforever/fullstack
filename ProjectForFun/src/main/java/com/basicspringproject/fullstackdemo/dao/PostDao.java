package com.basicspringproject.fullstackdemo.dao;

import com.basicspringproject.fullstackdemo.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PostDao extends JpaRepository<Post, Serializable>{

}