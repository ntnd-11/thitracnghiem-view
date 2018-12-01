package grouptwo.quizexam.service;

import java.sql.Connection;
import java.sql.Date;
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
			System.out.println(e+"");
		}
	}
	// no parameter
	protected ResultSet excuteQuery(String query) throws SQLException
	{
		Statement stmt = conn.createStatement();
 
        return stmt.executeQuery(query);
	}
	
	// select have parameter
	protected ResultSet excuteQuery(String query,List<Object> params) throws SQLException
	{
		PreparedStatement stmt = conn.prepareStatement(query);
		for(int i = 0; i < params.size() ;i++)
		{
			if (params.get(i) == null)
			{
				stmt.setObject(i+1, null);
				continue;
			}
				
			if(params.get(i).getClass() == Integer.class)
			{
				stmt.setInt(i+1, (int)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == Date.class)
			{
				stmt.setDate(i+1, (Date)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == boolean.class)
			{
				stmt.setBoolean(i+1, (boolean)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == String.class)
			{
				stmt.setString(i+1, ""+params.get(i)); 
				continue;
			}
			stmt.setObject(i+1, params.get(i));
			continue;

		}
        return stmt.executeQuery();
        
	}
	protected ResultSet searchExcuteQuery(String query,String character) throws SQLException
	{
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1,"%"+character+"%");
		
		System.out.println(stmt+"");
        return stmt.executeQuery();
        
	}
	// insert,update,delete with no parameter
	protected boolean executeUpdate(String query) throws SQLException
	{
		Statement stmt = conn.createStatement();
 
        int action = stmt.executeUpdate(query);
        return action >0;
        
	}
	// insert,update,delete with parameter

	protected boolean executeUpdate(String query,List<Object> params) throws SQLException
	{
		PreparedStatement stmt = conn.prepareStatement(query);
		for(int i = 0; i < params.size() ;i++)
		{
			if (params.get(i) == null)
			{
				stmt.setObject(i+1, null);
				continue;
			}
				
			if(params.get(i).getClass() == Integer.class)
			{
				stmt.setInt(i+1, (int)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == Date.class)
			{
				stmt.setDate(i+1, (Date)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == boolean.class)
			{
				stmt.setBoolean(i+1, (boolean)params.get(i)); 
				continue;
			}
			if(params.get(i).getClass() == String.class)
			{
				stmt.setString(i+1, ""+params.get(i)); 
				continue;
			}
			stmt.setObject(i+1, params.get(i));
			continue;

		}
		
		int action = stmt.executeUpdate();
		return action >0;
	}

}
