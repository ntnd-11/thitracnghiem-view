package grouptwo.quizexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.AppUtilities.FileUtlis;
import grouptwo.quizexam.service.SubjectService;



/**
 * Servlet implementation class uploadFileControler
 */
@WebServlet("/uploadFileControler")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class uploadFileControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadFileControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String saveFullPath=FileUtlis.createFoderUploadFile(request);
		String pathFile=FileUtlis.upLoadFile(request, saveFullPath);
		int subjectId=SubjectService.getSubjectsByName(request.getParameter("subjectName")).getSubjectID();
		if(pathFile!=null)
		{
			System.out.println(pathFile);
			FileUtlis.readAndWriteFileExcel(pathFile,2,subjectId);
			FileUtlis.DeleteFile(pathFile);
			response.sendRedirect(request.getContextPath() + "/uploadFileResults");
		}
		else
		{
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
		}
	}

}
