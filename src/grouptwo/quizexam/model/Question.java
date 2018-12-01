package grouptwo.quizexam.model;

public class Question {

	private int questionId;
	private String question;
	private String image;
	private String level;
	private int questionCategoryId;
	private int creatorId;
	private int correctAnswerId;
	


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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

	public int getQuestionCategoryId() {
		return questionCategoryId;
	}

	public void setQuestionCategoryId(int questionCategoryId) {
		this.questionCategoryId = questionCategoryId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public int getCorrectAnswerId() {
		return correctAnswerId;
	}

	public void setCorrectAnswerId(int correctAnswerId) {
		this.correctAnswerId = correctAnswerId;
	}

	public Question() {
		super();
	}
	
	public Question(String question, String image, String level, int questionCategoryId, int creatorId,
			int correctAnswerId) {
		super();
		this.question = question;
		this.image = image;
		this.level = level;
		this.questionCategoryId = questionCategoryId;
		this.creatorId = creatorId;
		this.correctAnswerId = correctAnswerId;
	}
	
	public Question(int questionId, String question, String image, String level, int questionCategoryId, int creatorId,
			int correctAnswerId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.image = image;
		this.level = level;
		this.questionCategoryId = questionCategoryId;
		this.creatorId = creatorId;
		this.correctAnswerId = correctAnswerId;
	}
	
	
	
}
