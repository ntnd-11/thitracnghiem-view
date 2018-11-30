package grouptwo.quizexam.beans;

import java.util.List;

import grouptwo.quizexam.model.Answer;
import grouptwo.quizexam.service.AnswerService;

public class AnswerBean {
	private static List<Answer> lsQus;
	private static AnswerService ans;
	static {
		ans=new AnswerService();
		setLsQus(ans.getAllAnswers());
	}
	public AnswerBean() {
		
	}
	public static List<Answer> getLsQus() {
		return lsQus;
	}
	public static void setLsQus(List<Answer> lsQus) {
		AnswerBean.lsQus = lsQus;
	}



}
