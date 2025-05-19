package com.my_project.my_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RedisHash("Book")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Book {

    @Id
    private String bookId;  // Mejor String para las claves en Redis

    private String title;
    private String author;
    private Integer publishedYear;
    private String isbn;
    private String page;
}
