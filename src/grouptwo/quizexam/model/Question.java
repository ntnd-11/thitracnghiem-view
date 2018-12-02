package grouptwo.quizexam.model;

import java.util.List;

import grouptwo.quizexam.service.AnswerService;

public class Question {

	private int id;
	private String question;
	private String image;
	private String level;
	private int questionCategoryID;
	private List<Answer> lsAnswer;
	private Answer answerCorrect;
	private int creatorID;
	private int correctAnswerID;
	public int getId() {
		return id;
	}
	
	public Question(int id, String question, String image, String level,int questionCategoryID,int creatorID,
			int correctAnswerID) {
		this.id = id;
		this.question = question;
		this.image = image;
		this.level = level;
		
		this.questionCategoryID = questionCategoryID;
		this.creatorID = creatorID;
		this.correctAnswerID = correctAnswerID;
		
		this.lsAnswer= AnswerService.getAnswersByIdForQuestion(id);
		this.answerCorrect= AnswerService.getAnswersById(correctAnswerID);
	}
	public Question( String question, String image, String level,
			int correctAnswerID, int questionCategoryID,int creatorID) {
		this.question = question;
		this.image = image;
		this.level = level;
		this.questionCategoryID = questionCategoryID;
		this.creatorID = creatorID;
		this.correctAnswerID = correctAnswerID;
	}
	public Question( String question, String image, String level,
			 int questionCategoryID,int correctAnswerID,int creatorID,int id) {
		this.question = question;
		this.image = image;
		this.level = level;
		this.questionCategoryID = questionCategoryID;
		this.creatorID = creatorID;
		this.correctAnswerID = correctAnswerID;
		this.id=id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getQuestionCategoryID() {
		return questionCategoryID;
	}
	public void setQuestionCategoryID(int questionCategoryID) {
		this.questionCategoryID = questionCategoryID;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	public int getCorrectAnswerID() {
		return correctAnswerID;
	}
	public void setCorrectAnswerID(int correctAnswerID) {
		this.correctAnswerID = correctAnswerID;
	}

	public List<Answer> getLsAnswer() {
		return lsAnswer;
	}

	public void setLsAnswer(List<Answer> lsAnswer) {
		this.lsAnswer = lsAnswer;
	}

	public Answer getAnswerCorrect() {
		return answerCorrect;
	}

	public void setAnswerCorrect(Answer answerCorrect) {
		this.answerCorrect = answerCorrect;
	}

		
	
}
