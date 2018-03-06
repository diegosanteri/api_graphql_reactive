package br.com.santeri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santeri.model.Book;
import br.com.santeri.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

	public Book save(Book book) {
		
		return null;
	}

	public void delete(Long id) {
		
	}

	public Book findOne(Long id) {
		
		return null;
	}

}
