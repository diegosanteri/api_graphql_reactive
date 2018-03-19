package br.com.santeri.resolver.mutation;

import br.com.santeri.model.Author;
import br.com.santeri.model.Book;
import br.com.santeri.service.AuthorService;
import br.com.santeri.service.BookService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

public class BookMutation implements GraphQLMutationResolver {

    private final AuthorService authorService;
    private final BookService bookService;

    public BookMutation(final AuthorService authorService, final BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    public Book newBook(final String title, final String isbn, final String authorId) {

        final Author author = this.authorService.findOne(authorId);

    	return bookService.save(Book.builder()
                                    .title(title)
                                    .isbn(isbn)
                                    .author(author)
                                    .build());
    }

    public Boolean deleteBook(final String id) {

        return bookService.delete(id);
    }
}