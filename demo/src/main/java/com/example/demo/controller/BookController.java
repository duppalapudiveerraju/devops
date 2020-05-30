package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.Bookrepo;

@RestController
public class BookController {
	

	
	@Autowired
	Bookrepo bookrepo;

	
	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book) {
	
		
		bookrepo.save(book);
		return " Book details save with id :"+book.getId();
	}
	
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		
		return bookrepo.findAll();
	}
	@GetMapping("/getbook/{id}")
	public Optional<Book> getBooksbyId(@PathVariable int id){
		return bookrepo.findById(id);
	}
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		bookrepo.deleteById(id);
		return "book is deleted id: "+id;
	}
	
	@GetMapping("")
	public String queryExample() {
		return null;
		
	}
}
