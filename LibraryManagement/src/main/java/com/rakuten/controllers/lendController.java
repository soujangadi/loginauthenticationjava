package com.rakuten.controllers;


	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;


	import com.rakuten.dao.LendRequestDao;
	import com.rakuten.beans.Lendlist;
	import com.rakuten.beans.Login;
	import com.rakuten.beans.User;
	import com.rakuten.services.UserService;

	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@Controller
	public class lendController {
		@Autowired
		UserService userService;

		@Autowired
		LendRequestDao lendRequestDao;
		
		@RequestMapping(value="/lendrequestlist")
		public String viewRequest(Model model) {
			List<Lendlist> list = lendRequestDao.getLentRecords();
			model.addAttribute("lendlist",list);
			return "lendrequestlist";
		}
		@RequestMapping(value="/approverequest/{lendid}")
		public String approve(@PathVariable int lendid, Model model) {
			Lendlist lend = lendRequestDao.getLendRequestById(lendid);
			int approve_req = lendRequestDao.lendRequestApproveAction(lend);
			model.addAttribute("command",lend);
			return "redirect:/lendrequestlist";
		}
		
		@RequestMapping(value="/rejectrequest/{lendid}")
		public String reject(@PathVariable int lendid, Model model) {
			Lendlist lend = lendRequestDao.getLendRequestById(lendid);
			int approve_req = lendRequestDao.lendRequestRejectAction(lend);
			model.addAttribute("command",lend);
			return "redirect:/lendrequestlist";
		}

	}



