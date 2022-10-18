package com.coursehistory.View;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

import com.coursehistory.crud.CoursesHistory;

public class UpdateCourseHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int listid=Integer.parseInt(request.getParameter("listid"));
		String Course=request.getParameter("course");

		try {
			CoursesHistory.SetCourseListId(listid, Course);
			response.sendRedirect("ViewPurchasedHistory.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
		rs.include(request, response);
		
	}
}
