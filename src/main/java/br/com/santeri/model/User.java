package br.com.santeri.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder(builderClassName="Builder")
@JsonDeserialize(builder = User.Builder.class)
@Document
public class User {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private List<User> users;
}