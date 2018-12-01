package grouptwo.quizexam.service;

import grouptwo.quizexam.beans.AnswerBean;
import grouptwo.quizexam.model.Answer;

public class maina {

	public maina() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AnswerService ans=new AnswerService();
		
		for(Answer c:AnswerBean.getLsQus())
		{
			System.out.println(c.getId());
		}

	}

}
