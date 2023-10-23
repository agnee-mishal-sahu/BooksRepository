package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.BookDao;
import com.cg.entity.Book;
import com.cg.repository.BookRepository;

@Service
public class BookService implements BookDao {

	@Autowired
	BookRepository br;
	
	public String addBook(Book book) {
		br.save(book);
		return "Book added successfully....";
	}


	public List<Book> getAllBooks() {
		return br.findAll();
		
	}

	
	public Book getById(int id) {
	    return br.findById(id).get();
		
	}

	
	public String deleteBook(int id) {
	    br.deleteById(id);
		return "Book deleted....";
	}

	
	public String updateBook(Book book) {
		Book b= br.findById(book.getBookId()).get();
		b.setBookname(book.getBookname());
		b.setPrice(book.getPrice());
		b.setAuthor(book.getAuthor());
		br.save(b);
		return "Book updated....";
	}

}
