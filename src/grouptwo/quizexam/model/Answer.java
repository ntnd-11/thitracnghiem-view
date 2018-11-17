package grouptwo.quizexam.model;

public class Answer {
	
	public Answer() {
		super();
	}
	public Answer(int Id,int QuestionId,String Answer) {
		super();
		this.id = Id;
		this.questionId = QuestionId;
		this.answer = Answer;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int questionId;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	private String answer;
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
