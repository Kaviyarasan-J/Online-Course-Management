package com.user.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.MySql.Connection.ConnectionProvider;

public class UpdateUserData {
	public static int update(int id,String Uname,String Password) throws SQLException, ClassNotFoundException {
	     String query="update user set username = ?,password = ? where id = ? ";
	   	 Connection con=ConnectionProvider.getConnection();
	   	 PreparedStatement ps=con.prepareStatement(query);
	   	 ps.setString(1, Uname);
	   	 ps.setString(2,Password);
	   	 ps.setInt(3,id);
	   	 return ps.executeUpdate();
	    }
	public static int Delete(int id) throws SQLException, ClassNotFoundException {
	     String query="Delete from user where id=?";
	   	 Connection con=ConnectionProvider.getConnection();
	   	 PreparedStatement ps=con.prepareStatement(query);
	   	 ps.setInt(1,id);
	   	 return ps.executeUpdate();
	    }
}
