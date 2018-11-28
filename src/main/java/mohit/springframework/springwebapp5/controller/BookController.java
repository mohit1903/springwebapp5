package mohit.springframework.springwebapp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mohit.springframework.springwebapp5.repositories.BookRepository;

@Controller
public class BookController {
	
	BookRepository bookrepository;
	
	
	public BookController(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

   @RequestMapping("/books")
	public String getBooks(Model model)
	{
		model.addAttribute("books", bookrepository.findAll());
		return "books";
		
	}

}
