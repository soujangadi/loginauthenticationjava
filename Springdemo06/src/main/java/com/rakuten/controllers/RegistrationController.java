package com.rakuten.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rakuten.beans.User;
import com.rakuten.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView showRegisterpage(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mav= new ModelAndView("register");
		mav.addObject("User",new User());
		return mav;
	}
	
	@RequestMapping(value="/registerProcess",method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("user")User user) {
		
	
	userService.register(user);
	return new ModelAndView("welcome","firstname",user.getFirstname());
	
	}

}
