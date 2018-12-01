package grouptwo.quizexam.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Questioncategorie;

public class QuestioncategoriesService extends BaseService {
	public QuestioncategoriesService() {
		super();
	}

	public static List<Questioncategorie> getAllQuestioncategorie() {

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

	public static Questioncategorie getQuestioncategoriesServiceById(int id) {
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

	public static Questioncategorie getQuestioncategorieByName(String subject) {
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

	public static boolean deleteQuestioncategorie(int id) {
		String query = "DELETE FROM questioncategories WHERE Id=?";
		List<Object> params = new ArrayList<>();
		params.add(id );
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	public static boolean InsertQuestioncategorie(String categoryName) {
		// String query = "INSERT INTO EXAMS VALUES(?,?,?,?,?)" ;
		String query = "Insert into questioncategories(CategoryName) values(?)";
		List<Object> params = new ArrayList<>();
		params.add(categoryName);

		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	public static boolean UpdateQuestioncategorie(String categoryName, int id) {
		String query = "update questioncategories set CategoryName=? where Id=?";
		List<Object> params = new ArrayList<>();
		params.add(categoryName);
		params.add(id );
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			//Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}
	

}
