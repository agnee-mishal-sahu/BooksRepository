package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Author;
import com.cg.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	AuthorService as;
	@PostMapping("/")
	public String addAuthor(@RequestBody Author author) {
		return as.addAuthor(author);
	}
	
	@GetMapping("/")
	public List<Author> getAllAuthor(){
		return as.getAllAuthors();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return as.deleteAuthor(id);
	}
	
	
}
