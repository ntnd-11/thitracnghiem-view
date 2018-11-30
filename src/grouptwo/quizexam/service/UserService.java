package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.User;
public class UserService extends BaseService {

	public UserService() {
		super();
	}
	public List<User> getAllUsers() {
		String query = "Select * from users";
		List<User> lstUsers = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				User users = new User(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getBoolean(5));
				lstUsers.add(users);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstUsers;
	}

	public User getUsersById(int id) {
		String query = "Select * from users where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			User user = new User(
					rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getInt(4),
					rs.getBoolean(5));
			return user;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public User getUsersByName(String user) {
		return null;
	}

	public boolean deleteUsers(int id) {
		String query="Delete from users where Id=?";
		List<Object> params= new ArrayList<>();
		params.add(id);
		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateUsers(User user) {
		{
			String query ="update users set "
					+ "UserName=?,"
					+ "Email = ?,"
					+ "Password = ?,"
					+ "RoleUser = ?,"
					+ "Activate = ?,"
					+ "Where Id= ?";
			List<Object> params= new ArrayList<>();
			params.add(user.getUserName());
			params.add(user.getEmail());
			params.add(user.getPassword());
			params.add(user.getRoleuser());
			params.add(user.getActivate());
//			params.add(user.);
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean addUsers(User user) {
		String query="Insert into subjects (UserName,Email,Password,RoleUser,Activate)"
				+"values (?,?,?,?,?)";
	List<Object> params= new ArrayList<>();
	params.add(user.getUserName());
	params.add(user.getEmail());
	params.add(user.getPassword());
	params.add(user.getRoleuser());
	params.add(user.getActivate());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
}
