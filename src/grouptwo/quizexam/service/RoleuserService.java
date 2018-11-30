package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Questioncategorie;
import grouptwo.quizexam.model.Roleuser;

public class RoleuserService extends BaseService {

	public RoleuserService() {
		super();
	}
	public  boolean addRoleuser(String RoleuserName)
	{
		String sql="insert into roleusers(RoLeName) values(?)";
		List<Object> param= new ArrayList<>();
		param.add(RoleuserName);
			try {
				return executeUpdate(sql,param);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		return false;
	}
	public  List<Roleuser> getAllRoleuser()
	{
		String sql="select * from roleusers";
		List<Roleuser> list=null;
		Roleuser qsc=null;
		try {
			ResultSet rs=excuteQuery(sql);
			list=new ArrayList<>();
			
			while(rs.next())
			{
				qsc=new Roleuser();
				qsc.setId(rs.getInt(1));
				qsc.setRoleName(rs.getString(2));
				list.add(qsc);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	public  Roleuser getRoleuser(int id)
	{
		Roleuser qsc=new Roleuser();
		String sql="select * from roleusers where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Roleuser();
				qsc.setId(rs.getInt(1));
				qsc.setRoleName(rs.getString(2));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return qsc;
		
		
	}
	public  Roleuser getRoleuser(String name)
	{
		Roleuser qsc=new Roleuser();
		String sql="select * from roleusers where RoleName=?";
		List<Object> param= new ArrayList<>();
		param.add(name);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Roleuser();
				qsc.setId(rs.getInt(1));
				qsc.setRoleName(rs.getString(2));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return qsc;
	}
	public  boolean deleteRoleuser(int id_Roleuser)
	{
		String sql="delete from roleusers where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_Roleuser);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  boolean updateRoleuser(int id_Roleuser,String roleUserName)
	{
		String sql="update roleusers set RoleName=? where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(roleUserName);
		param.add(id_Roleuser);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  int getIdRoleuser(String roleUserName)
	{
		int id=-1;
		String sql="select Id from roleusers where RoleName=?";
		List<Object> param= new ArrayList<>();
		param.add(roleUserName);
		try {
			ResultSet rs= excuteQuery(sql, param);
			while(rs.next())
			{
				id=rs.getInt(1);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return id;
	}
	public  String getNameRoleuser(int id_Roleuser)
	{
		String Name=null;
		String sql="select RoleName  from roleusers where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_Roleuser);
		try {
			ResultSet rs= excuteQuery(sql, param);
			while(rs.next())
			{
				Name=rs.getString(1);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Name;
	}
}
