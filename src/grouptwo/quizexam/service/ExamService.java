package grouptwo.quizexam.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Exam;

public class ExamService extends BaseService{
	
	public ExamService() {
		super();
	}

	public List<Exam> getAllCourse() {
		
		String query = "SELECT * FROM onlinequiz.exams";
		List<Exam> lstExams = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Exam course = new Exam(rs.getInt("Id"), 
						rs.getString("name"), 
						rs.getTimestamp("TimeStarting"), 
						rs.getInt("NumQuestions"), 
						rs.getTimestamp("TimeFinishing"), 
						rs.getInt("Course"), 
						rs.getBoolean("Activate"),	 
						rs.getInt("Creator"));
				lstExams.add(course);
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lstExams;
		
	}
	public Exam getExamById(int id) {
		String query = "Select * from Exams where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Exam exams = new Exam(rs.getInt("Id"), 
					rs.getString("name"), 
					rs.getTimestamp("TimeStarting"), 
					rs.getInt("NumQuestions"), 
					rs.getTimestamp("TimeFinishing"), 
					rs.getInt("Course"), 
					rs.getBoolean("Activate"),	 
					rs.getInt("Creator"));
			return exams;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	
	/*public Exam getExamByName(String subject) {
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
	}*/
	
	public boolean deleteExam(int id) {
		String query = "DELETE FROM exams WHERE Id=?" ;
		List<Object> params=new ArrayList<>();
		params.add(id);
		try {
			
			return executeUpdate(query,params);
			
		}
		catch(SQLException ex) {
			
			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean InsertExam(String name,Date timeStarting,int NumQuestions,Date timeFinishing,int classlop,int avtivate,String creator)
	{
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
			
			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean UpdateExam(Exam exam)
	{
		String query="update Exams set exams.Name=? ,TimeStarting=?,NumQuestions=?,TimeFinishing=?,Course=?,Avtivate=?,Creator=? where Id=?";
		List<Object> params=new ArrayList<>();
		params.add(exam.getName());
		params.add(exam.getTimeStarting());
		params.add(exam.getNumQuestions());
		params.add(exam.getTimeFinishing());
		params.add(exam.getCourseID());
		params.add(exam.isActivate());
		params.add(exam.getCreatorID());
		params.add(exam.getId());
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	

}
