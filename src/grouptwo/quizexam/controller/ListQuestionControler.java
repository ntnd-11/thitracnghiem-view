<<<<<<< HEAD
package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.data.ParamaterStatic;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.QuestionService;
import grouptwo.quizexam.utils.CalculationHelper;


@WebServlet("/ListQuestion")
public class ListQuestionControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListQuestionControler() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Question> qsl= null;
		int page=1;
		if(request.getParameter("page")==null)
		{
			int numberPage;
			//Dem so trang
			numberPage = CalculationHelper.rouding(QuestionService.countQuestion(),ParamaterStatic.amoutResult);
			qsl=QuestionService.getAllQuestions(page-1,ParamaterStatic.amoutResult);
			getServletContext().setAttribute("numberPage",numberPage);
		}
		else
		{
			page=Integer.parseInt(request.getParameter("page"));
			qsl=QuestionService.getAllQuestions((page-1)*ParamaterStatic.amoutResult,ParamaterStatic.amoutResult);
		}	
		request.setAttribute("list",qsl);
		RequestDispatcher dispatcher 
         = this.getServletContext()//
               .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/listQuestion.jsp");
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
=======
package grouptwo.quizexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.data.ParamaterStatic;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.QuestionService;
import grouptwo.quizexam.utils.CalculationHelper;


@WebServlet("/ListQuestion")
public class ListQuestionControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListQuestionControler() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Question> qsl= null;
		int page=1;
		if(request.getParameter("page")==null)
		{
			int numberPage;
			//Dem so trang
			numberPage = CalculationHelper.rouding(QuestionService.countQuestion(),ParamaterStatic.amoutResult);
			qsl=QuestionService.getAllQuestions(page-1,ParamaterStatic.amoutResult);
			getServletContext().setAttribute("numberPage",numberPage);
		}
		else
		{
			page=Integer.parseInt(request.getParameter("page"));
			qsl=QuestionService.getAllQuestions((page-1)*ParamaterStatic.amoutResult,ParamaterStatic.amoutResult);
		}	
		request.setAttribute("list",qsl);
		RequestDispatcher dispatcher 
         = this.getServletContext()//
               .getRequestDispatcher("/WEB-INF/Views/QLCauHoi/listQuestion.jsp");
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
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
