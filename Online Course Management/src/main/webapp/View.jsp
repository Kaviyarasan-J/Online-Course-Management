<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.courses.crud.Courses" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color:Black">
    <%@include file="headeruser.jsp" %>
   <% String course=request.getParameter("course");
      String url=Courses.getUrl(course);%>
   <%if(url==null){%>
	   <div style="color:white">Currently Video Not Available...contact admin</div>
   <%}%>
   <%if(url!=null){ %>
   <div align="center" style="margin-top:3%">
     <div align="center"><h1><b style="white"><%=course %></b></h1></div>
     <div>
         <%=url%>
     </div>
   </div>
   <%} %>

</body>
</html>