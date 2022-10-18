<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="com.courses.crud.Courses" %>
  <%@ page import="com.courses.Model.Course" %>
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
    <%int listid=Integer.parseInt(request.getParameter("listid")); %>
    
    <div class="row" style="margin-left:40% ; margin-top:80px" >
      <div class="col-sm-4">
           <form action="UpdateCourseHistory" method="post" onsubmit="return fun()">
               <div align="left">
               <label class="form-label"  style="color:white">ListID</label>
               <input type="text" class="form-control" value=<%=listid%> name="listid" readonly>
               </div>
               <br>
               <div align="left">
               <label class="form-label"  style="color:white">Course</label>
                <select class="form-select" aria-label="Default select example" name="course" required>
                      <option selected disabled>Select any option</option>
                      <%List<Course> Co = (List<Course>)session.getAttribute("Course");
                         if(Co!=null){
                             for(Course info:Co){%>
                	             <option value=<%=info.getCourse()%>><%=info.getCourse()%></option>
                         <%   }
                         }%>
                </select>
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