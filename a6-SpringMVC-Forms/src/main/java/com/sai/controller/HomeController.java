package com.sai.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.model.User;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		ModelAndView modelandview = new ModelAndView("home");
		
		Map<String, String> genderMap=new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female","Female");
		modelandview.addObject("genderMap", genderMap);
		
		
		List<String> genderList=new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		genderList.add("Prefered not say");
		modelandview.addObject("genderList",genderList);
		
		User user = new User();
		modelandview.addObject("user", user);
		
		return modelandview;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user)
	{
		ModelAndView modelandview=new ModelAndView("displayUserInfo");
		//System.out.println(user);	
		modelandview.addObject("fs", "Form Submission is Sucessful");
		
		
		return modelandview;
	}

}
