<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.coursehistory.Model.CourseHistory" %>
<%@ page import="com.coursehistory.crud.CoursesHistory" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy</title>
</head>
<body>
   <%String course=request.getParameter("course");
      int id=(int)session.getAttribute("id");
      String uname=(String)session.getAttribute("uname");
      int fee=Integer.parseInt(request.getParameter("fee"));
      CourseHistory c=new CourseHistory(id,uname,course,fee);
      if(!CoursesHistory.verify(c)){
         CoursesHistory.add(c);
      }
      response.sendRedirect("YourCourses.jsp");
      %>
</body>
</html>