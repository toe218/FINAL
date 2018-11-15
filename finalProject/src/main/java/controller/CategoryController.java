package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Continent;
import model.Country;
import service.CategoryService;

public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value="/continent", method=RequestMethod.GET)
	public String continent(Model model) {
		System.out.println("controller1");
		cartegoryService.continentSelect(model);
		return "cartegory/continent";
	}
	@RequestMapping(value="/country", method=RequestMethod.POST)
	public String country(Continent continent, Model model){
		System.out.println("controller2 "+continent.getContinentName());
		cartegoryService.countrySelect(continent, model);
		return "cartegory/country";
	}
	@RequestMapping(value="/city", method=RequestMethod.POST)
	public String city(Country country, Model model) {
		System.out.println("controller3 "+country.getCountryNum());
		System.out.println("controller3 "+country.getCountryName());
		cartegoryService.citySelect(country, model);
		return "cartegory/city";
	}
}
