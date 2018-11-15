package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value = "/pkgmain", method = RequestMethod.GET)
	public String handleStep1(Model model) {
		return "pkg/pkgmain";

	}

	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String handleStep2(Model model) {
		return "map";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String handleStep3(Model model) {
		return "member/login";

	}
	
	@RequestMapping(value="/mainpage1", method = RequestMethod.GET)
	public String mainPage(Model model) {
		return "mainPage/mainPage";
	}

}
