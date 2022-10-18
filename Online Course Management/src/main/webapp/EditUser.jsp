<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="com.user.crud.UserData" %>
  <%@ page import="com.user.Model.User" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body {
  background-image: url('https://img.freepik.com/premium-photo/technology-network-background_34629-304.jpg?w=1060');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
<script>
    function fun(){
    	alert("Edited Successfully");
    	return true;
    }
</script>
</head>
<body>
    <%@include file="headeradmin.jsp" %>
    <% int id=Integer.parseInt(request.getParameter("id"));
    User D=UserData.getData(id);
    session.setAttribute("uid",id);%>
    <div class="row" style="margin-left:40% ; margin-top:80px" >
      <div class="col-sm-4">
           <form action="UpdateUser" method="post" onsubmit="return fun()">
               <div align="left">
                <label class="form-label" style="color:white">User Name</label>
                <input type="text" class="form-control" name="uname" placeholder="Enter Name" value="<%=D.getUsername()%>"required>
                </div>
                <br>
               <div align="left">
                 <label class="form-label" style="color:white">Password</label>
                <input type="text" class="form-control" name="password" placeholder="Enter Age" value="<%=D.getPassword()%>"required>
                </div>
                <br>
               <div align="right">
                 <input type="submit" value="Update" class="btn btn-primary">
               </div>
           </form>
           </div>
       </div>
</body>
</html>