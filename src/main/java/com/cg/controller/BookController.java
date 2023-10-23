package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.entity.Book;
import com.cg.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bs;
	
	@PostMapping("/")
	public String addBook(@RequestBody Book book) {
		return bs.addBook(book);
	}
	@GetMapping("/")
	public List<Book> getAllBook(){
		return bs.getAllBooks();
	}
	@GetMapping("/{id}")
	public Book getById(@PathVariable("id")int id) {
		return bs.getById(id);
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return bs.deleteBook(id);
	}
	@PutMapping("/update")
	public String update(@RequestBody Book book) {
		return bs.updateBook(book);
	}
	

}
