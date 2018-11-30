package grouptwo.quizexam.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import grouptwo.quizexam.model.Exam;

public class ExamsService extends BaseService{
	
	public ExamsService() {
		super();
	}

	public List<Exam> getAllCourse() {
		
		String query = "SELECT * FROM onlinequiz.exams";
		List<Exam> lstExams = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Exam course = new Exam(
						rs.getInt(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getInt(4),
						rs.getDate(5),
						rs.getInt(6),
						rs.getBoolean(7),
						rs.getString(8));
				lstExams.add(course);
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lstExams;
		
	}
	public Exam getExamsById(int id) {
		String query = "Select * from Exams where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Exam exams = new Exam(
					rs.getInt(1),
					rs.getString(2),
					rs.getDate(3),
					rs.getInt(4),
					rs.getDate(5),
					rs.getInt(6),rs.getBoolean(7),
					rs.getString(8));
			return exams;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public Exam getExamByName(String subject) {
		String query = "Select * from Exams where Name = " +subject;
		try
		{
			ResultSet rs = excuteQuery(query);
			Exam exams = new Exam(
					rs.getInt(1),
					rs.getString(2),
					rs.getDate(3),
					rs.getInt(4),
					rs.getDate(5),
					rs.getInt(6),rs.getBoolean(7),
					rs.getString(8));
			return exams;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public boolean deleteExams(int id) {
		String query = "DELETE FROM exams WHERE Id=?" ;
		List<Object> params=new ArrayList<>();
		params.add(id);
		try {
			
			return executeUpdate(query,params);
			
		}
		catch(SQLException ex) {
			
			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean InsertExams(String name,Date timeStarting,int NumQuestions,Date timeFinishing,int classlop,int avtivate,String creator)
	{
		//String query = "INSERT INTO EXAMS VALUES(?,?,?,?,?)" ;
		String query="Insert into Exams(exams.Name,TimeStarting,NumQuestions,TimeFinishing,Class,Avtivate,Creator) values(?,?,?,?,?,?,?)";
		List<Object> params=new ArrayList<>();
		params.add(name);
		params.add(timeStarting);
		params.add(NumQuestions);
		params.add(timeFinishing);
		params.add(classlop);
		params.add(avtivate);
		params.add(creator);
		try {
			
			return executeUpdate(query,params);
			
		}
		catch(SQLException ex) {
			
			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean UpdateExams(String name,Date timeStarting,int NumQuestions,Date timeFinishing,int classlop,int avtivate,String creator,int id)
	{
		String query="update Exams set exams.Name=? ,TimeStarting=?,NumQuestions=?,TimeFinishing=?,Class=?,Avtivate=?,Creator=? where Id=?";
		List<Object> params=new ArrayList<>();
		params.add(name);
		params.add(timeStarting);
		params.add(NumQuestions);
		params.add(timeFinishing);
		params.add(classlop);
		params.add(avtivate);
		params.add(creator);
		params.add(id);
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	

}
