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
		
		String query = "Select * from classes";
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
		String query = "Select * from classes where Id = " +id;
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
	public Course getCourseByName(String subject) {
		return null;
	}
	public boolean deleteCourse(int id) {
		return false;
	}
	public boolean updateCourse(Course course)
	{
		String query ="INSERT INTO Classes VALUES (?,?,?,?,?)";
		boolean action = false;
		try {
			//ResultSet rs = excuteQuery(query);
			
		}catch(Exception e) {
			
		}
	
		return action;
	}
	public boolean addCourse(Course course) {
		return false;

	}
	
}
