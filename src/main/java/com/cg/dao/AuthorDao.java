package com.cg.dao;

import java.util.List;

import com.cg.entity.Author;

public interface AuthorDao {
	String addAuthor(Author author);
	List<Author> getAllAuthors();
	String deleteAuthor(int id);

}
