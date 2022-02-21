package com.sai.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		ModelAndView mav=new ModelAndView("home");
		User user=new User();
		mav.addObject("user",user);
		return mav;
	}
	
	@PostMapping("displayUserInfo")
	public ModelAndView test1(@ModelAttribute("user") @Valid User user, BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView mav=new ModelAndView("home");
			mav.addObject("user",user);	
			return  mav;
		}
		else
		{
			ModelAndView mav=new ModelAndView("displayUserInfo");
			return mav;
		}
	}
}
