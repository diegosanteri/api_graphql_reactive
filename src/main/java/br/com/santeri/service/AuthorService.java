package br.com.santeri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santeri.model.Author;
import br.com.santeri.repository.AuthorRepository;

@Service
public class AuthorService {
	
	
	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	public Author findOne(Long id) {
		
		return null;
	}

	public Iterable<Author> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	public Author save(Author author) {
		
		return author;
		
	}

}
