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

	public static List<Course> getAllCourse() {
		
		String query = "Select * from onlinequiz.courses";
		List<Course> lstCourse = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Course course = new Course(
						rs.getInt("Id"),
						rs.getInt("Subject"), 
						rs.getDate("DateOfStarting"), 
						rs.getDate("DateOfEnding"), 
						rs.getString("DateOfWeek"), 
						rs.getInt("PartOfStarting"), 
						rs.getInt("PartOfEnding"), 
						rs.getInt("NumOfStudents"), 
						rs.getString("Room"), 
						rs.getBoolean("Activate"),
						rs.getInt("Teacher"));
				lstCourse.add(course);
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lstCourse;
		
	}
	public static List<Integer> getAllId()
	{
		String sql="select id from courses";
		List<Integer> lsID = new ArrayList<>();
		try {
			ResultSet rs = excuteQuery(sql);
			while (rs.next()) {
			
				lsID.add(rs.getInt(1));
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lsID;
	}
	public static Course getCourseById(int id) {
		String query = "Select * from onlinequiz.courses where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			while(rs.next())
			{
				Course course = new Course(rs.getInt("Subject"), 
						rs.getDate("DateOfStarting"), 
						rs.getDate("DateOfEnding"), 
						rs.getString("DateOfWeek"), 
						rs.getInt("PartOfStarting"), 
						rs.getInt("PartOfEnding"), 
						rs.getInt("NumOfStudents"), 
						rs.getString("Room"), 
						rs.getBoolean("Activate"),
						rs.getInt("Teacher"));
				return course;
			}
		
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public static Course getCourseByNameSubject(String subject) {
		return null;
	}
	public static boolean deleteCourse(int id) {
		String query = "DELETE FROM onlinequiz.courses WHERE Id = ?";
		
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean updateCourse(Course course)
	{
		String query = "UPDATE onlinequiz.courses SET Subject=?,"
				+ "DateOfStarting=?,"
				+ "DateOfEnding=?,"
				+ "DateOfWeek=?,"
				+ "PartOfStarting = ?,"
				+ "PartOfEnding=?, "
				+ "Room = ? ,Activate = ?,"
				+ "Teacher = ? "
				+ "WHERE Id=?";
		List<Object> params = new ArrayList<>();
		params.add(course.getSubjectId());
		params.add(course.getDateOfStarting());
		params.add(course.getDateOfEnding());
		params.add(course.getDateOfWeek());
		params.add(course.getPartOfStarting());
		params.add(course.getPartOfEnding());
		params.add(course.getPartOfEnding());
		params.add(course.getRoom());
		params.add(course.isActivate());
		params.add(course.getTeacher());
		params.add(course.getCourseId());

		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	public static boolean addCourse(Course course) {
		String query = "INSERT INTO onlinequiz.courses (Subject, DateOfStarting, DateOfEnding,DateOfWeek,PartOfStarting,PartOfEnding,NumOfStudents,Room,Activate,Teacher)" + 
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
