package grouptwo.quizexam.model;

import java.sql.Date;

public class Profilestudent {


	private String user;
	private String name;
	private int identityCardNumber;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private int phoneNumber;
	private String country;
	private String address;
	private String religion;
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	private Date yearOfAdmission;
	private Date yearOfGraduation;
	private String image;
	private boolean showProfile;
	

	public Profilestudent() {
	}

	public Profilestudent(String user, String name, int identityCardNumber, Date dateOfBirth, String gender,
			String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			boolean showProfile) {
		this.user = user;
		this.name = name;
		this.identityCardNumber = identityCardNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.yearOfAdmission = yearOfAdmission;
		this.yearOfGraduation = yearOfGraduation;
		this.showProfile = showProfile;
	}






	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdentityCardNumber() {
		return this.identityCardNumber;
	}

	public void setIdentityCardNumber(int identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getYearOfAdmission() {
		return this.yearOfAdmission;
	}

	public void setYearOfAdmission(Date yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public Date getYearOfGraduation() {
		return this.yearOfGraduation;
	}

	public void setYearOfGraduation(Date yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public String getImage() {
		return this.image;
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
