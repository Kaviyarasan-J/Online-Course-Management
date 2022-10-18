<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.courses.crud.Courses" %>
<%@ page import="com.courses.Model.Course" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body {
  background-image: url('https://img.freepik.com/premium-photo/technology-network-background_34629-304.jpg?w=1060');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
</head>
<body>
    <%@include file="headeruser.jsp" %>
   <%List<Course> Data=Courses.getData();%>
    <div class="col-sm-8" style="margin-top:30px;margin-left:250px;Background-color:white">
	<div class="panel-body">
	<table id="tbl-student" class="table table-responsive table-bordered" cellpadding="0" width="100%">
         <thead>
    	   <th>Course</th>
    	   <th>Fee</th>
    	   <th>Buy</th>
    	</thead>
     <% for(Course C:Data){%>
    	<tr>
    	   <td><%=C.getCourse() %></td>
    	   <td><%=C.getFee()%></td>
    	   <td><a href="Buy.jsp?course=<%=C.getCourse()%>&fee=<%=C.getFee()%>"><button class="btn btn-primary">BUY</button></a></td>
    	</tr>
     <%}%>
     </table>
   </div>
   </div>
 
   

</body>
</html>