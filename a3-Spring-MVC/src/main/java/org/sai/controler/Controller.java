package org.sai.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sai.person.Person;

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Controller() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Person> list=new ArrayList<Person>();
		list.add(new Person("sai krishna",22));
		list.add(new Person("jhansi", 23));
		
		request.setAttribute("student", list);
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
		
	}
}
