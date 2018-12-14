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
import javax.servlet.http.HttpSession;

import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.model.User;
import grouptwo.quizexam.service.ExamService;

/**
 * Servlet implementation class HomeQuizController
 */
@WebServlet("/HomeQuizController")
public class HomeQuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeQuizController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessionn=request.getSession();
		User user=(User) sessionn.getAttribute("loginedUser");
		int idUser=user.getUserId();
		List<Integer> lsIdExamOfUser=ExamService.getLsIdOfUser(idUser);
		List<Exam> lsExamOfUser=new ArrayList<>();	
		
		//Get Ds exam của user khi đã có list id exam của user đó
		for(int c:lsIdExamOfUser)
		{
			lsExamOfUser.add(ExamService.getExamById(c));
		}
		request.setAttribute("lsExam", lsExamOfUser);
		
		RequestDispatcher dispatcher 
        = this.getServletContext()//
              .getRequestDispatcher("/WEB-INF/Views/SinhVien/trangchu.jsp");
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
