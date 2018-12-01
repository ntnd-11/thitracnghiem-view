package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Questioncategorie;

public class QuestioncategorieService extends BaseService {

	public QuestioncategorieService() {
		super();
	}
	public static boolean addQuestionCategory(String categoryName)
	{
		String sql="insert into questioncategories(CategoryName) values(?)";
		List<Object> param= new ArrayList<>();
		param.add(categoryName);

			try {
				return executeUpdate(sql,param);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		return false;
		
		
	}
	public static List<Questioncategorie> getAllQuestionCategorie()
	{
		String sql="select * from questioncategories";
		List<Questioncategorie> list=null;
		Questioncategorie qsc=null;
		try {
			ResultSet rs=excuteQuery(sql);
			list=new ArrayList<>();
			
			while(rs.next())
			{
				qsc=new Questioncategorie();
				qsc.setId(rs.getInt(1));
				qsc.setCategoryName(rs.getString(2));
				list.add(qsc);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	public  Questioncategorie getQuestionCategorie(int id)
	{
		Questioncategorie qsc=new Questioncategorie();
		String sql="select * from questioncategories where id=?";
		List<Object> param= new ArrayList<>();
		param.add(id);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Questioncategorie();
				qsc.setId(rs.getInt(1));
				qsc.setCategoryName(rs.getString(2));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return qsc;
	}
	public static  Questioncategorie getQuestionCategorie(String name)
	{
		Questioncategorie qsc=new Questioncategorie();
		String sql="select * from questioncategories where CategoryName=?";
		List<Object> param= new ArrayList<>();
		param.add(name);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Questioncategorie();
				qsc.setId(rs.getInt(1));
				qsc.setCategoryName(rs.getString(2));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return qsc;
	}
	public static boolean deleteQuestionCategorie(int id_QuestionCategorie)
	{
		String sql="delete from questioncategories where id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_QuestionCategorie);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean updateQuestionCategorie(int id_QuestionCategorie,String categoryName)
	{
		String sql="update questioncategories set CategoryName=? where id=?";
		List<Object> param= new ArrayList<>();
		param.add(categoryName);
		param.add(id_QuestionCategorie);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static  int getIdQuestitonCategory(String name)
	{
		int id=-1;
		String sql="select id from questioncategories where CategoryName=?";
		List<Object> param= new ArrayList<>();
		param.add(name);
		try {
			ResultSet rs= excuteQuery(sql, param);
			while(rs.next())
			{
				id=rs.getInt(1);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return id;
	}
	public static  String getNameQuestionCategory(int id_Categorie)
	{
		String Name=null;
		String sql="select CategoryName from questioncategories where id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_Categorie);
		try {
			ResultSet rs= excuteQuery(sql, param);
			while(rs.next())
			{
				Name=rs.getString(1);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Name;
	}


}
