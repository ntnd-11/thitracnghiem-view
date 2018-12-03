package grouptwo.quizexam.service;

import java.io.IOException;

import grouptwo.quizexam.AppUtilities.FileUtlis;
import grouptwo.quizexam.model.Course;
import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.model.Question;

public class maina {

	public maina() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		String appPath="C:/Users/Dattr/eclipse -workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ReadQuestion/uploadDir\\Book1.xlsx";
		boolean isSucess=grouptwo.quizexam.AppUtilities.FileUtlis.readAndWriteFileExcel(appPath, 2);
		if(isSucess)
			System.out.println("Thành công");
	}

}
