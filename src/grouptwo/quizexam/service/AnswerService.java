package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Answer;

public class AnswerService extends BaseService {

	public AnswerService() {
		super();
	}
	public List<Answer> getAllAnswers() {
		String query = "Select * from answer";
		List<Answer> lstAnswers = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Answer answers = new Answer(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
				lstAnswers.add(answers);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstAnswers;
	}

	public Answer getAnswersById(int id) {
		String query = "Select * from answer where Id= " +id;
		Answer answer=null;
		try
		{
			
			ResultSet rs = excuteQuery(query);
			while(rs.next())
			{
				answer = new Answer(rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
			}
			
			return answer;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public List<Answer> getAnswersByIdForQuestion(int id_questiton) {
		String query = "Select * from answer where Question="+id_questiton;
		List<Answer> lstAnswers = new ArrayList<>();
		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Answer answers = new Answer(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
				lstAnswers.add(answers);
			}
			return lstAnswers;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	public Answer getAnswersByName(String answer) {
		return null;
	}

	public boolean deleteAnswers(int id) {
		String query="Delete from answer where Id=?";
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

	public boolean updateAnswers(Answer answer) {
		{
			String query ="update answer set "
					+ "Question = ?,"
					+ "Answer = ?,"
					+ "Where Id= ?";
			List<Object> params= new ArrayList<>();
			params.add(answer.getQuestions());
			params.add(answer.getAnswer());
			params.add(answer.getId());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean addAnswers(Answer answer) {
		String query="Insert into answer (Question,Answer)"
				+"values (?,?)";
	List<Object> params= new ArrayList<>();
	params.add(answer.getQuestions());
	params.add(answer.getAnswer());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


	}
}
