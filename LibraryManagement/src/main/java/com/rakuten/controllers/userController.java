package com.rakuten.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakuten.beans.User;
import com.rakuten.dao.UseDaoImpl;
import com.rakuten.dao.UserDao;


	@Controller
	public class userController  {
		
		
		@Autowired
		UseDaoImpl dao;
		
		@RequestMapping("/addusers")
		public String showform(Model model) {
			model.addAttribute("command", new User());
			return "addusers";
		} 
		
		@RequestMapping(value="/saveUsers",method=RequestMethod.POST)
		public String saveUsers(@ModelAttribute("usr")User usr) {
			dao.saveUsers(usr);
			return "redirect:/userecords";
		}
		
		@RequestMapping(value="/editUser/{userid}")
		public String edit(@PathVariable int userid,Model model) {
			User user = dao.getUsersById(userid);
			model.addAttribute("command", user);
			return "edituser";	
		}
		
		@RequestMapping(value="/editsaveUsers",method=RequestMethod.POST)
		public String editsaveUser(@ModelAttribute("usr")User user) {
			dao.updateUsers(user);
			return "redirect:/userecords";
		}
		
		@RequestMapping(value="/deleteUserById/{userid}",method=RequestMethod.POST)
		public String delete(@PathVariable int id) {
			dao.deleteUsers(id);
			return "redirect:/userecords";
			
		}
		
		@RequestMapping(value="/userecords")
		public String viewUsers(Model model) {
			List<User>list = dao.getAllUser();
			model.addAttribute("list", list);
			return "userecords";
			}
		
	}

