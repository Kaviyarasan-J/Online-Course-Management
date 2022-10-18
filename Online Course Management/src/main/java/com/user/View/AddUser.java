package com.user.View;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.user.Model.User;
import com.user.crud.AddUserDB;

public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
		
		User Data=new User(uname,password,type);
		
		try {
			if(!AddUserDB.Verify(Data)) {
				AddUserDB.add(Data,request);
			    session.setAttribute("uname",uname);
				response.sendRedirect("User.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
		rs.include(request, response);
	}

}
