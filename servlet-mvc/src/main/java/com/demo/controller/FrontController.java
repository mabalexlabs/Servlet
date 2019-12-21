package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.User;
import com.demo.service.UserServiceImpl;

@WebServlet("/users")
public class FrontController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7115787786079099037L;
	UserServiceImpl userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);

		String name = req.getParameter("name");

		resp.setContentType("text/json");

		StringBuilder str = new StringBuilder();

		List<User> list = userService.getAllUsers();
		str.append("[");
		list.forEach(user -> {
			str.append("{\"name\" : \"").append(user.getUserName()).append("\"},");
		});
		str.deleteCharAt(str.length() - 1);
		str.append("]");

		PrintWriter writer = resp.getWriter();
		writer.write(str.toString());
		writer.flush();
	}
}