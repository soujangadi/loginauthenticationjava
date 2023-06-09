package com.Rakuten.Spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/",method =RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Request @ " + locale);
		Date date = new Date();
		DateFormat dateFormat =DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG,locale);
		String formattedDate =dateFormat.format(date);
		model.addAttribute("App.Time",formattedDate);
		return "home";
		
	}
   @RequestMapping(value = "/user", method =RequestMethod.GET)
	public String user(@Validated User user,Model model,Locale locale) {
	   System.out.println("User Page");
	   Date date = new Date();
		DateFormat dateFormat =DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG,locale);
		String formattedDate =dateFormat.format(date);
		model.addAttribute("App.Time",formattedDate);
	   model.addAttribute("User Name: ",user.getUsername());
		return "user";
		
	}

}
