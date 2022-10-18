<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
.bg-image {
  background-image:url('https://mypcwalls.com/wp-content/uploads/2021/08/Abstract-Wallpaper.jpg');
  filter: blur(4px);
  height: 800px; 
  background-position: relative;
  background-repeat: no-repeat;
  background-size: cover;
}
.row{
  background-color: rgb(0,0,0); 
  background-color: rgba(0,0,0, 0.4); 
  color: white;
  font-weight: bold;
  border: 3px solid rgba(0,0,0, 0.4);;
  position: absolute;
  top:50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  height:500px;
  width: 30%;
  text-align: center;
}
.button{
   background-color: #04AA6D;
   width:120px;
   height:70px;
}
.button:hover {
      color:white;
      background-color:black;
      transition: 0.7s;
  }
 .button:focus {
    outline-color: transparent;
    outline-style:solid;
    box-shadow: 0 0 0 4px blue;
}
</style>
</head>
<body>
   <div class="bg-image"></div>
   <%@include file="header.jsp" %>
   <div class="row">
   <div class="col-sm-4"style="margin-left:35%;margin-top:25%" >
    <span >
        <a href="login.jsp"> <button class="button">Login</button></a>
    </span>
    </div>
    <div class="col-sm-4"style="margin-left:35%;margin-top:15%">
    <span >
        <a href="signup.jsp"><button class="button">Sign Up</button></a>
     </span>
   </div>
   </div>
   <div style="margin-top:16%">
      <%@include file="footer.jsp"%>
   </div>
</body>
</html>