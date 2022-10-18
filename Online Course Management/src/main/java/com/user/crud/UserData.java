package com.user.crud;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MySql.Connection.ConnectionProvider;
import com.user.Model.User;

public class UserData {
     public static boolean validate(User Data,HttpServletRequest request) throws ClassNotFoundException, SQLException{
    	 HttpSession session=request.getSession();
    	 String insertQuery="select * from user where username=? and password=? and type= ?";
    	 Connection con=ConnectionProvider.getConnection();
    	 PreparedStatement ps=con.prepareStatement(insertQuery);
    	 ps.setString(1,Data.getUsername());
    	 ps.setString(2, Data.getPassword());
    	 ps.setString(3, Data.getType());
    	 
    	 ResultSet rs=ps.executeQuery();
    	 Boolean status=rs.next();
    	 if(status) {
    	    session.setAttribute("id", rs.getInt(1));
    	    session.setAttribute("type", rs.getString(4));
    	    session.setAttribute("uname", rs.getString(2));
    	 }
    	 return status;
     }
     
     public static List<User> getData() throws ClassNotFoundException, SQLException{
    	 String insertQuery="select * from user";
    	 List<User> Data=new ArrayList<>();
    	 Connection con=ConnectionProvider.getConnection();
    	 Statement st=con.createStatement();
    	 
    	 ResultSet rs=st.executeQuery(insertQuery);
    	 while(rs.next()) {
    		 User user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
    		 Data.add(user);
    	 }
    	 return Data;
     }
     
     public static User getData(int id) throws ClassNotFoundException, SQLException{
    	 String insertQuery="select * from user where id="+id+";";
    	 Connection con=ConnectionProvider.getConnection();
    	 Statement st=con.createStatement();
    	 
    	 ResultSet rs=st.executeQuery(insertQuery);
    	 rs.next();
    	 User user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
         return user;     
        }
}

