package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import grouptwo.quizexam.model.Roleuser;


public class RoleuserService extends BaseService {

	public RoleuserService() {
		super();
	}

	public List<Roleuser> getAllRoleUser() {
		String query = "Select * from roleuser";
		List<Roleuser> lstRoleUser = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Roleuser roleUser = new Roleuser(
						rs.getInt("Id"), 
						rs.getString("RoleName"));
				lstRoleUser.add(roleUser);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstRoleUser;
	}

	public Roleuser getRoleUserById(int id) {
		String query = "Select * from roleusers where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Roleuser roleuser = new Roleuser(
					rs.getString("RoleName"));
			return roleuser;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public Roleuser getRoleUserByName(String subject) {
		return null;
	}

	public boolean deleteRoleUser(Roleuser roleUser) {
		String query="Delete from roleusers where Id=?";
		List<String> params= new ArrayList<>();
		params.add(roleUser.getId()+"");
		try {
			return executeUpdate(query, params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateRoleUser(Roleuser roleUser) {

		String query ="update roleusers set "
				+ "RoleName=?,"
				+ "Where Id= ?";
		List<String> params= new ArrayList<>();
		params.add(roleUser.getRoleName()+"");
		params.add(roleUser.getId()+"");
		try {
			return executeUpdate(query, params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean addRoleUser(Roleuser roleUser) {
		String query="Insert into roleusers (RoleName)"
				+"values (?)";
	List<String> params= new ArrayList<>();
	params.add(roleUser.getRoleName()+"");
	try {
		return executeUpdate(query, params);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;


	}
}
