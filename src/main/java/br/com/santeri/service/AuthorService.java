package br.com.santeri.service;

import br.com.santeri.model.Author;
import br.com.santeri.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {

	private final AuthorRepository authorRepository;
	
	@Autowired
	public AuthorService(final AuthorRepository authorRepository) {

		this.authorRepository = authorRepository;
	}
	
	public Author findOne(final String id) {
		
		return authorRepository.findById(id).block();
	}

	public List<Author> findAll() {

		return authorRepository.findAll()
									.toStream()
									.collect(Collectors.toList());
	}

	public Long count() {

		return authorRepository.count().block();
	}

	public Author save(final Author author) {
		
		return authorRepository.save(author).block();
		
	}

}
