package br.com.santeri.resolver.query;

import br.com.santeri.model.Author;
import br.com.santeri.service.AuthorService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class AuthorQuery implements GraphQLQueryResolver {

    private final AuthorService authorService;

    public AuthorQuery(final AuthorService authorService) {
        this.authorService = authorService;
    }

    public Iterable<Author> findAllAuthors() {
        return authorService.findAll();
    }

    public Long countAuthors() {
        return authorService.count();
    }
}
