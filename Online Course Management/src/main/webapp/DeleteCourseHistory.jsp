<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.coursehistory.crud.CoursesHistory"%>
 <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
   <%int listid=Integer.parseInt(request.getParameter("listid"));
     CoursesHistory.Remove(listid); 
     response.sendRedirect("ViewPurchasedHistory.jsp"); %>
</body>
</html>