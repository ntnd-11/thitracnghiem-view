package grouptwo.quizexam.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import grouptwo.quizexam.model.Profilestudent;

public class ProfilestudentService extends BaseService {
	public ProfilestudentService() {
		super();
	}

	public List<Profilestudent> getAllProfilesutudent() {

		String query = "select * from profilestudent";
		List<Profilestudent> lstProfilemanager = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Profilestudent profilestudent = new Profilestudent(rs.getString(1), rs.getString(2), rs.getInt(3),
						rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getDate(9),
						rs.getDate(10), rs.getBoolean(11));
				lstProfilemanager.add(profilestudent);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstProfilemanager;

	}
	public Profilestudent getProfilesutudentById(int id) {
		String query = "select * from profilestudent where Id = " +id;
		try
		{
			ResultSet rs = excuteQuery(query);
			Profilestudent profilestudent = new Profilestudent(rs.getString(1), rs.getString(2), rs.getInt(3),
					rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getDate(9),
					rs.getDate(10), rs.getBoolean(11));
			return profilestudent;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public Profilestudent getProfilestudentByName(String subject) {
		String query = "select * from profilestudent where User = " +subject;
		try
		{
			ResultSet rs = excuteQuery(query);
			Profilestudent profilestudent = new Profilestudent(rs.getString(1), rs.getString(2), rs.getInt(3),
					rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getDate(9),
					rs.getDate(10), rs.getBoolean(11));
			return profilestudent;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public boolean deleteProfilestudent(int id) {
		String query = "DELETE FROM Profilestudent WHERE Id=?" ;
		List<Object> params=new ArrayList<>();
		params.add(id);
		try {
			
			return executeUpdate(query,params);
			
		}
		catch(SQLException ex) {
			
			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean InsertProfilestudent(String user, String name, int identityCardNumber, Date dateOfBirth, String gender,
			String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			boolean showProfile)
	{
		//String query = "INSERT INTO EXAMS VALUES(?,?,?,?,?)" ;
		String query="Insert into profilestudent(profilestudent.User,profilestudent.Name,IdentityCardNumber,DateOfBirth,Gender,Email,PhoneNumber,Country,Address,Religion,YearOfAdmission,YearOfGraduation,Image,ShowProfile) Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params=new ArrayList<>();
		params.add(user);
		params.add(name);
		params.add(identityCardNumber);
		params.add(dateOfBirth);
		params.add(gender);
		params.add(email);
		params.add(phoneNumber);
		params.add(country);
		params.add(yearOfAdmission);
		params.add(yearOfGraduation);
		params.add(showProfile);
		
		try {
			
			return executeUpdate(query,params);
			
		}
		catch(SQLException ex) {
			
			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return false;
	}
	public boolean UpdateProfilestudent(String user, String name, int identityCardNumber, Date dateOfBirth, String gender,
			String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			boolean showProfile)
	{
		String query="update profilestudent set profilestudent.Name=?,IdentityCardNumber=?,DateOfBirth=?,Gender=?,Email=?,PhoneNumber=?,Country=?,Address=?,Religion=?,YearOfAdmission=?,YearOfGraduation=?,Image=?,ShowProfile=? where profilestudent.User=?";
		List<Object> params=new ArrayList<>();
		params.add(user);
		params.add(name);
		params.add(identityCardNumber);
		params.add(dateOfBirth);
		params.add(gender);
		params.add(email);
		params.add(phoneNumber);
		params.add(country);
		params.add(yearOfAdmission);
		params.add(yearOfGraduation);
		params.add(showProfile);
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

			Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}
	
}
