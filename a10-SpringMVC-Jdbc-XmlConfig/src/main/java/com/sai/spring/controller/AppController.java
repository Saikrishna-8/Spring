package com.sai.spring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sai.spring.DAO.AppDAOImpl;
import com.sai.spring.model.User;

@Controller
public class AppController {
	
	
	@GetMapping("/")
	public ModelAndView home1(HttpServletResponse res) throws IOException
	{
		ModelAndView mav=new ModelAndView("view1");
		return mav;
	}
	
	/*@RequestMapping("sai")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("/webapp/WEB-INF/dispatcher-servlet.xml");
	
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		
		users = DAO.listUsers();
        model.addObject("users", users);
		context.close();
		return model;
	}
	*/
	
}
