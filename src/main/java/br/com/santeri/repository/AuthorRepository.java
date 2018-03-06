package br.com.santeri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.santeri.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {
	
}
