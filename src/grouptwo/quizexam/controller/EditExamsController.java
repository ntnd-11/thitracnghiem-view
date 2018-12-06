package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.model.Questioncategorie;
import grouptwo.quizexam.service.ExamService;
import grouptwo.quizexam.service.QuestionService;



@WebServlet("/EditExams")
public class EditExamsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EditExamsController() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command=request.getParameter("command");
		//List<Questioncategorie> lstCate = QuestioncategorieService.getAllQuestionCategorie();
		String id=request.getParameter("id");
		//Question question= QuestionService.getQuestionsById(Integer.parseInt(id));
		 RequestDispatcher dispatcher;
		
	
		switch(command)
		{
		case "delete":
			ExamService.deleteExam(Integer.parseInt(id));
			 dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/Views/QLDeThi/ManageExam.jsp");
			 dispatcher.forward(request, response);
			 
			
			 break;
		case "update":
			/*	Questioncategorie questioncategory=QuestioncategoriesService.getQuestioncategoriesServiceById(question.getQuestionCategoryID());
				request.setAttribute("question", question);
				request.setAttribute("questioncategory", questioncategory);
				List<Questioncategorie> lstCate = QuestioncategorieService.getAllQuestionCategorie();
				request.setAttribute("lstCategory", lstCate);
				  dispatcher = request.getServletContext()
			                .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/editQuestion.jsp");
				 
			        dispatcher.forward(request, response);
			        command="";*/
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
