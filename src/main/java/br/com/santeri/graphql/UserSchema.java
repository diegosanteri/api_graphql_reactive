package br.com.santeri.graphql;

import br.com.santeri.graphql.mutation.UserMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.santeri.graphql.query.UserQuery;
import br.com.santeri.service.UserService;

@Configuration
public class UserSchema {
    
    @Bean
    @Autowired
    public UserQuery userQuery(final UserService userService) {

        return new UserQuery(userService);
    }

    @Bean
    @Autowired
    public UserMutation userMutation(final UserService userService) {

        return new UserMutation(userService);
    }
}
