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

	public List<Subject> getAllSubjects() {
		String query = "Select * from roleuser";
		List<Subject> lstSubjects = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Subject subjects = new Subject(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getBoolean(6));
				lstSubjects.add(subjects);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstSubjects;
	}

	public Subject getSubjectsById(int id) {
		String query = "Select * from subjects where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Subject subject = new Subject(
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

	public Subject getSubjectsByName(String subject) {
		return null;
	}

	public boolean deleteSubjects(Subject subject) {
		String query="Delete from subjects where Id=?";
		List<String> params= new ArrayList<>();
		params.add(subject.getSubjectID()+"");
		try {
			return executeUpdate(query, params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateSubjects(Subject subject) {
		{
			String query ="update subjects set "
					+ "Name=?,"
					+ "Faculty = ?,"
					+ "Credit = ?,"
					+ "Type = ?,"
					+ "Activate = ?,"
					+ "Where Id= ?";
			List<String> params= new ArrayList<>();
			params.add(subject.getSubjectName()+"");
			params.add(subject.getFaculty()+"");
			params.add(subject.getCredit()+"");
			params.add(subject.getType()+"");
			params.add(subject.isActivity()+"");
			params.add(subject.getSubjectID()+"");
			try {
				return executeUpdate(query, params);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean addSubjects(Subject subject) {
		String query="Insert into subjects (Name,Faculty,Credit,Type,Activate)"
				+"values (?,?,?,?,?)";
	List<String> params= new ArrayList<>();
	params.add(subject.getSubjectName()+"");
	params.add(subject.getFaculty()+"");
	params.add(subject.getCredit()+"");
	params.add(subject.getType()+"");
	params.add(subject.isActivity()+"");
	try {
		return executeUpdate(query, params);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;


	}
}
