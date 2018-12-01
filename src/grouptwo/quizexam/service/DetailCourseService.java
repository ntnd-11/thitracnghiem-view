package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.DetailCourse;;


public class DetailCourseService extends BaseService {

	public DetailCourseService() {
		super();
	}
	public static List<DetailCourse> getAllDetailCourse() {
		String query = "Select * from detailcourses";
		List<DetailCourse> lstDetailCourses = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				DetailCourse detailcourses = new DetailCourse(
						rs.getInt(1),
						rs.getInt(2));
				lstDetailCourses.add(detailcourses);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstDetailCourses;
	}

	public static DetailCourse getDetailCoursesByIdCourse(int id) {
		String query = "Select * from detailcourses where Course = " +id;
		DetailCourse detailcourse = null;
		try
		{
			ResultSet rs = excuteQuery(query);
			while(rs.next())
			{
			 detailcourse = new DetailCourse(
					rs.getInt(1),
					rs.getInt(2));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return detailcourse;
	}

	public static DetailCourse getDeTailCoursesByIddetailcourse(int id) {
		return null;
	}

	public static boolean deleteDetailCourses(int id1, int id2) {
		String query="Delete from detailcourses where Course=? and Student=?";
		List<Object> params= new ArrayList<>();
		params.add(id1);
		params.add(id2);
		try {
			boolean action = executeUpdate(query, params);
			return action;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean updateDetailCourses(DetailCourse detailcourse) {
		{
			String query ="update detailcourses set "
					+ "Course = ?,"
					+ "Student = ?,"
					+ "Where Course= ?";
			List<Object> params= new ArrayList<>();
			params.add(detailcourse.getCourseId());
			params.add(detailcourse.getStudentId());
			params.add(detailcourse.getCourseId());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public static boolean addDetailCourses(DetailCourse detailcourse) {
		String query="Insert into detailcourses (Course,Student) "
				+"values (?,?)";
	List<Object> params= new ArrayList<>();
	params.add(detailcourse.getCourseId());
	params.add(detailcourse.getStudentId());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
	
	
}
