package com.my_project.my_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_project.my_project.model.Book;
import com.my_project.my_project.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	// Obtener todos los libros
	public Iterable<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	// Crear libro
	public Book createBook(Book book) {
		
		return bookRepository.save(book);
	}
	
	// Buscar por título
	public Optional<Book> findBookByTitle(String title){
		return bookRepository.findBookByTitle(title);
	}
	
	// Buscar por ID (ajustado a String)
	public Optional<Book> findBookById(String id){
		return bookRepository.findById(id);
	}
	
	// Borrar por título
	public Optional<Book> deleteBookByTitle(String title){
		return bookRepository.deleteBookByTitle(title);
	}
	
	// Actualizar libro
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	// Borrar libro
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}
}
