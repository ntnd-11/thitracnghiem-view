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
		return null;
	}

	public Subject getSubjectsByName(String subject) {
		return null;
	}

	public boolean deleteSubjects(int id) {
		return false;
	}

	public boolean updateSubjects(Subject subjects) {
		return false;
	}

	public boolean addSubjects(Subject subjects) {
		return false;

	}
}
