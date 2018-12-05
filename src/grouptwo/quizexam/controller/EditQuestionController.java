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
import grouptwo.quizexam.service.QuestionService;
import grouptwo.quizexam.service.QuestioncategorieService;
import grouptwo.quizexam.service.QuestioncategoriesService;


@WebServlet("/EditQuestion")
public class EditQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public EditQuestionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command=request.getParameter("command");
		//List<Questioncategorie> lstCate = QuestioncategorieService.getAllQuestionCategorie();
		String id=request.getParameter("id");

		Question question= QuestionService.getQuestionsById(Integer.parseInt(id));
		 RequestDispatcher dispatcher;
		switch(command)
		{
		case "delete":
			QuestionService.deleteQuestions(Integer.parseInt(id));
			  dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/ListQuestion.jsp");
			  dispatcher.forward(request, response);
		case "update":
				Questioncategorie questioncategory=QuestioncategoriesService.getQuestioncategoriesServiceById(question.getQuestionCategoryID());
				request.setAttribute("question", question);
				request.setAttribute("questioncategory", questioncategory);
				List<Questioncategorie> lstCate = QuestioncategorieService.getAllQuestionCategorie();
				request.setAttribute("lstCategory", lstCate);
				  dispatcher = request.getServletContext()
			                .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/editQuestion.jsp");
				 
			        dispatcher.forward(request, response);
			        command="";
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String categories=request.getParameter("lstCategory");
		String question=request.getParameter("question");
		String level=request.getParameter("radLevel");
		String id=request.getParameter("id");
		switch(level)
		{
		case "de":
			level="Dễ";
			break;
		case "tb":
			level="Trung Bình";
			break;
		case "kh":
			level="Khó";
			break;
		}
		
		QuestionService.updateQuestions(new Question(question, "", level,  Integer.parseInt(categories),99,2,Integer.parseInt(id)));
		RequestDispatcher  dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/listQuestion.jsp");
		dispatcher.forward(request, response);
	}

}
