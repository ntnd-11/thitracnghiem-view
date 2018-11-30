package grouptwo.quizexam.beans;

import java.util.List;

import grouptwo.quizexam.model.Answer;
import grouptwo.quizexam.service.AnswerService;

public class AnswerBean {
	private static List<Answer> lsQus;
	private AnswerService ans;
	public AnswerBean() {
		ans=new AnswerService();
		lsQus=ans.getAllAnswers();
	}
	public List<Answer> getLsQus() {
		return lsQus;
	}
	public void setLsQus(List<Answer> lsQus) {
		this.lsQus = lsQus;
	}

}
