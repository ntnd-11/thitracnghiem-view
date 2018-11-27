package grouptwo.quizexam.model;

import java.util.Date;

public class ProfileManager {

	public ProfileManager() {
	}

	public ProfileManager(String user_UserName, String name, Date dateOfBirth, String gender, String email,
			String phoneNumber, String image, boolean showProfile) {
		super();
		this.user_UserName = user_UserName;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.image = image;
		this.showProfile = showProfile;
	}

	private String user_UserName;
	private String name;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private String phoneNumber;
	private String image;
	private boolean showProfile;

	public String getUser_UserName() {
		return user_UserName;
	}

	public void setUser_UserName(String user_UserName) {
		this.user_UserName = user_UserName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isShowProfile() {
		return showProfile;
	}

	public void setShowProfile(boolean showProfile) {
		this.showProfile = showProfile;
	}
	
	
}
