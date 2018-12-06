package grouptwo.quizexam.model;

import java.util.Date;

public class Exam {

	private Integer id;
	private String name;
	private Date timeStarting;
	private Integer numQuestions;
	private Date timeFinishing;
	private Integer courseID;
	private Course courseObject;
	private boolean activate;
	private Integer creatorID;
	private Integer numDifficult;
	private Integer numNormal;
	private Integer numEasy;
	private Integer limitTime;
	
	public Exam(String name, Date timeStarting, Integer numQuestions, Date timeFinishing, Integer courseID,
			boolean activate, Integer creatorID, Integer numDifficult, Integer numNormal, Integer numEasy,
			Integer limitTime) {
		super();
		this.name = name;
		this.timeStarting = timeStarting;
		this.numQuestions = numQuestions;
		this.timeFinishing = timeFinishing;
		this.courseID = courseID;
		this.activate = activate;
		this.creatorID = creatorID;
		this.numDifficult = numDifficult;
		this.numNormal = numNormal;
		this.numEasy = numEasy;
		this.limitTime = limitTime;
	}


	public Exam(Integer id, String name, Date timeStarting, Integer numQuestions, Date timeFinishing, Integer courseID,
			boolean activate, Integer creatorID, Integer numDifficult, Integer numNormal, Integer numEasy,
			Integer limitTime) {
		super();
		this.id = id;
		this.name = name;
		this.timeStarting = timeStarting;
		this.numQuestions = numQuestions;
		this.timeFinishing = timeFinishing;
		this.courseID = courseID;
		this.activate = activate;
		this.creatorID = creatorID;
		this.numDifficult = numDifficult;
		this.numNormal = numNormal;
		this.numEasy = numEasy;
		this.limitTime = limitTime;
	}
	
	public Integer getNumDifficult() {
		return numDifficult;
	}


	public void setNumDifficult(Integer numDifficult) {
		this.numDifficult = numDifficult;
	}


	public Integer getNumNormal() {
		return numNormal;
	}


	public void setNumNormal(Integer numNormal) {
		this.numNormal = numNormal;
	}


	public Integer getNumEasy() {
		return numEasy;
	}


	public void setNumEasy(Integer numEasy) {
		this.numEasy = numEasy;
	}


	public Integer getLimitTime() {
		return limitTime;
	}


	public void setLimitTime(Integer limitTime) {
		this.limitTime = limitTime;
	}


	public void setCreatorID(Integer creatorID) {
		this.creatorID = creatorID;
	}
	public Exam()
	{
		
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
	public boolean isActivate() {
		return activate;
	}
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	public Course getCourseObject() {
		return courseObject;
	}
	public void setCourseObject(Course courseObject) {
		this.courseObject = courseObject;
	}
	
	
}
