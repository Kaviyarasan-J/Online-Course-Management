package com.courses.View;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.courses.Model.Course;
import com.courses.crud.Courses;


public class AddCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String course=request.getParameter("course");
		int fee=Integer.parseInt(request.getParameter("fee"));
		String url=request.getParameter("url");
		
		Course Data=new Course(course,fee,url);
		
		try {
			if(!Courses.VerifyCourse(Data)) {
			Courses.addCourse(Data);
			List<Course> C=new ArrayList<>();
			C=Courses.getData();
			session.setAttribute("Course",C);
			response.sendRedirect("Admin.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
		rs.include(request, response);
	}

}
