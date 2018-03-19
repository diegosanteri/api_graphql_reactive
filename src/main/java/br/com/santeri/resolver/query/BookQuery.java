package br.com.santeri.resolver.query;

import br.com.santeri.model.Book;
import br.com.santeri.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.stream.Collectors;

public class BookQuery implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public BookQuery(final BookRepository bookRepository) {
    	
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
    	
        return bookRepository.findAll()
                                .toStream()
                                .collect(Collectors.toList());
    }

    public Long countBooks() {
    	
        return bookRepository.count().block();
    }
}
