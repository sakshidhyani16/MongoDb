package com.example.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.entity.Book;

public interface BookRepository extends MongoRepository<Book, Long> {
	
	Book findById(long id);

}
