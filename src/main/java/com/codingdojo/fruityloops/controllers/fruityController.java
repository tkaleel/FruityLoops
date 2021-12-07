package com.codingdojo.fruityloops.controllers;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.fruityloops.models.fruityModel;

@Controller
public class fruityController {
	@RequestMapping("/")
	public String index (Model model) {
		
		ArrayList<fruityModel> fruits = new ArrayList<fruityModel>();
		fruits.add(new fruityModel("Kiwi", 1.5));
		fruits.add(new fruityModel("Mango", 2.0));
		fruits.add(new fruityModel("Goji Berries", 4.0));
		fruits.add(new fruityModel("Guava", .75));
		
		model.addAttribute("fruits", fruits);
		
		return "index.jsp";
	}

}
