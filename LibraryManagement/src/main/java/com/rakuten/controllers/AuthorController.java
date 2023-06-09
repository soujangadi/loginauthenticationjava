package com.rakuten.controllers;


	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.rakuten.beans.author;
	import com.rakuten.dao.AuthorDao;

	@Controller
	public class AuthorController {
		//Inject the DAO from XML file we are accessing the data from database related with

		@Autowired
		AuthorDao dao;
		
		@RequestMapping("/addauthors")
		public String showform(Model model) {
			model.addAttribute("command",new author());
			return "addauthors";
		}
		/*
		 * to save the user input into the database.Insert Query -save Employee()
		 */
		@RequestMapping(value="/saveauthor",method=RequestMethod.POST)
		public String saveauthor(@ModelAttribute("auth")author  auth) {
			dao.saveAuthors(auth);
			return "redirect:/Viewauthor";
		}
		@RequestMapping(value="/Viewauthor")
		public String viewauthor(Model model) {
			List<author>list = dao.getAllAuthor();
			model.addAttribute("list",list);
			return "Viewauthor";
		}
		
		@RequestMapping(value="/addauthor/{authorid}")
		public String edit(@PathVariable int authorid,Model model) {
			author auth=dao.getAuthorById(authorid);
			model.addAttribute("command", auth);
			return "addauthor";
		}
		
		@RequestMapping(value="/editsaveauthor",method=RequestMethod.POST)
		public String editsaveauthor(@ModelAttribute("auth")author auth) {
			dao.updateAuthor(auth);
			return "redirect:/Viewauthor";
		}
		
		

	}

	


