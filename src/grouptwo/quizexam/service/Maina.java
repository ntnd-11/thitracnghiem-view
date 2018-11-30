package grouptwo.quizexam.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Maina{

	public Maina() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BaseService bs=new BaseService();
		String sql="delete from questioncategories where CategoryName=?";
		String a="dsad";
		List<Object> param=new  ArrayList<>();
		param.add(a);
		try {
			bs.executeUpdate(sql,param);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
