package com.sai.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.DAO.AppDAOImpl;
import com.sai.config.AppConfig;
import com.sai.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "sai")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		ModelAndView model = new ModelAndView("home");
		List<User> users = new ArrayList<User>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);

		users = DAO.listUsers();
		model.addObject("users", users);
		context.close();
		return model;
	}
	
	@GetMapping("/")
	public ModelAndView test1(HttpServletResponse response) throws IOException {
		ModelAndView model = new ModelAndView("home");
		List<User> users = new ArrayList<User>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);

		users = DAO.listUsers();
		model.addObject("users", users);
		context.close();
		return model;
	}
	
}
