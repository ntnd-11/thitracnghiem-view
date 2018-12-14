package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.service.ExamService;
import grouptwo.quizexam.service.QuestionService;


@WebServlet("/EditExams")
public class EditExamsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditExamsController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command = request.getParameter("command");
		String id = request.getParameter("id");

		Exam exam=ExamService.getExamById(Integer.parseInt(id));
		request.setAttribute("exam", exam);
		RequestDispatcher dispatcher;

		switch (command) {
		
		case "delete":
			
			ExamService.deleteExam(Integer.parseInt(id));
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/ListExam");
			break;
		  
		 
		case "update":
			dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/Views/QLDeThi/editExam.jsp");

			dispatcher.forward(request, response);
			command = "";
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
