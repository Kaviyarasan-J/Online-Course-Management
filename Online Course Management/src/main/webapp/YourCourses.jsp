<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <%@ page import="com.coursehistory.crud.CoursesHistory" %>
 <%@ page import="com.coursehistory.Model.CourseHistory" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CourseAvailable</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
  <% int id=(int)session.getAttribute("id");
  List<CourseHistory> Data=CoursesHistory.getCourseHistory(id);%>
  <div class="col-sm-8" style="margin-top:30px;margin-left:250px">
	<div class="panel-body">
	<table id="tbl-student" class="table table-responsive table-bordered" cellpadding="0" width="100%">
         <thead>
    	   <th>Course</th>
    	   <th>View</th>
    	</thead>
     <% for(CourseHistory C:Data){%>
    	<tr>
    	   <td><%=C.getCourse() %></td>
    	   <td><a href="View.jsp?course=<%=C.getCourse()%>"><button class="btn btn-primary">View</button></a></td>		
       </tr>
     <%}%>
     </table>
   </div>
   </div>

</body>
</html>