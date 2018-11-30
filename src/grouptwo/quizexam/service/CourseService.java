package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Course;


public class CourseService extends BaseService {
	
	public CourseService() {
		super();
	}

	public List<Course> getAllCourse() {
		
		String query = "Select * from onlinequiz.classes";
		List<Course> lstCourse = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Course course = new Course(
						rs.getInt(2),
						rs.getDate(3),
						rs.getDate(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getBoolean(10),
						rs.getString(11));
				lstCourse.add(course);
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lstCourse;
		
	}
	public Course getCourseById(int id) {
		String query = "Select * from onlinequiz.classes where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Course course = new Course(
					rs.getInt(2),
					rs.getDate(3),
					rs.getDate(4),
					rs.getString(5),
					rs.getInt(6),
					rs.getInt(7),
					rs.getInt(8),
					rs.getString(9),
					rs.getBoolean(10),
					rs.getString(11));
			return course;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public Course getCourseByNameSubject(String subject) {
		return null;
	}
	public boolean deleteCourse(int id) {
		/*String query = "DELETE FROM onlinequiz.CLASSES WHERE Id = ?";
		
		List<String> params = new ArrayList<>();
		params.add(id +"");
		try {
			return executeUpdate(query, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		return false;
	}
	public boolean updateCourse(Course course)
	{
		/*String query = "UPDATE onlinequiz.CLASSES SET Subject=?,"
				+ "DateOfStarting=?,"
				+ "DateOfEnding=?,"
				+ "DateOfWeek=?,"
				+ "PartOfStarting = ?,"
				+ "PartOfEnding=?, "
				+ "Room = ? ,Activate = ?,"
				+ "Teacher = ? "
				+ "WHERE Id=?";
		List<String> params = new ArrayList<>();
		params.add(course.getSubjectId()+"");
		params.add(course.getDateOfStarting()+"");
		params.add(course.getDateOfEnding()+"");
		params.add(course.getDateOfWeek()+"");
		params.add(course.getPartOfStarting()+"");
		params.add(course.getPartOfEnding()+"");
		params.add(course.getPartOfEnding()+"");
		params.add(course.getRoom()+"");
		params.add(course.isActivate()+"");
		params.add(course.getTeacher()+"");
		params.add(course.getCourseId()+"");

		try {
			return executeUpdate(query, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		return false;

	}
	public boolean addCourse(Course course) {
		String query = "INSERT INTO onlinequiz.CLASSES (Subject, DateOfStarting, DateOfEnding,DateOfWeek,PartOfStarting,PartOfEnding,NumOfStudents,Room,Activate,Teacher)" + 
				"VALUES (?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<>();
		params.add(course.getSubjectId());
		params.add(course.getDateOfStarting());
		params.add(course.getDateOfEnding());
		params.add(course.getDateOfWeek());
		params.add(course.getPartOfStarting());
		params.add(course.getPartOfEnding());
		params.add(course.getNumberOfStudent());
		params.add(course.getRoom());
		params.add(course.isActivate());
		params.add(course.getTeacher());
		
		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	
}
