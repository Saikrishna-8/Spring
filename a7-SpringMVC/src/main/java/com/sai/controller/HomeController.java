package com.sai.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.model.User;

@Controller
public class HomeController {

	ModelAndView glob_home_mod=null;
	@GetMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView mod=new ModelAndView("home");
		
		User user=new User();
		mod.addObject("user", user);	
		
		initForm(mod);
		
		glob_home_mod=mod;
		return mod;
	}
	
	
	private void initForm(ModelAndView mod) {
		
		Map<String, String> selectMap=new HashMap<>();
		selectMap.put("India", "India");
		selectMap.put("Japan", "Japan");
		selectMap.put("Srilanka", "Srilanka");
		selectMap.put("USA", "United States of America");
		selectMap.put("Uk","United Kingdom");
		mod.addObject("selectMap", selectMap);
	}


	@PostMapping("displayUserInfo")
	public ModelAndView test1(@ModelAttribute("user") @Valid User user, BindingResult result )
	{
		ModelAndView mod=new ModelAndView("displayUserInfo");
		mod.addObject("user", user);
		if(result.hasErrors())
		{
			ModelAndView repopulate_mav=new ModelAndView("home");
			initForm(repopulate_mav);
			repopulate_mav.addObject("user",user);
			//glob_home_mod.addObject("user",user);
			System.out.println("Has Errors!");
			return repopulate_mav;
			//return glob_home_mod;
		}
		else
			return mod;
	}
	
	
}
