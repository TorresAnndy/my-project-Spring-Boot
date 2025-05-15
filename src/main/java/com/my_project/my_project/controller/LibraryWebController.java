package com.my_project.my_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my_project.my_project.model.Book;
import com.my_project.my_project.service.BookService;

@Controller
@RequestMapping("/library")
public class LibraryWebController {
    
    @Autowired
	BookService bookService;
	
	@RequestMapping("/books")
	public String getWeb(Model containerToView ){
		
		containerToView.addAttribute("books", bookService.getAllBooks());
		containerToView.addAttribute("Name", "http://library");
		containerToView.addAttribute("Direccion", "Ecuador");
		
		return "showBooks";
	}

	//Crear un libro nuevo
    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book created = bookService.createBook(book);
        return ResponseEntity.ok(created);
    }
    
}
