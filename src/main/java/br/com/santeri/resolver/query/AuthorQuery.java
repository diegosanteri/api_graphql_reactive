package br.com.santeri.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.santeri.model.Author;
import br.com.santeri.service.AuthorService;
import br.com.santeri.service.BookService;

public class AuthorQuery implements GraphQLQueryResolver {

    private AuthorService authorService;

    public AuthorQuery(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
    }

    public Iterable<Author> findAllAuthors() {
        return authorService.findAll();
    }

    public Long countAuthors() {
        return authorService.count();
    }
}
