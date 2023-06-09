package com.Rakuten;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class welcomeController {

		@RequestMapping("/welcome")
		public String redirect() {

			return "Homepage";
		}
			
			@RequestMapping("/aboutus")
			public String Aboutus() {
				return "Aboutus";
			}

	}



