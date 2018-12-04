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
import grouptwo.quizexam.model.Profilestudent;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.service.ProfilestudentService;
import grouptwo.quizexam.service.QuestionService;

/**
 * Servlet implementation class ListAllStudentControler
 */
@WebServlet("/ListAllStudent")
public class ListAllStudentControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListAllStudentControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Profilestudent> prfi_Stu= null;
		int page=1;
		if(request.getParameter("page")==null)
		{
			int numberPage;
			//Dem so trang
			numberPage=lamTron(ProfilestudentService.countProfile(),ParamaterStatic.amoutResult);
			prfi_Stu=ProfilestudentService.getAllStudent(page-1,ParamaterStatic.amoutResult);
			getServletContext().setAttribute("numberPage",numberPage);
		}
		else
		{
			page=Integer.parseInt(request.getParameter("page"));
			prfi_Stu=ProfilestudentService.getAllStudent((page-1)*ParamaterStatic.amoutResult,ParamaterStatic.amoutResult);
		}	
		request.setAttribute("list",prfi_Stu);
		RequestDispatcher dispatcher 
         = this.getServletContext()//
               .getRequestDispatcher("/WEB-INF/Views/QLSinhVien_MonHoc/listStudent.jsp");
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private int lamTron(int numberFilm,int row)
	{
		int kq;
		if(numberFilm%row!=0)
		{
			kq=numberFilm/row+1;
		}
		else
		{
			kq=numberFilm/row;
		}
		return kq;
		
	}

}
