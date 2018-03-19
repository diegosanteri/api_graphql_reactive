package br.com.santeri.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.santeri.model.User;
import br.com.santeri.service.UserService;

import java.util.List;

public class UserQuery implements GraphQLQueryResolver {

    private final UserService userService;

    public UserQuery(final UserService userService) {
        this.userService = userService;
    }

    public List<User> findAllUsers() {
        return userService.findAll();
    }

    public User findUser(final String id) {
        return userService.findOne(id);
    }
}
