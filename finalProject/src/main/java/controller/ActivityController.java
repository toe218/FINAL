package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Activity;

@Controller
public class ActivityController {
	@RequestMapping(value = "/activity_insert", method = RequestMethod.GET)
	public String activityInsertGet(Activity activity, Model model) {
		model.addAttribute("activity", activity);
		System.out.println("GET INSERT");
		return "product/productinsert";
	}
	@RequestMapping(value = "/activity_insert", method = RequestMethod.POST)
	public String activityInsertPost(Activity activity, Model model) {
		Integer result = null;
		System.out.println("POST INSERT");
		/*result = activityService.insertActivity(activity);*/
		if (result > 0) {
			model.addAttribute("activity", activity);
			System.out.println(activity.getActivityNum());
			return "redirect:mainpage";
		} else {
			return "product/productinsert";
		}
	}
}
