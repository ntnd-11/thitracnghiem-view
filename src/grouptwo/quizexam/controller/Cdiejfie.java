package grouptwo.quizexam.controller;

import java.util.List;

import grouptwo.quizexam.model.Course;
import grouptwo.quizexam.service.CourseService;

public class Cdiejfie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseService courseService = new CourseService();
		List<Course> test = courseService.getAllCourse();
		for(Course a : test)
		{
			System.out.println(a.getDateOfStarting());
		}
	}

}
