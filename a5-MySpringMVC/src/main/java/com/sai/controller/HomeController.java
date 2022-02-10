package com.sai.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	/*@RequestMapping("printhello")
	public String test2(@RequestParam("firstname") String firstname,Model model)
	{
		model.addAttribute("name", firstname);
		return ("hello");
	}
	*/
	@RequestMapping("/printhello")
	public ModelAndView test2(@RequestParam("firstname") String firstname)
	{
		ModelAndView modelandview=new ModelAndView("hello");
		
		modelandview.addObject("date",new Date());
		
		List<String> team1=new ArrayList<String>();
		team1.add("SAI KRISHNA");
		team1.add("Jhansi");
		team1.add("SAIDULU");
		modelandview.addObject("team",team1);
		modelandview.addObject("name", firstname);
		return modelandview;
	}
	
	
}
