package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.City;
import model.Continent;
import model.Country;
import repository.cartegoryRepository;

@Service
public class CartegoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	public void continentSelect(Model model) {
		System.out.println("service1 ");
		List<Continent> list = cartegoryRepository.continentSelect();
		model.addAttribute("list", list);
	}
	public void countrySelect(Continent continent, Model model) {
		System.out.println("service2 " + continent.getContinentName());
		List<Country> list = cartegoryRepository.countrySelect(continent);
		model.addAttribute("list", list);
	}
	public void citySelect(Country country, Model model) {
		System.out.println("service3 " + country.getCountryNum());
		System.out.println("service3 " + country.getCountryName());
		List<City> list = cartegoryRepository.citySelect(country);
		model.addAttribute("list", list);
	}
}