package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.RoleUser;


public class RoleUserService extends BaseService {

	public RoleUserService() {
		super();
	}

	public List<RoleUser> getAllRoleUser() {
		String query = "Select * from roleuser";
		List<RoleUser> lstRoleUser = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				RoleUser roleUser = new RoleUser(
						rs.getInt(1), 
						rs.getString(2));
				lstRoleUser.add(roleUser);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstRoleUser;
	}

	public RoleUser getRoleUserById(int id) {
		return null;
	}

	public RoleUser getRoleUserByName(String subject) {
		return null;
	}

	public boolean deleteRoleUser(int id) {
		return false;
	}

	public boolean updateRoleUser(RoleUser roleUser) {
		return false;
	}

	public boolean addRoleUser(RoleUser roleUser) {
		return false;

	}
}
