package br.com.santeri.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.com.santeri.model.User;
import br.com.santeri.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserResolver implements GraphQLResolver<User> {

    private final UserService userService;

    public UserResolver(final UserService userService) {
        this.userService = userService;
    }


    public List<User> getUsers(final User user) {

        return userService.findUsers(user.getUsers()
                                         .stream()
                                         .map(u -> u.getId())
                                         .collect(Collectors.toList()));
    }
}


