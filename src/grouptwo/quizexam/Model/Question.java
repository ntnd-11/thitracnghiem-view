package grouptwo.quizexam.Model;

public class questions {

	private int id;
	private String question;
	private String image;
	private String level;
	private int questionCategoryID;
	private String creatorID;
	private int correctAnswerID;
	public int getId() {
		return id;
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
	public String getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}
	public int getCorrectAnswerID() {
		return correctAnswerID;
	}
	public void setCorrectAnswerID(int correctAnswerID) {
		this.correctAnswerID = correctAnswerID;
	}

		
	
}
