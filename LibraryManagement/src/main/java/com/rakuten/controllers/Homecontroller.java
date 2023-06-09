package com.rakuten.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homecontroller {
	@RequestMapping("/login")
	public String login() {
		return "login";


	//*@RequestMapping("/addauthors")
	//public String defaultpage() {
		///return "adduthors";
	//}////*


	/*@RequestMapping("/addbooks")
	public String addbooks() {
		return "addbooks";
	}*/


	/*@RequestMapping("/addpublishers")
	public String addpublishers() {
		return "addpublishers";
	}

	@RequestMapping("/addusers")
	public String addusers() {
		return "addusers";
	}
	///@RequestMapping("/authorr")
	//public String authorrecords() {
		//return "authorrecords";///
	//}
	/*@RequestMapping("/bookinventory")
	public String bookinventory() {
		return "bookinventory";
	}
	@RequestMapping("/issuedbooks")
	public String issuedbooks() {
		return "issuedbooks";
	}
	@RequestMapping("/lendhistory")
	public String lendhistory() {
		return "lendhistory";
	}
	
	@RequestMapping("/login")
				public String login() {
					return "login";
	
	
	
	
	@RequestMapping("/lendrequestlist")
	public String lendrequestlist() {
		return "lendrequestlist";
	}
	@RequestMapping("/lentlist")
	public String lentlist() {
		return "lentlist";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	//*@RequestMapping("/publishrecords")
	   //public String publishrecords() {
		//return "publicrecords";*/
	//}
	//@RequestMapping("/records")
	//public String records() {
		//return "records";
	//}
	///@RequestMapping("/userecords")
	////public String userrecords() {
		///return "userecords";
	//}
	////@RequestMapping("/viewbooks")
	///public String viewbooks() {
		//return "viewbooks";
	//}
	////@RequestMapping("/userrecords")
	////public String userRecords() {
		//return "userrecords";
	//}

}
}
