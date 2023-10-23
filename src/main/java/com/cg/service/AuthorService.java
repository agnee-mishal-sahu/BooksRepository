package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AuthorDao;
import com.cg.entity.Author;
import com.cg.repository.AuthorRepository;

@Service
public class AuthorService implements AuthorDao{

	@Autowired
	AuthorRepository ar;
	
	public String addAuthor(Author author) {
		ar.save(author);
		return "Author added successfully....";
	}

	
	public List<Author> getAllAuthors() {
		return ar.findAll();
		
	}

	
	public String deleteAuthor(int id) {
		ar.deleteById(id);
		return "Author deleted....";
	}

}
