package com.rakuten.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;
import com.rakuten.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
	public class LoginController {
	

		@Autowired
		public UserService userService;

		@RequestMapping(value="/login", method=RequestMethod.GET)
		public ModelAndView showlogin(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mav= new ModelAndView("login");
			mav.addObject("login", new Login());  
			return mav;
		}

		@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
		public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login")Login login) {
			ModelAndView mav=null;
			User user=userService.validateUser(login);

			if (null != user && user.getUsername().equals("admin")) {
				mav = new ModelAndView("lendrequestlist");
				mav.addObject("username", user.getUsername());
			}
			else if(null != user) {
				mav=new ModelAndView("viewbooks");  
				mav.addObject("username", user.getUsername());  
			}

			else {
				mav = new ModelAndView("login");
				mav.addObject("message", "Username or Password is wrong!!");

			}
			return mav;
		}
	}


