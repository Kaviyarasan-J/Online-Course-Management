<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.user.Model.User" %>
<%@ page import="com.user.crud.UserData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body {
  background-image: url('https://shorturl.at/cnOP7');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
</head>
<body>

    <div style="margin-left:70%;margin-top:3%">
    <a href="Admin.jsp"><button class="btn btn-primary">Go Home</button></a>
    </div>
	<div class="col-sm-8" style="margin-top:30px;margin-left:250px">
		<div class="panel-body">
			<table id="tbl-student" class="table table-responsive table-bordered"
				cellpadding="0" width="100%">
				<thead>
					<tr>
					    <th>ID</th>
						<th>User Name</th>
						<th>Password</th>
						<th>Type</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
					<%
					    List<User> D=UserData.getData();
				        for(User info:D){
					%>
					<tr>
					  <td><%=info.getId() %></td>
					  <td><%=info.getUsername() %></td>
					  <td><%=info.getPassword() %></td>
					  <td><%=info.getType() %></td>
					  <td><a href="EditUser.jsp?id=<%=info.getId()%>"><button class="btn btn-success">Edit</button></a></td>
					  <td><a href="DeleteUser.jsp?id=<%=info.getId()%>"><button onclick="alert('Deleted Successfully')" class="btn btn-danger">Delete</button></a> </td>
					</tr>
					  <%} %>	  
			</table>
		</div>
	</div>
</body>
</html>