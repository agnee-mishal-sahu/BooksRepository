package com.cg.dao;

import java.util.List;

import com.cg.entity.Book;

public interface BookDao {

	String addBook(Book book);
	List<Book> getAllBooks();
	Book getById(int id);
	String deleteBook(int id);
	String updateBook(Book book);
	
}
