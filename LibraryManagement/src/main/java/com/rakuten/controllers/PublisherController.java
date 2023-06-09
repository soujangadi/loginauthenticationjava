package com.rakuten.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakuten.beans.Publisher;
import com.rakuten.dao.PublisherDao;

@Controller
	public class PublisherController {
		//Inject the DAO from XML file we are accessing the data from database related with

		@Autowired
		PublisherDao dao;
		
		@RequestMapping("/addpublishers")
		public String showform(Model model) {
			model.addAttribute("command", new Publisher());
			return "addpublishers";
		}
		@RequestMapping(value="/savePublishers",method=RequestMethod.POST)
		public String savePublishers(@ModelAttribute("pub")Publisher pub) {
			dao.savePublisher(pub);
			return "redirect:/publicrecords";
		}
		
		@RequestMapping(value="/editPublishers/{publisher_id}")
		public String editPublishers(@PathVariable int publishersid, Model model) {			
	
			Publisher pub= dao.getPublisherById(publishersid);
			model.addAttribute("command",pub);
			return "editPublishers";
		}
		
		@RequestMapping(value="/editsavePublishers",method=RequestMethod.POST)
		public String editsavePublishers(@ModelAttribute("pub")Publisher pub) {
			dao.updatePublisher(pub);
			return "redirect:/publicrecords";
		}
		
		@RequestMapping("/publicrecords")
		public String publicrecords(Model model) {
			List<Publisher>list = dao.getAllPublisher();
			model.addAttribute("list", list);
			return "publicrecords";
		}
	}
		
		


