package com.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.BookStore.entity.Book;
//import com.BookStore.service.BookService;

import java.util.*;

@Controller
public class BookController {
	
	@Autowired
//	private BookService service;
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}

	@GetMapping("/book_register")
	public String BookRegister() {
		return "BookRegister";
	}
	
//	@GetMapping("/available_books")
//	public ModelAndView getAllBook() {
//		List<Book> list = service.getAllBook();
//		
//		return new ModelAndView("BookList", "book", list);
//	}
	
//	@PostMapping("/save")
//	public String addBook(@ModelAttribute Book b) {
//		service.save(b);
//		return "redirect:/available_books";
//	}
//	
//	@RequestMapping("/editBook/{id}")
//	public String editBook(@PathVariable("id") int id, Model model) {
//		Book b = service.getBookById(id);
//		model.addAttribute("book", b);
//		return "BookEdit";
//	}
//	
//	@RequestMapping("/deleteBook/{id}")
//	public String deleteBook(@PathVariable("id") int id) {
//		service.deleteById(id);
//		return "redirect:/available_books";
//	}
}
