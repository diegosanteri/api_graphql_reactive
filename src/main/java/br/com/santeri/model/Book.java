package br.com.santeri.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(builderClassName="Builder")
@JsonDeserialize(builder = Book.Builder.class) 
@EqualsAndHashCode(exclude = {"author"})
@Document
public class Book {

    private Long id;
    private String title;
    private String isbn;
    private int pageCount;
    private Author author;
}
