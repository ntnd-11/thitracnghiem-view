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
	public boolean deleteCourse(Course course) {
		String query="Delete from classes where Id=?";
		List<String> params= new ArrayList<>();
		params.add(course.getId()+"");
		try {
			return executeUpdate(query, params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateCourse(Course course)
	{
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
		}
		return false;

	}
	public boolean addCourse(Course course) {
		String query="Insert into classes (Subject,DateOfStarting,DateOfEnding,DateOfWeek,PartOfStarting,PartOfEnding,NumOfStudents,Room,Activate,Teacher)"
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
		}
		return false;

	}
}
