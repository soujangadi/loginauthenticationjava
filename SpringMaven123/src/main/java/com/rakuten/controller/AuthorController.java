package com.rakuten.controller;



	
	@Controller
	public class AuthorController {
		
		@Autowired
		AuthorDao dao;
		
		@RequestMapping("/addauthors")
		public String showform(Model model) {
			model.addAttribute("command", new authors());
			return "addauthors";
		}
		
		@RequestMapping(value="/saveAuthors",method=RequestMethod.POST)
		public String saveAuthors(@ModelAttribute("auth")authors auth) {
			dao.saveAuthors(auth);
			return "redirect:/viewauthors";
		}
		
		@RequestMapping(value="/editAuthors/{id}")
		public String edit(@PathVariable int id, Model model) {
			authors auth = dao.getauthorsById(id);
			model.addAttribute("command", auth);
			return "editAuthors";
		}
		
		@RequestMapping(value="/editsaveAuthors",method=RequestMethod.POST)
		public String editsaveAuthors(@ModelAttribute("auth")authors auth) {
			dao.updateAuthors(auth);
			return "redirect:/viewauthors";
		}
		
		
		@RequestMapping(value="/viewauthors")
		public String viewAuthors(Model model) {
			List<authors>list = dao.getAllauthors();
			model.addAttribute("list", list);
			return "viewauthors";
			}

	}


}
