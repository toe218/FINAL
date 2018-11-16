package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.Loginsession;
import service.LoginService;

@Controller
public class MainController {
	@Autowired
	private LoginService loginService;
	// 자유여행 메인페이지로 이동
	@RequestMapping(value = "/selfMain", method = RequestMethod.GET)
	public String selfMain(Model model) {
		return "self/selfMain";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("login controller");
		model.addAttribute("bodyPage", "login.jsp");
		return "main";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login1(Loginsession login, Model model) {
		System.out.println("login controller"+login.getId());
		System.out.println("login controller"+login.getName());
		loginService.comparisonLogin(login, model);
		model.addAttribute("bodyPage", "main.jsp");
		return "main";
	}

}
