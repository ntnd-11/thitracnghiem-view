package grouptwo.quizexam.model;

import java.util.Date;

public class Exam {

	private int id;
	private String name;
	private Date timeStarting;	
	private int numQuestions;
	private Date timeFinishing;
	private int courseID;
	public Exam(int id,String name,Date timeStarting,int numQuestions,Date timeFinishing,int courseID)
	{
		this.id=id;
		this.name=name;
		this.timeStarting=timeStarting;
		this.numQuestions=numQuestions;
		this.timeFinishing=timeFinishing;
		this.courseID=courseID;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTimeStarting() {
		return timeStarting;
	}
	public void setTimeStarting(Date timeStarting) {
		this.timeStarting = timeStarting;
	}
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}
	public Date getTimeFinishing() {
		return timeFinishing;
	}
	public void setTimeFinishing(Date timeFinishing) {
		this.timeFinishing = timeFinishing;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public boolean isAvtivate() {
		return avtivate;
	}
	public void setAvtivate(boolean avtivate) {
		this.avtivate = avtivate;
	}
	public String getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}
	private boolean avtivate;
	private String creatorID;
	
	
}
