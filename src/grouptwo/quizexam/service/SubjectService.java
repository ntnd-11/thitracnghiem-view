package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======
import grouptwo.quizexam.model.Course;
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
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
	public static List<Subject> getAllSubject(int firstResult, int amoutResult) {
		String query = "select * from subjects order by Id LIMIT ?,?";
		List<Object> param=new ArrayList<>();
		param.add(firstResult);
		param.add(amoutResult);
		List<Subject> lstSubject =null;

<<<<<<< HEAD
=======
		try {	
			lstSubject= new ArrayList<>();
			ResultSet rs = excuteQuery(query,param);
			while (rs.next()) {
				Subject subjects = new Subject(
						rs.getInt("Id"),
						rs.getString("Name"),
						rs.getString("Faculty"),
						rs.getInt("Credit"),
						rs.getString("Type"),
						rs.getBoolean("Activate"));
				lstSubject.add(subjects);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return lstSubject;
	}
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
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
<<<<<<< HEAD
		String query = "Select * from subjects where name ='" +subject+"'";
=======
		String query = "Select * from subjects where Name = N'" +subject+"'";
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
		try
		{
			ResultSet rs = excuteQuery(query);
			rs.next();
<<<<<<< HEAD
			Subject obsubject = new Subject(
=======
			Subject list = new Subject(
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
					rs.getInt("Id"),
					rs.getString("Name"),
					rs.getString("Faculty"),
					rs.getInt("Credit"),
					rs.getString("Type"),
					rs.getBoolean("Activate"));
<<<<<<< HEAD
			return obsubject;
=======
			return list;
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
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
			String query ="update subjects set Name=?,Faculty = ?,Credit = ?,Type = ?,Activate = ? Where Id= ?";
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
