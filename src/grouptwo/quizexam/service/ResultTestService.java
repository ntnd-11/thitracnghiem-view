package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.ResultTest;

public class  ResultTestService extends BaseService {

	public ResultTestService() {
		// TODO Auto-generated constructor stub
		super();
	}
	public  boolean addResultTest(int id, int score,int id_Exam,String user_ProfileStudent)
	{
		String sql="insert into resulttests(Score,Exam,ProfileStudent) values(?,?,?)";
		List<Object> param= new ArrayList<>();
		param.add(score);
		param.add(id_Exam);
		param.add(user_ProfileStudent);
		try {
			return executeUpdate(sql,param);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  List< ResultTest> getAllQuestionCategorie()
	{
		List< ResultTest> list=null;
		String sql="select * from resulttests";
		ResultTest qsc=null;
		try {
			ResultSet rs=excuteQuery(sql);
			list=new ArrayList<>();
			while(rs.next())
			{
				qsc=new ResultTest();
				qsc.setResultId(rs.getInt(1));
				qsc.setScore(rs.getInt(2));
				qsc.setExamID(rs.getInt(3));
				qsc.setStudentId(rs.getInt(4));
				list.add(qsc);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
	public   ResultTest getResultTest(int id)
	{
		 ResultTest qsc=new  ResultTest();
		String sql="select * from resulttests where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new ResultTest();
				qsc.setResultId(rs.getInt(1));
				qsc.setScore(rs.getInt(2));
				qsc.setExamID(rs.getInt(3));
				qsc.setStudentId(rs.getInt(4));

			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return qsc;
	}
	public   ResultTest getResultTest(String proFileStudent)
	{
		 ResultTest qsc=new  ResultTest();
			String sql="select * from resulttests where ProfileStudent=?";
			List<Object> param= new ArrayList<>();
			param.add(proFileStudent);
			try {
				ResultSet rs=excuteQuery(sql,param);
				while(rs.next())
				{
					qsc=new ResultTest();
					qsc.setResultId(rs.getInt(1));
					qsc.setScore(rs.getInt(2));
					qsc.setExamID(rs.getInt(3));
					qsc.setStudentId(rs.getInt(4));

				}
			}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			return qsc;
	}
	public  boolean deleteResultTest(int id_ResultTest)
	{
		String sql="delete from resulttests where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_ResultTest);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  boolean updateResultTest(int id, int score,int id_Exam,String user_ProfileStudent)
	{
		String sql="update resulttests set Score=?,Exam=?,ProfileStudent=? where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(score);
		param.add(id_Exam);
		param.add(user_ProfileStudent);
		param.add(id);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  List<Integer> getListIdResultTest(String profileStudentName)
	{
		int id=-1;
		List<Integer> listId=new ArrayList<>();
		String sql="select id from resulttests where ProfileStudent=?";
		List<Object> param= new ArrayList<>();
		param.add(profileStudentName);
		try {
			ResultSet rs= excuteQuery(sql, param);
			while(rs.next())
			{
				id=rs.getInt(1);
				listId.add(id);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listId;
	}
	public  String getProfileStu_ResultTest(String id_ResultTest)
	{
		String sql="select ProfileStudent from resulttests where id=?";
		String Name=null;
		List<Object> param= new ArrayList<>();
		param.add(id_ResultTest);
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
