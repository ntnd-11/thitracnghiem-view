package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Question;


public class QuestionService extends BaseService {

	public QuestionService() {
		super();
	}
	public static List<Question> getAllQuestions() {
		String query = "Select * from questions";
		List<Question> lstQuestions = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Question questions = new Question(rs.getInt("Id"),
						rs.getString("Question"),
						rs.getString("Image"),
						rs.getString("Level"),
						rs.getInt("QuestionCategory"),
						rs.getInt("CorrectAnswer"),
						rs.getInt("Creator"));
				lstQuestions.add(questions);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstQuestions;
	}
	public static List<Question> getAllQuestions(int firstReSult,int amoutResult) {
		String query = "select * from questions order by Id LIMIT ?,?";
		List<Object> param=new ArrayList<>();
		param.add(firstReSult);
		param.add(amoutResult);
		List<Question> lstQuestions = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query,param);
			while (rs.next()) {
				Question questions = new Question(
						rs.getInt("Id"),
						rs.getString("Question"),
						rs.getString("Image"),
						rs.getString("Level"),
						rs.getInt("QuestionCategory"),
						rs.getInt("Creator"),
						rs.getInt("CorrectAnswer"));
				lstQuestions.add(questions);
			}
			return lstQuestions;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	
	}
	public static List<Question> searchQuestion(String character)
	{
		String sql="SELECT * FROM questions " + 
				"WHERE lower(Question) LIKE ?";
		
		List<Question> lstQuestions = new ArrayList<>();
		try {
			ResultSet rs = searchExcuteQuery(sql,character);
			while (rs.next()) {
				Question questions = new Question(
						rs.getInt("Id"),
						rs.getString("Question"),
						rs.getString("Image"),
						rs.getString("Level"),
						rs.getInt("QuestionCategory"),
						rs.getInt("Creator"),
						rs.getInt("CorrectAnswer"));
				lstQuestions.add(questions);
			}
			return lstQuestions;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	}
	public static int countQuestion()
	{
		String sql="select count(id) from questions";
		try
		{
			ResultSet rs=excuteQuery(sql);
			while(rs.next())
			{
				return rs.getInt(1);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public static Question getQuestionsById(int id) {
		String query = "Select * from questions where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Question questions = new Question(
					rs.getInt("Id"),
					rs.getString("Question"),
					rs.getString("Image"),
					rs.getString("Level"),
					rs.getInt("QuestionCategory"),					
					rs.getInt("Creator"),
					rs.getInt("CorrectAnswer"));
			return questions;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public static Question getQuestionsByName(String question) {
		String query = "Select * from questions where Question = " +question;
		try
		{
			ResultSet rs = excuteQuery(query);
			Question questions = new Question(
					rs.getInt("Id"),
					rs.getString("Question"),
					rs.getString("Image"),
					rs.getString("Level"),
					rs.getInt("QuestionCategory"),
										rs.getInt("Creator"),
					rs.getInt("CorrectAnswer"));
			return questions;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public static boolean deleteQuestions(int id) {
		String query="Delete from questions where Id=?";
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

	public boolean updateQuestions(Question question) {
		{
			String query ="update questions set "
					+ "Question = ?,"
					+ "Image = ?,"
					+ "Level = ?,"
					+ "Creator = ?,"
					+ "CorrectAnswer = ?,"
					+ "QuestionCategoryId = ?,"
					+ "Where Id= ?";
			List<Object> params= new ArrayList<>();
			params.add(question.getQuestion());
			params.add(question.getImage());
			params.add(question.getLevel());
			params.add(question.getCreatorID());
			params.add(question.getCorrectAnswerID());
			params.add(question.getQuestionCategoryID());
			params.add(question.getId());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public static boolean addQuestions(Question question) {
		String query="Insert into questions (Question,Image,Level,Creator,QuestionCategory)"
				+"values (?,?,?,?,?)";
	List<Object> params= new ArrayList<>();
	
	params.add(question.getQuestion());
	params.add(question.getImage());
	params.add(question.getLevel());
	params.add(question.getCreatorID());
	params.add(question.getQuestionCategoryID());
	for(Object c:params)
	{
		System.out.println(c+"");
	}
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
}
