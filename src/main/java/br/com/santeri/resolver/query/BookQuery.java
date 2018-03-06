package br.com.santeri.resolver.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.santeri.model.Book;
import br.com.santeri.repository.BookRepository;

public class BookQuery implements GraphQLQueryResolver {

    private BookRepository bookRepository;

    public BookQuery(BookRepository bookRepository) {
    	
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
    	
        return bookRepository.findAll();
    }

    public Long countBooks() {
    	
        return bookRepository.count();
    }
}
