package grouptwo.quizexam.beans;

import java.time.DayOfWeek;
import java.util.Date;

public class Course {
	
	public int getSubject() {
		return subject;
	}
	public void setSubject(int subject) {
		this.subject = subject;
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
	public DayOfWeek getDateOfWeek() {
		return dateOfWeek;
	}
	public void setDateOfWeek(DayOfWeek dateOfWeek) {
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
	public int getTeacher() {
		return teacher;
	}
	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}
	private int subject;
	private Date dateOfStarting;
	private Date dateOfEnding;
	private DayOfWeek dateOfWeek;
	private int partOfStarting;
	private int partOfEnding;
	private int numberOfStudent;
	private String room;
	private boolean activate;
	private int teacher;
	
	
	
	

}
