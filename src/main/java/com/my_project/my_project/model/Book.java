package com.my_project.my_project.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Book implements Serializable {

    private String bookId;
    private String title;
    private String author;
    private Integer publishedYear;
    private String isbn;
    private String page;
}
