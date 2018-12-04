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

import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.QuestionService;
import grouptwo.quizexam.utils.CalculationHelper;

@WebServlet("/AddExam")
public class AddExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Question> lstQuestion;
	int amountPerPage;
    public AddExamController() {
        super();
        lstQuestion = new ArrayList<>();
        amountPerPage = 10;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		List<Question> lstCurrentQuestions = new ArrayList<>();
		int page=1;
		if (lstQuestion.size()!=0)
		{
			if(request.getParameter("page")!=null)
			{
				page = Integer.parseInt(request.getParameter("page"));
			}
			lstCurrentQuestions = lstQuestion.subList(amountPerPage*(page-1), amountPerPage*page-1);

		}
		else 
			if(request.getParameter("difficult")!=null
				&& request.getParameter("normal")!=null
				&& request.getParameter("easy")!=null)
			{
					// load lstQuestion
					int numDiff = Integer.parseInt(request.getParameter("difficult"));
					int numNormal = Integer.parseInt(request.getParameter("normal"));
					int numEasy = Integer.parseInt(request.getParameter("easy"));
					

					// taking random question
					List<Question> lstQuestionType = QuestionService.getRandQuestionByLevel("Khó", numDiff);
					lstQuestion.addAll(lstQuestionType);
					lstQuestionType = QuestionService.getRandQuestionByLevel("Trung bình", numNormal);
					lstQuestion.addAll(lstQuestionType);
					lstQuestionType = QuestionService.getRandQuestionByLevel("Dễ", numEasy);
					lstQuestion.addAll(lstQuestionType);
					// refresh page
					
					int numberPage = CalculationHelper.rouding(lstQuestion.size(),amountPerPage);
					getServletContext().setAttribute("numberPage",numberPage);

					lstCurrentQuestions = lstQuestion.subList(amountPerPage*(page-1), amountPerPage*page-1);
			}				

		request.setAttribute("lstCurrentQuestion", lstCurrentQuestions);
	

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/Views/QLDeThi/addExam.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
