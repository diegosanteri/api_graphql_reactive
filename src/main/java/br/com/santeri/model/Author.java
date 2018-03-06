package br.com.santeri.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(builderClassName="Builder")
@JsonDeserialize(builder = Author.Builder.class) 
@Document
public class Author {
	
    private Long id;
    private String firstName;
    private String lastName;
}
