package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Subject;


public class SubjectService extends BaseService {

	public SubjectService() {
		super();
	}

	public static List<Subject> getAllSubjects() {
		String query = "Select * from onlinequiz.subjects";
		List<Subject> lstSubjects = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Subject subjects = new Subject(
						rs.getInt("Id"),
						rs.getString("Name"),
						rs.getString("Faculty"),
						rs.getInt("Credit"),
						rs.getString("Type"),
						rs.getBoolean("Activate"));
				lstSubjects.add(subjects);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstSubjects;
	}

	public static Subject getSubjectsById(int id) {
		String query = "Select * from subjects where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			rs.next();
			Subject subject = new Subject(
					rs.getInt("Id"),
					rs.getString("Name"),
					rs.getString("Faculty"),
					rs.getInt("Credit"),
					rs.getString("Type"),
					rs.getBoolean("Activate"));
			return subject;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public static Subject getSubjectsByName(String subject) {
		String query = "Select * from subjects where name ='" +subject+"'";
		try
		{
			ResultSet rs = excuteQuery(query);
			rs.next();
			Subject obsubject = new Subject(
					rs.getInt("Id"),
					rs.getString("Name"),
					rs.getString("Faculty"),
					rs.getInt("Credit"),
					rs.getString("Type"),
					rs.getBoolean("Activate"));
			return obsubject;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public static boolean deleteSubjects(int id) {
		String query="Delete from subjects where Id=?";
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

	public static boolean updateSubjects(Subject subject) {
		{
			String query ="update subjects set "
					+ "Name=?,"
					+ "Faculty = ?,"
					+ "Credit = ?,"
					+ "Type = ?,"
					+ "Activate = ?,"
					+ "Where Id= ?";
			List<Object> params= new ArrayList<>();
			params.add(subject.getSubjectName());
			params.add(subject.getFaculty());
			params.add(subject.getCredit());
			params.add(subject.getType());
			params.add(subject.isActivate());
			params.add(subject.getSubjectID());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public static boolean addSubjects(Subject subject) {
		String query="Insert into onlinequiz.subjects (Name,Faculty,Credit,Type,Activate)"
				+"values (?,?,?,?,?)";
	List<Object> params= new ArrayList<>();
	params.add(subject.getSubjectName());
	params.add(subject.getFaculty());
	params.add(subject.getCredit());
	params.add(subject.getType());
	params.add(subject.isActivate());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
}
