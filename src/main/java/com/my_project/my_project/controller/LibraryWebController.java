package com.my_project.my_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.my_project.my_project.model.Book;
import com.my_project.my_project.service.BookService;

@Controller
@RequestMapping("/library")
public class LibraryWebController {
    
    @Autowired
    BookService bookService;
    
    // Método para mostrar todos los libros en vista web (HTML)
    @RequestMapping("/books")
    public String getWeb(Model containerToView ){
        containerToView.addAttribute("books", bookService.getAllBooks());
        containerToView.addAttribute("Name", "http://library");
        containerToView.addAttribute("Direccion", "Ecuador");
        return "showBooks";
    }

    // Crear un libro nuevo (POST)
    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book created = bookService.createBook(book);
        return ResponseEntity.ok(created);
    }

    // Buscar libro por id (GET)
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable String id) {
        Optional<Book> bookOpt = bookService.findBookById(id);
        if (bookOpt.isPresent()) {
            return ResponseEntity.ok(bookOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Actualizar libro (PUT)
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {
        Optional<Book> existingBook = bookService.findBookById(id);
        if (existingBook.isPresent()) {
            Book bookToUpdate = existingBook.get();

            // Actualiza solo los campos que quieres, ejemplo:
            bookToUpdate.setTitle(book.getTitle());
            bookToUpdate.setAuthor(book.getAuthor());
            bookToUpdate.setPublishedYear(book.getPublishedYear());
            bookToUpdate.setIsbn(book.getIsbn());
            bookToUpdate.setPage(book.getPage());

            Book updated = bookService.updateBook(bookToUpdate);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar libro por id (DELETE)
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable String id) {
        Optional<Book> existingBook = bookService.findBookById(id);
        if (existingBook.isPresent()) {
            bookService.deleteBook(existingBook.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
