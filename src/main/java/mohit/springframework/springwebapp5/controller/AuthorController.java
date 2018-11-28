package mohit.springframework.springwebapp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mohit.springframework.springwebapp5.repositories.AuthorRepository;

@Controller
public class AuthorController {
	
	AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}



	@RequestMapping("/authors")
	public String getAuthors(Model model)
	{
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}

}
