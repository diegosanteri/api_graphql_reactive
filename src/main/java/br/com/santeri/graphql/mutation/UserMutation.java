package br.com.santeri.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.santeri.model.User;
import br.com.santeri.service.UserService;

public class UserMutation implements GraphQLMutationResolver {
	
    private UserService userService;

    public UserMutation(UserService userService) {
        this.userService = userService;
    }

    public User register(final String email, final String password, final String firstName, final String lastName) {
    	
        return userService.save(User.builder()
                                        .firstName(firstName)
                                        .email(email)
                                        .lastName(lastName)
                                        .password(password)
                                        .build());
    }
}