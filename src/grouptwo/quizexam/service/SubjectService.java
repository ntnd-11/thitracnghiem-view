package grouptwo.quizexam.service;
<<<<<<< HEAD

=======
>>>>>>> 578acaef5b4dc80b3d7945e96b48df5f58150c6d
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import grouptwo.quizexam.model.Questioncategorie;
import grouptwo.quizexam.model.Subject;

public class SubjectService extends BaseService {

	public SubjectService() {
		// TODO Auto-generated constructor stub
		super();
	}
	public  boolean addSubject(String Name,String Faculty,int credit,String type,boolean active )
	{
		String sql="insert into subjects(Name,Faculty,Credit,Type,Activate) values(?,?,?,?,?)";
		List<Object> param= new ArrayList<>();
		param.add(Name);
		param.add(Faculty);
		param.add(credit);
		param.add(type);
		param.add(active);
			try {
				return executeUpdate(sql,param);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		return false;
	}
	public  List<Subject> getAllSubject()
	{
		List<Subject> list=null;
		Subject qsc=null;
		String sql="select * from subjects";
		try {
			ResultSet rs=excuteQuery(sql);
			list=new ArrayList<>();
			
			while(rs.next())
			{
				qsc=new Subject();
				qsc.setId(rs.getInt(1));
				qsc.setName(rs.getString(2));
				qsc.setFaculty(rs.getString(3));
				qsc.setCredit(rs.getInt(4));
				qsc.setType(rs.getString(5));
				qsc.setActivate(rs.getByte(6));
				list.add(qsc);
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	public  Subject getSubject(int id)
	{
		Subject qsc=null;
		String sql="select * from subjects where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Subject();
				qsc.setId(rs.getInt(1));
				qsc.setName(rs.getString(2));
				qsc.setFaculty(rs.getString(3));
				qsc.setCredit(rs.getInt(4));
				qsc.setType(rs.getString(5));
				qsc.setActivate(rs.getByte(6));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return qsc;
	}
	public  Subject getSubject(String name)
	{
		Subject qsc=null;
		String sql="select * from subjects where Name=?";
		List<Object> param= new ArrayList<>();
		param.add(name);
		try {
			ResultSet rs=excuteQuery(sql,param);
			while(rs.next())
			{
				qsc=new Subject();
				qsc.setId(rs.getInt(1));
				qsc.setName(rs.getString(2));
				qsc.setFaculty(rs.getString(3));
				qsc.setCredit(rs.getInt(4));
				qsc.setType(rs.getString(5));
				qsc.setActivate(rs.getByte(6));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return qsc;
	}
	public  boolean deleteSubject(int id_Subject)
	{
		String sql="delete from subjects where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_Subject);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  boolean updateSubject(String Name,String Faculty,int credit,String type,boolean active )
	{
		String sql="update subjects set Name=?,Faculty=?,Credit=?,Type=?,Activate=? where id=?";
		List<Object> param= new ArrayList<>();
		param.add(Name);
		param.add(Faculty);
		param.add(credit);
		param.add(type);
		param.add(active);
		try {
			return executeUpdate(sql, param);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public  int getIdSubject(String subjectName)
	{
		int id=-1;
		String sql="select Id from subjects where Name=?";
		List<Object> param= new ArrayList<>();
		param.add(subjectName);
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
	public  String getNameSubject(int id_Subject)
	{

		String Name=null;
		String sql="select Name from subjects where Id=?";
		List<Object> param= new ArrayList<>();
		param.add(id_Subject);
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
=======

import grouptwo.quizexam.model.Subject;


public class SubjectService extends BaseService {

	public SubjectService() {
		super();
	}

	public List<Subject> getAllSubjects() {
		String query = "Select * from roleuser";
		List<Subject> lstSubjects = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Subject subjects = new Subject(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getBoolean(6));
				lstSubjects.add(subjects);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstSubjects;
	}

	public Subject getSubjectsById(int id) {
		String query = "Select * from subjects where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Subject subject = new Subject(
					rs.getString("Name"),
					rs.getString("Faculty"),
					rs.getInt("Credit"),
					rs.getString("Type"),
					rs.getBoolean("Activate"));
			return subject;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}

	public Subject getSubjectsByName(String subject) {
		return null;
	}

	public boolean deleteSubjects(int id) {
		String query="Delete from subjects where Id=?";
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

	public boolean updateSubjects(Subject subject) {
		{
			String query ="update subjects set "
					+ "Name=?,"
					+ "Faculty = ?,"
					+ "Credit = ?,"
					+ "Type = ?,"
					+ "Activate = ?,"
					+ "Where Id= ?";
			List<Object> params= new ArrayList<>();
			params.add(subject.getSubjectName());
			params.add(subject.getFaculty());
			params.add(subject.getCredit());
			params.add(subject.getType());
			params.add(subject.isActivity());
			params.add(subject.getSubjectID());
			try {
				boolean action = executeUpdate(query, params);
				return action;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean addSubjects(Subject subject) {
		String query="Insert into subjects (Name,Faculty,Credit,Type,Activate)"
				+"values (?,?,?,?,?)";
	List<Object> params= new ArrayList<>();
	params.add(subject.getSubjectName());
	params.add(subject.getFaculty());
	params.add(subject.getCredit());
	params.add(subject.getType());
	params.add(subject.isActivity());
	try {
		boolean action = executeUpdate(query, params);
		return action;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;


>>>>>>> 578acaef5b4dc80b3d7945e96b48df5f58150c6d
	}
}
