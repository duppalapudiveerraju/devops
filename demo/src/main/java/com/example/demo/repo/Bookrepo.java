package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Book;

public interface Bookrepo  extends MongoRepository<Book, Integer>{

}
