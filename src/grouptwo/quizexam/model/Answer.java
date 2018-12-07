package grouptwo.quizexam.model;

import java.io.Serializable;

public class Answer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Integer questionId;
	private String answer;
<<<<<<< HEAD
	private boolean isTick;
=======
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
	public Answer() {
	}

	public Answer(int id, Integer questionId, String answer) {
		this.id = id;
		this.questionId = questionId;
		this.answer = answer;
	}
	public Answer(Integer questionId, String answer) {
		this.questionId = questionId;
		this.answer = answer;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
<<<<<<< HEAD

	public boolean getisTick() {
		return isTick;
	}

	public void setTick(boolean isTick) {
		this.isTick = isTick;
	}

	
=======
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
}
