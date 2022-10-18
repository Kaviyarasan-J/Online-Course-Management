package com.user.View;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.user.crud.UpdateUserData;

public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String name=request.getParameter("uname");
		String password=request.getParameter("password");
		int id=(int)session.getAttribute("uid");
		
		try {
			UpdateUserData.update(id, name, password);
			response.sendRedirect("UserInfo.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
		rs.include(request, response);
	}

}
