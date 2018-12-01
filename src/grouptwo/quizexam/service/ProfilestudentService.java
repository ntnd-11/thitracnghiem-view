package grouptwo.quizexam.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.Profilestudent;

public class ProfilestudentService extends BaseService {
	public ProfilestudentService() {
		super();
	}

	public static List<Profilestudent> getAllProfilesutudent() {

		String query = "select * from profilestudents";
		List<Profilestudent> lstProfilemanager = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				Profilestudent profilestudent = new Profilestudent(
						rs.getInt("Id"), 
						rs.getString("Name"),
						rs.getInt("IdentityCardNumber"),
						rs.getDate("DateOfBirth"),
						rs.getString("Gender"),
						rs.getString("PhoneNumber"),
						rs.getString("Country"),
						rs.getString("Address"),
						rs.getString("Religion"),
						rs.getInt("YearOfAdmission"),
						rs.getInt("YearOfGraduation"),
						rs.getString("Image"),
						rs.getBoolean("ShowProfile"),
						rs.getInt("User"));
				lstProfilemanager.add(profilestudent);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstProfilemanager;

	}

	public static Profilestudent getProfilesutudentById(int id) {
		String query = "select * from profilestudents where Id = " + id;
		Profilestudent profilestudent = null;
		try {
			ResultSet rs = excuteQuery(query);
			while(rs.next())
			{
				profilestudent = new Profilestudent(
					rs.getInt("Id"), 
					rs.getString("Name"),
					rs.getInt("IdentityCardNumber"),
					rs.getDate("DateOfBirth"),
					rs.getString("Gender"),
					rs.getString("PhoneNumber"),
					rs.getString("Country"),
					rs.getString("Address"),
					rs.getString("Religion"),
					rs.getInt("YearOfAdmission"),
					rs.getInt("YearOfGraduation"),
					rs.getString("Image"),
					rs.getBoolean("ShowProfile"),
					rs.getInt("User"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return profilestudent;
	}

	public static Profilestudent getProfilestudentByName(String subject) {
		String query = "select * from profilestudents where User = " + subject;
		try {
			ResultSet rs = excuteQuery(query);
			Profilestudent profilestudent = new Profilestudent(
					rs.getInt("Id"), 
					rs.getString("Name"),
					rs.getInt("IdentityCardNumber"),
					rs.getDate("DateOfBirth"),
					rs.getString("Gender"),
					rs.getString("PhoneNumber"),
					rs.getString("Country"),
					rs.getString("Address"),
					rs.getString("Religion"),
					rs.getInt("YearOfAdmission"),
					rs.getInt("YearOfGraduation"),
					rs.getString("Image"),
					rs.getBoolean("ShowProfile"),
					rs.getInt("User"));
			return profilestudent;
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;
	}

	public static boolean deleteProfilestudent(int id) {
		String query = "DELETE FROM Profilestudents WHERE Id=?";
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {

			return executeUpdate(query, params);

		} catch (SQLException ex) {

		}

		return false;
	}

	public static boolean InsertProfilestudent(String user, String name, int identityCardNumber, Date dateOfBirth,
			String gender, String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			boolean showProfile) {
		// String query = "INSERT INTO EXAMS VALUES(?,?,?,?,?)" ;
		String query = "Insert into profilestudent(profilestudent.User,profilestudent.Name,IdentityCardNumber,DateOfBirth,Gender,Email,PhoneNumber,Country,Address,Religion,YearOfAdmission,YearOfGraduation,Image,ShowProfile) Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<>();
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

			// Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

	public static boolean UpdateProfilestudent(String user, String name, int identityCardNumber, Date dateOfBirth,
			String gender, String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			boolean showProfile) {
		String query = "update profilestudents set profilestudent.Name=?,IdentityCardNumber=?,DateOfBirth=?,Gender=?,Email=?,PhoneNumber=?,Country=?,Address=?,Religion=?,YearOfAdmission=?,YearOfGraduation=?,Image=?,ShowProfile=? where profilestudent.User=?";
		List<Object> params = new ArrayList<>();
		
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

			// Logger.getLogger(ExamsService.class.getName()).log(Level.SEVERE, null, ex);
		}

		return false;
	}

}
