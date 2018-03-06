package br.com.santeri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.santeri.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	
}
