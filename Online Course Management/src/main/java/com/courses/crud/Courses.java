package com.courses.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MySql.Connection.*;
import com.courses.Model.Course;
import com.coursehistory.Model.CourseHistory;

public class Courses {
      public static void addCourse(Course c) throws ClassNotFoundException, SQLException {
    	  String insertQuery="insert into courses values(?,?,?);";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setString(1,c.getCourse());
    	  ps.setInt(2, c.getFee());
    	  ps.setString(3, c.getUrl());
    	  ps.executeUpdate();
    	  ps.close();
    	  con.close();
      }
      public static Boolean VerifyCourse(Course c) throws ClassNotFoundException, SQLException {
    	  String insertQuery="select * from courses where course=?;";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setString(1,c.getCourse());
    	  ResultSet rs=ps.executeQuery();
    	  return rs.next();
      }
      
      public static void alterUrl(Course c) throws ClassNotFoundException, SQLException {
    	  String insertQuery="update courses set url=? where course=?;";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setString(1, c.getUrl());
    	  ps.setString(2,c.getCourse());
    	  ps.executeUpdate();
    	  ps.close();
    	  con.close();
      }
      
      public static String getUrl(String s) throws ClassNotFoundException, SQLException {
    	  String insertQuery="select url from courses where course=?;";
    	  Connection con=ConnectionProvider.getConnection();
    	  PreparedStatement ps=con.prepareStatement(insertQuery);
    	  ps.setString(1, s);
    	  ResultSet rs=ps.executeQuery();
    	  if(rs.next()) {
    		  return rs.getString(1);
    	  }
    	  return null;
    	  
      }
      
      public static List<Course> getData() throws ClassNotFoundException, SQLException {
    	  List<Course>Data=new ArrayList<>();
    	  String insertQuery="select * from courses";
    	  Connection con=ConnectionProvider.getConnection();
    	  Statement st=con.createStatement();
    	  ResultSet rs=st.executeQuery(insertQuery);
    	  while(rs.next()) {
    		  Course c=new Course(rs.getString(1),rs.getInt(2),rs.getString(3));
    		  Data.add(c);
    	  }
    	  st.close();
    	  con.close();
    	  return Data;
      }
      
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
