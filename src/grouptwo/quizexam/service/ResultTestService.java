package grouptwo.quizexam.service;

<<<<<<< HEAD
import java.sql.Date;
=======
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.ResultTest;

<<<<<<< HEAD
public class ResultTestService extends BaseService {
=======
public class  ResultTestService extends BaseService {
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0

	public ResultTestService() {
		// TODO Auto-generated constructor stub
		super();
	}
<<<<<<< HEAD

	public static boolean addResultTest(int id, int score, int id_Exam, String idStudent, Date startTime,
			Date finishTime) {
		String sql = "insert into resulttests(Score,Exam,Student,StartTime,FinishTime) values(?,?,?,?,?)";
		List<Object> param = new ArrayList<>();
		param.add(score);
		param.add(id_Exam);
		param.add(idStudent);
		param.add(startTime);
		param.add(finishTime);
		try {
			return executeUpdate(sql, param);
=======
	public static  boolean addResultTest(int id, int score,int id_Exam,String user_ProfileStudent)
	{
		String sql="insert into resulttests(Score,Exam,ProfileStudent) values(?,?,?)";
		List<Object> param= new ArrayList<>();
		param.add(score);
		param.add(id_Exam);
		param.add(user_ProfileStudent);
		try {
			return executeUpdate(sql,param);
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
<<<<<<< HEAD

	public static List<ResultTest> getAllQuestionCategorie() {
		List<ResultTest> list = null;
		String sql = "select * from resulttests";
		ResultTest qsc = null;
		try {
			ResultSet rs = excuteQuery(sql);
			list = new ArrayList<>();
			while (rs.next()) {
				qsc = new ResultTest();
=======
	public static  List< ResultTest> getAllQuestionCategorie()
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
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
				qsc.setResultId(rs.getInt(1));
				qsc.setScore(rs.getInt(2));
				qsc.setExamID(rs.getInt(3));
				qsc.setStudentId(rs.getInt(4));
				list.add(qsc);
			}
<<<<<<< HEAD
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	public static ResultTest getResultTest(int id) {
		ResultTest qsc = new ResultTest();
		String sql = "select * from resulttests where Id=?";
		List<Object> param = new ArrayList<>();
		param.add(id);
		try {
			ResultSet rs = excuteQuery(sql, param);
			while (rs.next()) {
				qsc = new ResultTest();
=======
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
	public static ResultTest getResultTest(int id)
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
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
				qsc.setResultId(rs.getInt(1));
				qsc.setScore(rs.getInt(2));
				qsc.setExamID(rs.getInt(3));
				qsc.setStudentId(rs.getInt(4));

			}
<<<<<<< HEAD
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return qsc;
	}

	public static ResultTest getResultTest(String proFileStudent) {
		ResultTest qsc = new ResultTest();
		String sql = "select * from resulttests where ProfileStudent=?";
		List<Object> param = new ArrayList<>();
		param.add(proFileStudent);
		try {
			ResultSet rs = excuteQuery(sql, param);
			while (rs.next()) {
				qsc = new ResultTest();
				qsc.setResultId(rs.getInt(1));
				qsc.setScore(rs.getInt(2));
				qsc.setExamID(rs.getInt(3));
				qsc.setStudentId(rs.getInt(4));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return qsc;
	}

	public static boolean deleteResultTest(int id_ResultTest) {
		String sql = "delete from resulttests where Id=?";
		List<Object> param = new ArrayList<>();
		param.add(id_ResultTest);
		try {
			return executeUpdate(sql, param);
		} catch (SQLException e) {
=======
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return qsc;
	}
	public  static  ResultTest getResultTest(String proFileStudent)
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
	public static  boolean deleteResultTest(int id_ResultTest)
	{
		String sql="delete from resulttests where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_ResultTest);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
			System.out.println(e.getMessage());
		}
		return false;
	}
<<<<<<< HEAD

	public static boolean updateResultTest(int id, int score, int id_Exam, String user_ProfileStudent) {
		String sql = "update resulttests set Score=?,Exam=?,ProfileStudent=? where Id=?";
		List<Object> param = new ArrayList<>();
=======
	public static  boolean updateResultTest(int id, int score,int id_Exam,String user_ProfileStudent)
	{
		String sql="update resulttests set Score=?,Exam=?,ProfileStudent=? where Id=?";
		List<Object> param= new ArrayList<>();
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
		param.add(score);
		param.add(id_Exam);
		param.add(user_ProfileStudent);
		param.add(id);
		try {
			return executeUpdate(sql, param);
<<<<<<< HEAD
		} catch (SQLException e) {
=======
		}
		catch (SQLException e) {
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
			System.out.println(e.getMessage());
		}
		return false;
	}
<<<<<<< HEAD

	public static List<Integer> getListIdResultTest(String profileStudentName) {
		int id = -1;
		List<Integer> listId = new ArrayList<>();
		String sql = "select id from resulttests where ProfileStudent=?";
		List<Object> param = new ArrayList<>();
		param.add(profileStudentName);
		try {
			ResultSet rs = excuteQuery(sql, param);
			while (rs.next()) {
				id = rs.getInt(1);
				listId.add(id);
			}
		} catch (SQLException e) {
=======
	public static  List<Integer> getListIdResultTest(String profileStudentName)
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
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
			System.out.println(e.getMessage());
		}
		return listId;
	}
<<<<<<< HEAD

	public static String getProfileStu_ResultTest(String id_ResultTest) {
		String sql = "select ProfileStudent from resulttests where id=?";
		String Name = null;
		List<Object> param = new ArrayList<>();
		param.add(id_ResultTest);
		try {
			ResultSet rs = excuteQuery(sql, param);
			while (rs.next()) {
				Name = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Name;
	}

	public static boolean addResultTest(double grade, int idExam, int idStudent, String timeStrarting, String currentTimeSubmit) {

		String sql = "insert into resulttests(Score,Exam,Student,StartTime,FinishTime) values(?,?,?,?,?)";
		List<Object> param = new ArrayList<>();
		param.add(grade);
		param.add(idExam);
		param.add(idStudent);
		param.add(timeStrarting);
		param.add(currentTimeSubmit);
		try {
			return executeUpdate(sql, param);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
=======
	public static   String getProfileStu_ResultTest(String id_ResultTest)
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
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
	}
}
