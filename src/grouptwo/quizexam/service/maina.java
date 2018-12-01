package grouptwo.quizexam.service;

import grouptwo.quizexam.model.Course;
import grouptwo.quizexam.model.Exam;

public class maina {

	public maina() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for(int c:CourseService.getAllId())
		{
			System.out.println(c+"");
		}

	}

}
