package grouptwo.quizexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grouptwo.quizexam.utils.FileUtlis;




@WebServlet("/uploadFileControler")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class uploadFileControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public uploadFileControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String saveFullPath=FileUtlis.createFoderUploadFile(request);
		String pathFile=FileUtlis.upLoadFile(request, saveFullPath);
		if(pathFile!=null)
		{
			System.out.println(pathFile);
			FileUtlis.readAndWriteFileExcel(pathFile,2);
			FileUtlis.DeleteFile(pathFile);
			response.sendRedirect(request.getContextPath() + "/uploadFileResults");
		}
		else
		{
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFile.jsp");
		}
	}

}
