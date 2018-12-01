package grouptwo.quizexam.model;

import java.util.Date;

public class Exam {

	private Integer id;
	private String name;
	private Date timeStarting;	
	private Integer numQuestions;
	private Date timeFinishing;
	private Integer courseID;
	private boolean avtivate;
	private Integer creatorID;
	
	public Exam()
	{
		
	}
	public Exam(Integer id,String name,Date timeStarting,Integer numQuestions,Date timeFinishing,Integer courseID,boolean avtivate,Integer creatorID)
	{
		this.id=id;
		this.name=name;
		this.timeStarting=timeStarting;
		this.numQuestions=numQuestions;
		this.timeFinishing=timeFinishing;
		this.courseID=courseID;
		this.avtivate=avtivate;
		this.creatorID=creatorID;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getNumQuestions() {
		return numQuestions;
	}
	public void setNumQuestions(Integer numQuestions) {
		this.numQuestions = numQuestions;
	}
	public Date getTimeFinishing() {
		return timeFinishing;
	}
	public void setTimeFinishing(Date timeFinishing) {
		this.timeFinishing = timeFinishing;
	}
	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public boolean isAvtivate() {
		return avtivate;
	}
	public void setAvtivate(boolean avtivate) {
		this.avtivate = avtivate;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	
	
}
