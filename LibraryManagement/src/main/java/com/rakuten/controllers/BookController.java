package com.rakuten.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakuten.beans.Books;
import com.rakuten.dao.BookDao;

public class BookController {
	@Controller
	public class BooksController {
		@Autowired
		 BookDao dao;
		 
		 
		 @RequestMapping("/addbooks")
		 public String addbooks(Model model) {
			 model.addAttribute("command", new Books());
		     return "addbooks";
		 }
		 	 	
		 @RequestMapping(value = "/saveBooks", method = RequestMethod.POST)
		 	public String saveBooks(@ModelAttribute("bk") Books bk) {
		 	    dao.saveBooks(bk);
		 	    return "redirect:/bookinventory";
		 	}
		 	
		 @RequestMapping(value = "/editBooks/{bookid}")
		 	    public String editBooks(@PathVariable int bookid, Model model) {
		 		 Books bk = dao.getBooksById(bookid);
		 	        model.addAttribute("command", bk);
		 	        return "editBooks";
		 	    }
		 	    
		 	 @RequestMapping(value = "/editsaveBooks", method = RequestMethod.POST)
		 	    public String editsaveBooks(@ModelAttribute("bk") Books bk) {
		 	        dao.updateBooks(bk);
		 	        return "redirect:/bookinventory";  // Add the common request mapping prefix
		 	    }
		 	    
		 	 	
		 	@RequestMapping(value="/bookinventory")
		 	public String bookinventory(Model model) {
		 		List<Books>List = dao.getAllBooks();
		 		model.addAttribute("list", List);
		 		return "booksinventory";
		 		}
	}
}



