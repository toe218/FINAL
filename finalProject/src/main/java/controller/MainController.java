package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {



	// 자유여행 메인페이지로 이동
//	@RequestMapping(value = "/selfMain", method = RequestMethod.GET)
//	public String selfMain(Model model) {
//		return "self/selfMain";
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("bodyPage", "login.jsp");
		return "main";
	}
	
	//회사 소개 페이지로 이동
	@RequestMapping (value = "/intro", method = RequestMethod.GET)
	public String intro (Model model) {
		return "introPage/introPage";
	}
	

}
