package grouptwo.quizexam.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Profilemanager;

public class ProfilemanagerService extends BaseService{

	public ProfilemanagerService() {
		super();
	}
public List<Profilemanager> getAllProfilemanager() {
		
		String query = "select * from profilemanager";
		List<Profilemanager> lstProfilemanager = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Profilemanager profilemanager = new Profilemanager(
						rs.getString(1),
						rs.getString(2),
						rs.getDate(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getByte(8));
				lstProfilemanager.add(profilemanager);
	        }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}	
		return lstProfilemanager;
		
	}
}
