<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.coursehistory.Model.CourseHistory" %>
<%@ page import="com.courses.crud.Courses" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informations</title>
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
     <%@include file="headeradmin.jsp" %>
	<div class="col-sm-8" style="margin-top:30px;margin-left:250px;background-color:white">
		<div class="panel-body">
			<table id="tbl-student" class="table table-responsive table-bordered"
				cellpadding="0" width="100%">
				<thead>
					<tr>
					    <th>ID</th>
						<th>User Name</th>
						<th>Course</th>
						<th>Fee</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
					<%
					    List<CourseHistory> D=Courses.getCourseHistory();
				        for(CourseHistory info:D){
					%>
					<tr>
					  <td><%=info.getId() %>
					  <td><%=info.getUname() %></td>
					  <td><%=info.getCourse()%></td>
					  <td><%=info.getFee()%></td>
					  <td><a href="EditCourseHistory.jsp?listid=<%=info.getListid()%>"><button class="btn btn-success">Edit</button></a></td>
					  <td><a href="DeleteCourseHistory.jsp?listid=<%=info.getListid()%>"><button onclick="alert('Deleted Successfully')" class="btn btn-danger">Delete</button></a> </td>
					</tr>
					  <%} %>	  
			</table>
		</div>
	</div>
</body>
</html>