package grouptwo.quizexam.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import grouptwo.quizexam.model.Questioncategorie;

public class QuestioncategoriesService extends BaseService {
	public QuestioncategoriesService() {
		super();
	}

	public List<Questioncategorie> getAllQuestioncategorie() {

		String query = "SELECT * FROM questioncategories";
		List<Questioncategorie> lstQuestioncategorie = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Questioncategorie questioncategorie = new Questioncategorie(rs.getInt(1), rs.getString(2));
				lstQuestioncategorie.add(questioncategorie);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstQuestioncategorie;

	}

	public Questioncategorie getQuestioncategoriesServiceById(int id) {
		String query = "Select * from questioncategories where Id = " + id;
		try {
			ResultSet rs = excuteQuery(query);
			Questioncategorie questioncategorie = new Questioncategorie(rs.getInt(1), rs.getString(2));
			return questioncategorie;
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;
	}

	public Questioncategorie getQuestioncategorieByName(String subject) {
		String query = "Select * from questioncategories where CategoryName = " + subject;
		try {
			ResultSet rs = excuteQuery(query);
			Questioncategorie questioncategorie = new Questioncategorie(rs.getInt(1), rs.getString(2));
			return questioncategorie;
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;
	}

	public boolean deleteQuestioncategorie(int id) {
		String query = "DELETE FROM questioncategories WHERE Id=?";
		List<Object> params = new ArrayList<>();
		params.add(id );
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	public boolean InsertQuestioncategorie(String categoryName) {
		// String query = "INSERT INTO EXAMS VALUES(?,?,?,?,?)" ;
		String query = "Insert into questioncategories(CategoryName) values(?)";
		List<Object> params = new ArrayList<>();
		params.add(categoryName);

		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	public boolean UpdateQuestioncategorie(String categoryName, int id) {
		String query = "update questioncategories set CategoryName=? where Id=?";
		List<Object> params = new ArrayList<>();
		params.add(categoryName);
		params.add(id );
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}
	

}
