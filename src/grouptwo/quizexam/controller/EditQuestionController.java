package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.model.Answer;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.AnswerService;
import grouptwo.quizexam.service.QuestionService;

@WebServlet("/EditQuestion")
public class EditQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditQuestionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command = request.getParameter("command");
		String id = request.getParameter("id");
		RequestDispatcher dispatcher;
		Question question = QuestionService.getQuestionsById(Integer.parseInt(id));
		request.setAttribute("question", question);
		List<Answer> qsl = null;
		qsl = AnswerService.getAllAnswersQuestion(Integer.parseInt(id));
		request.setAttribute("qsl", qsl);
		switch (command) {
		case "delete":
			QuestionService.deleteQuestions(Integer.parseInt(id));
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/ListQuestion");
			break;

		case "update":

			dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/Views/QLCauHoi/editQuestion.jsp");

			dispatcher.forward(request, response);
			command = "";
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String categories = request.getParameter("lstCategory");
		String question = request.getParameter("question");
		String level = request.getParameter("radLevel");
		String id = request.getParameter("id");
		String radAns=request.getParameter("radAnsa");
		switch (level) {
		case "de":
			level = "Dễ";
			break;
		case "tb":
			level = "Trung Bình";
			break;
		case "kh":
			level = "Khó";
			break;
		}
		
		 QuestionService.updateQuestion(new Question(question, "", level,3,Integer.parseInt(radAns),1,Integer.parseInt(id)));
		String contextPath=request.getContextPath();
		response.sendRedirect(contextPath+"/ListQuestion");
	}

}
