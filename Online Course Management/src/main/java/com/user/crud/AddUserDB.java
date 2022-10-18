package com.user.crud;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.MySql.Connection.*;
import com.user.Model.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class AddUserDB {
    public static void add(User Data,HttpServletRequest request) throws ClassNotFoundException, SQLException {
    	HttpSession session=request.getSession();
    	String insertQuery="insert into user(username,password,type)values (?,?,?);";
    	Connection con=ConnectionProvider.getConnection();
    	PreparedStatement ps=con.prepareStatement(insertQuery);
    	ps.setString(1,Data.getUsername());
    	ps.setString(2,Data.getPassword());
    	ps.setString(3,Data.getType());
    	ps.executeUpdate();
    	insertQuery="select * from user where username=? and password=? and type=?";
    	PreparedStatement pst=con.prepareStatement(insertQuery);
    	pst.setString(1,Data.getUsername());
    	pst.setString(2,Data.getPassword());
    	pst.setString(3,Data.getType());
    	ResultSet rs=pst.executeQuery();
    	rs.next();
    	session.setAttribute("id", rs.getInt(1));
    	session.setAttribute("type",Data.getType());
    	rs.close();
    	con.close();
    }
    
    public static Boolean Verify(User Data) throws ClassNotFoundException, SQLException {
    	String insertQuery="select * from user where username= ?";
    	Connection con=ConnectionProvider.getConnection();
    	PreparedStatement ps=con.prepareStatement(insertQuery);
    	ps.setString(1,Data.getUsername());
    	ResultSet rs=ps.executeQuery();
    	return rs.next();
    	
    }
}
