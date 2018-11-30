package grouptwo.quizexam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


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
	protected ResultSet excuteQuery(String query,List<String> params) throws SQLException
	{
		PreparedStatement stmt = conn.prepareStatement(query);
		for(int i=0;i<params.size();i++)
		{
			stmt.setString(i+1, params.get(i));
		}
 
        return stmt.executeQuery(query);
	}
	protected boolean executeUpdate(String query) throws SQLException
	{
		Statement stmt = conn.createStatement();
 
        return stmt.execute(query);       
	}
	protected boolean executeUpdate(String query,List<String> params) throws SQLException
	{
		PreparedStatement stmt = conn.prepareStatement(query);
		for(int i=0;i<params.size();i++)
		{
			stmt.setString(i+1, params.get(i));
		}
 
        return stmt.execute();
	}
}
