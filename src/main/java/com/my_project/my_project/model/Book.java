package com.my_project.my_project.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "book")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Book {

    @Id
    private String id;

    private String title;
    private String author;
    private Integer publishedYear;
    private String isbn;
    private String page;
}
