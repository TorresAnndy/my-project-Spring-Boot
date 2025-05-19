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
    
    // obtener todos los libros
    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    
    // crear
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    
    // buscar por Title
    public Optional<Book> findBookByTitle(String title){
        return bookRepository.findBookByTitle(title);
    }
    
    // buscar por Id
    public Optional<Book> findBookById(String id){
        return bookRepository.findById(id);
    }
    
    // borrar por title
    public void deleteBookByTitle(String title){
        Optional<Book> deleteBook = bookRepository.findBookByTitle(title);
        deleteBook.ifPresent(bookRepository::delete);
    }
    
    // actualizar
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    
    // borrar
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
