package com.my_project.my_project.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.my_project.my_project.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    //agregar mas operaciones personalizadas
	Optional<Book> findBookByTitle(String title);
	Optional<Book> deleteBookByTitle(String title);

}
