package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Profilemanager;;



public class ProfilemanagerService extends BaseService {

	public ProfilemanagerService() {
		super();
	}

	public List<Profilemanager> getAllProfileManager() {
		String query = "Select * from profilemanager";
		List<Profilemanager> lstProfileManager = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Profilemanager profileManager = new Profilemanager(
						rs.getString("Users_UserName"),
						rs.getString("name"), 
						rs.getDate("DateOfBirth"),
						rs.getString("Gender"), 
						rs.getString("Email"), 
						rs.getString("PhoneNumber"), 
						rs.getString("Image"),
						rs.getBoolean("ShowProfile"));
				lstProfileManager.add(profileManager);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstProfileManager;
	}

	public Profilemanager getProfilemanagerById(int id) {
		return null;
	}

	public Profilemanager getProfilemanagerByName(String profileManager) {
		String query = "Select * from classes where Users_UserName = " +profileManager;
/*		try
		{
			ResultSet rs = excuteQuery(query);
			Profilemanager profilemanager = new Profilemanager(
					rs.getInt("Subject"),
					rs.getDate("DateOfStarting"),
					rs.getDate("DateOfEnding"),
					rs.getString("DateOfWeek"),
					rs.getInt("PartOfStarting"),
					rs.getInt("PartOfEnding"),
					rs.getInt("NumOfStudents"),
					rs.getString("Room"),
					rs.getBoolean("Activate"),
					rs.getString("Teacher"));
			return profilemanager;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}*/
		return null;
	}

	public boolean deleteProfilemanager(Profilemanager profileManager) {
/*		String query="Delete from classes where Id=?";
		List<String> params= new ArrayList<>();
		params.add(course.getId()+"");
		try {
			return executeUpdate(query, params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return false;
	}

	public boolean updateProfilemanager(Profilemanager profileManager) {
/*		{
			String query ="update classes set "
					+ "Subject=?,"
					+ "DateOfStarting = ?,"
					+ "DateOfEnding = ?,"
					+ "DateOfWeek = ?,"
					+ "PartOfStarting = ?,"
					+ "PartOfEnding = ?,"
					+ "NumOfStudents = ?,"
					+ "Room = ?,"
					+ "Activate = ?,"
					+ "Teacher = ?"
					+ "Where Id= ?";
			List<String> params= new ArrayList<>();
			params.add(course.getSubjectId()+"");
			params.add(course.getDateOfStarting()+"");
			params.add(course.getDateOfEnding()+"");
			params.add(course.getDateOfWeek()+"");
			params.add(course.getPartOfStarting()+"");
			params.add(course.getPartOfEnding()+"");
			params.add(course.getNumberOfStudent()+"");
			params.add(course.getRoom()+"");
			params.add(course.isActivate()+"");
			params.add(course.getTeacher()+"");
			params.add(course.getId()+"");
			try {
				return executeUpdate(query, params);
				
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			return false;
	}

	public boolean addProfilemanager(Profilemanager profileManager) {
/*		String query="Insert into classes (Subject,DateOfStarting,DateOfEnding,DateOfWeek,PartOfStarting,PartOfEnding,NumOfStudents,Room,Activate,Teacher)"
				+"values (?,?,?,?,?,?,?,?,?,?)";
	List<String> params= new ArrayList<>();
	params.add(course.getSubjectId()+"");
	params.add(course.getDateOfStarting()+"");
	params.add(course.getDateOfEnding()+"");
	params.add(course.getDateOfWeek()+"");
	params.add(course.getPartOfStarting()+"");
	params.add(course.getPartOfEnding()+"");
	params.add(course.getNumberOfStudent()+"");
	params.add(course.getRoom()+"");
	params.add(course.isActivate()+"");
	params.add(course.getTeacher()+"");
	try {
		return executeUpdate(query, params);
		
	} catch (Exception e) {
		e.printStackTrace();
	}*/
	return false;

	}
}
