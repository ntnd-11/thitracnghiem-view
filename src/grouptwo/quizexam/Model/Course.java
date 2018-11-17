package grouptwo.quizexam.Model;

import java.util.Date;

public class Course {
	
	public Course() {
	}
	public Course(int subjectId, Date dateOfStarting, Date dateOfEnding, String dateOfWeek, int partOfStarting,
			int partOfEnding, int numberOfStudent, String room, boolean activate, String teacher) {
		this.subjectId = subjectId;
		this.dateOfStarting = dateOfStarting;
		this.dateOfEnding = dateOfEnding;
		this.dateOfWeek = dateOfWeek;
		this.partOfStarting = partOfStarting;
		this.partOfEnding = partOfEnding;
		this.numberOfStudent = numberOfStudent;
		this.room = room;
		this.activate = activate;
		this.teacher = teacher;
	}

	private int subjectId;
	private Date dateOfStarting;
	private Date dateOfEnding;
	private String dateOfWeek;
	private int partOfStarting;
	private int partOfEnding;
	private int numberOfStudent;
	private String room;
	private boolean activate;
	private String teacher;

	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public Date getDateOfStarting() {
		return dateOfStarting;
	}
	public void setDateOfStarting(Date dateOfStarting) {
		this.dateOfStarting = dateOfStarting;
	}
	public Date getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(Date dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
	public String getDateOfWeek() {
		return dateOfWeek;
	}
	public void setDateOfWeek(String dateOfWeek) {
		this.dateOfWeek = dateOfWeek;
	}
	public int getPartOfStarting() {
		return partOfStarting;
	}
	public void setPartOfStarting(int partOfStarting) {
		this.partOfStarting = partOfStarting;
	}
	public int getPartOfEnding() {
		return partOfEnding;
	}
	public void setPartOfEnding(int partOfEnding) {
		this.partOfEnding = partOfEnding;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public boolean isActivate() {
		return activate;
	}
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	
	
	

}
