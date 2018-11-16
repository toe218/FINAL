package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import command.Loginsession;
import repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;
	public void comparisonLogin(Loginsession login, Model model) {
		System.out.println("login service"+login.getId());
		System.out.println("login service"+login.getName());
		Loginsession ml = loginRepository.comparisonLogin(login);
		System.out.println("ml"+ml);
		int result = 0;
		if(ml != null) {
			if(!ml.getPassword().equals(login.getPassword())) {
				result = 2;
			}else {
				result = 4;
			}
		}else {
			result = 1;
		}
		System.out.println("result"+result);
		model.addAttribute("result", result);
	}
}
