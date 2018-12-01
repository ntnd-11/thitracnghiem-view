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
import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.model.Profilestudent;
import grouptwo.quizexam.service.CourseService;
import grouptwo.quizexam.service.ExamService;
import grouptwo.quizexam.service.ProfilemanagerService;
import grouptwo.quizexam.service.ProfilestudentService;

/**
 * Servlet implementation class ListStudentControler
 */
@WebServlet("/ListStudent")
public class ListStudentControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Profilestudent> prfi_Stu= null;
		int page=1;

		int idCourse = 0;

		
		if(request.getParameter("idCourse")==null)
		{
			getServletContext().setAttribute("lsCourses",CourseService.getAllCourse());
			if(getServletContext().getAttribute("idCourse")!=null)
			{
				idCourse=(int)getServletContext().getAttribute("idCourse");
			}
			if(request.getParameter("page")!=null)
			{
				page=Integer.parseInt(request.getParameter("page"));
				prfi_Stu=ProfilestudentService.getAllProfilesutudent(idCourse,(page-1)*ParamaterStatic.amoutResult,ParamaterStatic.amoutResult);
			}
				
		}
		else
		{
			if(request.getParameter("idCourse")!=getServletContext().getAttribute("idCourse")+"")
			{
				idCourse=Integer.parseInt(request.getParameter("idCourse"));
				getServletContext().setAttribute("idCourse",idCourse);
			}
			
			if(request.getParameter("page")==null)
			{
				int numberPage;
				//Dem so trang
				numberPage=lamTron(ProfilestudentService.countProfileForCourse(idCourse),ParamaterStatic.amoutResult);
				prfi_Stu=ProfilestudentService.getAllProfilesutudent(idCourse,page-1,ParamaterStatic.amoutResult);
				getServletContext().setAttribute("numberPage",numberPage);
				getServletContext().setAttribute("idCourse",idCourse);
			}
			else
			{
				page=Integer.parseInt(request.getParameter("page"));
				prfi_Stu=ProfilestudentService.getAllProfilesutudent(idCourse,(page-1)*ParamaterStatic.amoutResult,ParamaterStatic.amoutResult);
			}	
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
