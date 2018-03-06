package br.com.santeri.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.com.santeri.model.Author;
import br.com.santeri.model.Book;
import br.com.santeri.service.AuthorService;

public class BookResolver implements GraphQLResolver<Book> {

    private AuthorService authorService;

    public BookResolver(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author getAuthor(Book book) {
        return authorService.findOne(book.getAuthor().getId());
    }
}
