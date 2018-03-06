package br.com.santeri.schema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.santeri.resolver.mutation.AuthorMutation;
import br.com.santeri.resolver.query.AuthorQuery;
import br.com.santeri.service.AuthorService;
import br.com.santeri.service.BookService;

@Configuration
public class AuthorSchema {
    
    @Bean
    @Autowired
    public AuthorQuery authorQuery(AuthorService authorService, BookService bookService) {
        return new AuthorQuery(authorService, bookService);
    }

    @Bean
    @Autowired
    public AuthorMutation authorMutation(AuthorService authorService) {
        return new AuthorMutation(authorService);
    }
}
