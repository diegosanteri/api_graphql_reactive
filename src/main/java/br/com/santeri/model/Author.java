package br.com.santeri.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder(builderClassName="Builder")
@JsonDeserialize(builder = Author.Builder.class)
@Document
@AllArgsConstructor
public class Author implements Serializable {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;
}
