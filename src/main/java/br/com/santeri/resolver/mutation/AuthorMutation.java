package br.com.santeri.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.santeri.model.Author;
import br.com.santeri.service.AuthorService;

public class AuthorMutation implements GraphQLMutationResolver {
	
    private final AuthorService authorService;

    public AuthorMutation(final AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author newAuthor(final String firstName, final String lastName) {
    	
        return authorService.save(Author.builder()
                                        .firstName(firstName)
                                        .lastName(lastName)
                                        .build());
    }
}