package com.rakuten;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
@RequestMapping("/welcome")
public String redirect1() {
	return "Homepage";

}
@RequestMapping("/aboutus")
public String redirect2() {
	return "aboutus";
}


}


