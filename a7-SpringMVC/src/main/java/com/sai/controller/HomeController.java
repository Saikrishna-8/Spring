package com.sai.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.model.User;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView mod=new ModelAndView("home");
		
		User user=new User();
		mod.addObject("user", user);
		
		
		Map<String, String> selectMap=new HashMap<>();
		selectMap.put("India", "India");
		selectMap.put("Japan", "Japan");
		selectMap.put("Srilanka", "Srilanka");
		selectMap.put("USA", "United States of America");
		selectMap.put("Uk","United Kingdom");
		
		mod.addObject("selectMap", selectMap);
		
		return mod;
	}
	
	@PostMapping("displayUserInfo")
	public ModelAndView test1(/*@ModelAttribute */ @Valid User user, BindingResult result )
	{
		ModelAndView mod=new ModelAndView("displayUserInfo");
		mod.addObject("user", user);
		if(result.hasErrors())
		{
			System.out.println("Has Errors!");
		}
		return mod;
	}
	
	
}
