package grouptwo.quizexam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import grouptwo.quizexam.data.MySqlConnUtils;

public class BaseService {
	private Connection conn;
	public  BaseService() {
		try
		{
			conn = MySqlConnUtils.getConnection();
		}
		catch(Exception e) {
			
		}
	}
	
	protected ResultSet excuteQuery(String query) throws SQLException
	{
		Statement stmt = conn.createStatement();
 
        return stmt.executeQuery(query);
	}
	protected boolean executeUpdate(String query) throws SQLException
	{
		Statement stmt = conn.createStatement();
 
        return stmt.execute(query);
        
	}
	protected boolean executeDelete(String query) throws SQLException
	{
		PreparedStatement ps=conn.prepareCall(query);
 
        return ps.execute(query);
        
	}

}
