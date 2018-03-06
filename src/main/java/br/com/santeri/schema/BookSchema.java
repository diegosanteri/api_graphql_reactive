package br.com.santeri.schema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.santeri.repository.BookRepository;
import br.com.santeri.resolver.BookResolver;
import br.com.santeri.resolver.mutation.BookMutation;
import br.com.santeri.resolver.query.BookQuery;
import br.com.santeri.service.AuthorService;
import br.com.santeri.service.BookService;

@Configuration
public class BookSchema {

    @Bean
    @Autowired
    public BookResolver bookResolver(AuthorService authorService) {
        return new BookResolver(authorService);
    }

    @Bean
    @Autowired
    public BookQuery bookQuery(BookRepository bookRepository) {
        return new BookQuery(bookRepository);
    }

    @Bean
    @Autowired
    public BookMutation bookMutation(AuthorService authorService, BookService bookService) {
        return new BookMutation(bookService);
    }
}
