package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goLogin(Model model) {
		return "LoginPage.html"; 
	}
	
	@GetMapping("/questions")
	public String goQuestions(Model model) {
		return "questionsPage.html"; 
	}
	
	@GetMapping("/Europe100")
	public String Euro100 (Model model) {
		return "EUQ1.html"; 
	}
}
