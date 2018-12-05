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
        amountPerPage = 10;
    }
    @Override
    public void init() throws ServletException {
    	super.init();
        lstQuestion = new ArrayList<>();

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		List<Question> lstCurrentQuestions = new ArrayList<>();
		int page=1;
		if(request.getParameter("difficult")!=null
				&& request.getParameter("normal")!=null
				&& request.getParameter("easy")!=null)
		{
				lstQuestion = new ArrayList<>();
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
				
				
		}else
			if (lstQuestion.size()!=0)
			{
				if(request.getParameter("page")!=null)
				{
					page = Integer.parseInt(request.getParameter("page"));
				}
	
			}
						
		int startPage = amountPerPage*(page-1);
		int finishPage = amountPerPage*page-1> lstQuestion.size()-1? lstQuestion.size() :amountPerPage*page-1;
		lstCurrentQuestions = lstQuestion.subList(startPage, finishPage);
		
		request.setAttribute("lstCurrentQuestion", lstCurrentQuestions);
	

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/Views/QLDeThi/addExam.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String test = req.getParameter("deleteIndex");
		int indexOfDeleteItem = Integer.parseInt(test);
		lstQuestion.remove(indexOfDeleteItem);
		doGet(req, resp);
	}
	
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int indexOfReplaceItem = Integer.parseInt(req.getParameter("replaceIndex"));
		int idNewQuestion = Integer.parseInt(req.getParameter("idQuestion"));
		Question newQuestion = QuestionService.getQuestionsById(idNewQuestion);
		lstQuestion.set(indexOfReplaceItem,newQuestion);
		

	}
}
