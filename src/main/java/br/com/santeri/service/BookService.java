package br.com.santeri.service;

import br.com.santeri.model.Book;
import br.com.santeri.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	private final static Logger LOGGER = LoggerFactory.getLogger(BookService.class);

	private final BookRepository bookRepository;
	
	@Autowired
	public BookService(final BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

	public Book save(final Book book) {
		
		return bookRepository.save(book).block();
	}

	public boolean delete(final String id) {

		try {

			bookRepository.deleteById(id).block();
			return true;
		} catch(RuntimeException e) {

			LOGGER.error("Error has happened while deleting book", e);
			return false;
		}
	}

	public Book findOne(final String id) {
		
		return bookRepository.findById(id).block();
	}

}
