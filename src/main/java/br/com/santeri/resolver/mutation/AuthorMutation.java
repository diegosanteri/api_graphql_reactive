package br.com.santeri.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.santeri.model.Author;
import br.com.santeri.service.AuthorService;

public class AuthorMutation implements GraphQLMutationResolver {
	
    private AuthorService authorService;

    public AuthorMutation(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author newAuthor(String firstName, String lastName) {
    	
        return authorService.save(Author.builder().build());
    }
}