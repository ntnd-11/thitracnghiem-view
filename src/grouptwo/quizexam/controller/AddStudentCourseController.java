package grouptwo.quizexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.model.Course;
import grouptwo.quizexam.service.CourseService;


@WebServlet("/AddStudentCourse")
public class AddStudentCourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddStudentCourseController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Course course = CourseService.getCourseById(2);
		request.setAttribute("course", course);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/Views/QLSinhVien_MonHoc/addStudentCourse.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		Course course = (Course)request.getAttribute("course");
		int courseId = course.getCourseId();
		CourseService.addStudentCourse(courseId, studentId);
	}

}
