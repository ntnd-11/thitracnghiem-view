package grouptwo.quizexam.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grouptwo.quizexam.model.ProfileManager;;



public class ProfileManagerService extends BaseService {

	public ProfileManagerService() {
		super();
	}

	public List<ProfileManager> getAllProfileManager() {
		String query = "Select * from profilemanager";
		List<ProfileManager> lstProfileManager = new ArrayList<>();

		try {
			ResultSet rs = excuteQuery(query);
			while (rs.next()) {
				ProfileManager profileManager = new ProfileManager(
						rs.getString(1),
						rs.getString(2), 
						rs.getDate(3),
						rs.getString(4), 
						rs.getString(5), 
						rs.getString(6), 
						rs.getString(7),
						rs.getBoolean(8));
				lstProfileManager.add(profileManager);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return lstProfileManager;
	}

	public ProfileManager getProfileManagerById(int id) {
		return null;
	}

	public ProfileManager getProfileManagerByName(String subject) {
		return null;
	}

	public boolean deleteProfileManager(int id) {
		return false;
	}

	public boolean updateProfileManager(ProfileManager profileManager) {
		return false;
	}

	public boolean addProfileManager(ProfileManager profileManager) {
		return false;

	}
}
