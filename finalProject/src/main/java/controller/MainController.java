package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {



	// 자유여행 메인페이지로 이동
	@RequestMapping(value = "/selfMain", method = RequestMethod.GET)
	public String selfMain(Model model) {
		return "self/selfMain";
	}
	@RequestMapping(value = "/mainpage", method = RequestMethod.GET)
	public String mainpage(Model model) {
		return "include_main/main";
	}

}
