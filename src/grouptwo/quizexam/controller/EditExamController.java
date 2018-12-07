package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.model.Course;
import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.model.Subject;
import grouptwo.quizexam.service.CourseService;
import grouptwo.quizexam.service.ExamService;
import grouptwo.quizexam.service.QuestionService;
import grouptwo.quizexam.service.SubjectService;

@WebServlet("/EditExam")
public class EditExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int amountPerPage;
	List<Integer> lstNumType;
	List<Question> lstQuestion;
	Exam exam;
	Subject subject;
	
    public EditExamController() {
        super();
        
    }
    public void init() throws ServletException {
    	super.init();
        lstQuestion = new ArrayList<>();
        lstNumType = new ArrayList<>();
        
        for(int i= 0;i<3;i++)
        {
        	lstNumType.add(0);
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		int examId = 1;
		lstQuestion = QuestionService.getQuestionByExamId(examId);
		exam = ExamService.getExamById(examId);
		//subject = SubjectService.getSubjectsById(exam.get);
		
	/*	
		List<Question> lstCurrentQuestions = new ArrayList<>();
		int page;

		if(lstQuestion.size()>0)
		{
			
			page = request.getParameter("page") == null? 1 :Integer.parseInt(request.getParameter("page")) ;
		}
		
		
		int startPage = amountPerPage*(page-1);
		int finishPage = amountPerPage*page-1> lstQuestion.size()-1? lstQuestion.size() :amountPerPage*page-1;
		lstCurrentQuestions = lstQuestion.subList(startPage, finishPage);
		
		//request.setAttribute("lstCurrentQuestion", lstCurrentQuestions);
		getServletContext().setAttribute("lstCurrentQuestion", lstCurrentQuestions);
		getServletContext().setAttribute("subject", subject);
		getServletContext().setAttribute("listType", lstNumType);
		
		List<Course> lstCourse = CourseService.getAllCourse();
		request.setAttribute("lstCourse", lstCourse);*/


		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/Views/QLDeThi/addExam.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
	}

}
