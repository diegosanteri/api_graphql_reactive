package br.com.santeri.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder(builderClassName="Builder")
@JsonDeserialize(builder = Book.Builder.class) 
@EqualsAndHashCode(exclude = {"author"})
@Document
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    private final String id;
    private final String title;
    private final String isbn;
    private final Author author;
}
