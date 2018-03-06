package br.com.santeri.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.santeri.context.exception.BookNotFoundException;
import br.com.santeri.model.Book;
import br.com.santeri.service.BookService;

public class BookMutation implements GraphQLMutationResolver {

    private BookService bookService;

    public BookMutation(BookService bookService) {
        this.bookService = bookService;
    }

    public Book newBook(String title, String isbn, Integer pageCount, Long authorId) {
    	
    	return bookService.save(Book.builder().build());
    }

    public boolean deleteBook(Long id) {
    	bookService.delete(id);
        return true;
    }

    public Book updateBookPageCount(Integer pageCount, Long id) {
        Book book = bookService.findOne(id);
        if(book == null) {
            throw new BookNotFoundException("The book to be updated was found", id);
        }
        book.setPageCount(pageCount);
        bookService.save(book);
        return book;
    }
}