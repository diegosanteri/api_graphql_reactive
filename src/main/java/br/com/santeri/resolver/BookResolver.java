package br.com.santeri.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.com.santeri.model.Author;
import br.com.santeri.model.Book;
import br.com.santeri.service.AuthorService;

public class BookResolver implements GraphQLResolver<Book> {

    private final AuthorService authorService;

    public BookResolver(final AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author getAuthor(final Book book) {

        return authorService.findOne(book.getAuthor().getId());
    }
}
