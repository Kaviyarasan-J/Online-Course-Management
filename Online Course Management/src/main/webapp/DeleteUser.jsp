<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.user.crud.UpdateUserData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
   <%
      int id=Integer.parseInt(request.getParameter("id"));
      UpdateUserData.Delete(id);
      response.sendRedirect("UserInfo.jsp");
   %>

</body>
</html>