package com.coursehistory.crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.MySql.Connection.*;
import com.coursehistory.Model.CourseHistory;

public class CoursesHistory {
      public static int add(CourseHistory c) throws SQLException, ClassNotFoundException {
 		 String query="insert into coursehistory (id,username,course,fee)values(?,?,?,?)";
     	 Connection con=ConnectionProvider.getConnection();
     	 PreparedStatement ps=con.prepareStatement(query);
     	 ps.setInt(1, c.getId());
     	 ps.setString(2,c.getUname());
     	 ps.setString(3, c.getCourse());
     	 ps.setInt(4, c.getFee());
     	 return ps.executeUpdate();
      }
      
      public static List<CourseHistory> getCourseHistory() throws ClassNotFoundException, SQLException {
    	  List<CourseHistory>Data=new ArrayList<>();
    	  String insertQuery="select * from coursehistory";
    	  Connection con=ConnectionProvider.getConnection();
    	  Statement st=con.createStatement();
    	  ResultSet rs=st.executeQuery(insertQuery);
    	  while(rs.next()) {
    		  CourseHistory c=new CourseHistory(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5));
    		  Data.add(c);
    	  }
    	  st.close();
    	  con.close();
    	  return Data;
      }
      public static List<CourseHistory> getCourseHistory(int id) throws ClassNotFoundException, SQLException {
    	  List<CourseHistory>Data=new ArrayList<>();
    	  String insertQuery="select * from coursehistory where id="+id+";";
    	  Connection con=ConnectionProvider.getConnection();
    	  Statement st=con.createStatement();
    	  ResultSet rs=st.executeQuery(insertQuery);
    	  while(rs.next()) {
    		  CourseHistory c=new CourseHistory(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5));
    		  Data.add(c);
    	  }
    	  st.close();
    	  con.close();
    	  return Data;
      }
      
      public static void SetCourseListId(int listid,String course) throws ClassNotFoundException, SQLException {
    	  List<CourseHistory>Data=new ArrayList<>();
    	  String insertQuery="update coursehistory set course= ? where listid= ?";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setString(1, course);
    	  ps.setInt(2, listid);
    	  ps.executeUpdate();
    	  ps.close();
    	  con.close();
    	 
    	  
      }
      public static void Remove(int listid) throws ClassNotFoundException, SQLException {
    	  String insertQuery="Delete from coursehistory where listid= ?";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setInt(1, listid);
    	  ps.executeUpdate();
    	  ps.close();
    	  con.close(); 
      }
      
      public static Boolean verify(CourseHistory C) throws ClassNotFoundException, SQLException {
    	  String insertQuery="select * from coursehistory where id=? and course=?";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setInt(1, C.getId());
    	  ps.setString(2,C.getCourse());
    	  ResultSet rs=ps.executeQuery();
    	  return rs.next();
    	  
      }
      
}

