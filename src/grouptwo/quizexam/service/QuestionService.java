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
	public List<Question> getAllQuestions() {
		String query = "Select * from questions";
		List<Question> lstQuestions = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Question questions = new Question(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getInt(7));
				lstQuestions.add(questions);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstQuestions;
	}
	public List<Question> getAllQuestions(int firstReSult,int amoutResult) {
		String query = "select * from questions order by Id LIMIT ?,?";
		List<Object> param=new ArrayList<>();
		param.add(firstReSult);
		param.add(amoutResult);
		List<Question> lstQuestions = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query,param);
			while (rs.next()) {
				Question questions = new Question(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getInt(7));
				lstQuestions.add(questions);
			}
			return lstQuestions;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	
	}
	public List<Question> searchQuestion(String character)
	{
		String sql="SELECT * FROM questions " + 
				"WHERE lower(Question) LIKE ?";
		
		List<Question> lstQuestions = new ArrayList<>();
		try {
			ResultSet rs = searchExcuteQuery(sql,character);
			while (rs.next()) {
				Question questions = new Question(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getInt(7));
				lstQuestions.add(questions);
			}
			return lstQuestions;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	}
	public int countAnswer()
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
	
	public Question getQuestionsById(int id) {
		String query = "Select * from questions where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Question questions = new Question(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getInt(5),
					rs.getString(6),
					rs.getInt(7));
			return questions;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public Question getQuestionsByName(String question) {
		String query = "Select * from questions where Question = " +question;
		try
		{
			ResultSet rs = excuteQuery(query);
			Question questions = new Question(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getInt(5),
					rs.getString(6),
					rs.getInt(7));
			return questions;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public boolean deleteQuestions(int id) {
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

	public boolean addQuestions(Question question) {
		String query="Insert into questions (Question,Image,Level,Creator,CorrectAnswer,QuestionCategoryId)"
				+"values (?,?,?,?,?,?)";
	List<Object> params= new ArrayList<>();
	params.add(question.getQuestion());
	params.add(question.getImage());
	params.add(question.getLevel());
	params.add(question.getCreatorID());
	params.add(question.getCorrectAnswerID());
	params.add(question.getQuestionCategoryID());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
	
}
