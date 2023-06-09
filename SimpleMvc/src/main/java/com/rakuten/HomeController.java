package com.rakuten;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	 @RequestMapping("/registration")
	public String registrationForm(Model model) {
		User s= new User();
		model.addAttribute("user", s);
		return "registration";
		
	}
 @RequestMapping("/submitform")
	public String submitForm(@ModelAttribute("user")User usr) {
		return "confirmation";
	}

}
