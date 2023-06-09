package com.macbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/default")
	public String defaultpage() {
		return "default";
	}
}
