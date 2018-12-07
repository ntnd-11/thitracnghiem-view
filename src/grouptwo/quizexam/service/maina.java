package grouptwo.quizexam.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

import grouptwo.quizexam.model.Answer;
import grouptwo.quizexam.model.Exam;
import grouptwo.quizexam.model.Question;
import grouptwo.quizexam.model.Subject;

public class maina {

	public maina() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
	/*	Exam exam=ExamService.getExamById(2);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");  
		String currentDate=dtf.format((LocalDateTime.now())) ;
		
	
		
		
		 SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		 Date d = df.parse(currentDate); 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.MINUTE, 60);
		 String newTime = df.format(cal.getTime());
		 
		 
		 Date truoc=df.parse(currentDate); 
		 Date Sau=df.parse("12/07/2018 10:15:20"); 
		 
		 long ConLai=Sau.getTime()-truoc.getTime();
		 System.out.println(ConLai);*/
		
		
	/*	System.out.println(isInHappyHour("2018-11-03 01:00:00.0", "2018-11-04 01:00:00.0"));
		Exam exam=ExamService.getExamById(2);
		System.out.println(exam.getTimeStarting());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");  
		String currentDate=dtf.format((LocalDateTime.now())) ;
		System.out.println(currentDate);*/
		
		 SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");  
			String currentDate=dtf.format((LocalDateTime.now())) ;
		 Date d = df.parse(currentDate); 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.MINUTE, 60);
		 String newTime = df.format(cal.getTime());
		 
		 
		 Date truoc=df.parse(currentDate); 
		 Date Sau=df.parse("12/07/2018 01:27:16"); 
		 
		 long ConLai=Sau.getTime()-truoc.getTime();
		 System.out.println(ConLai);
	}
	 public static int GetQus(String a) {
	    	String b[]=a.split("_");
	    	
	    	return Integer.parseInt(b[0]);
	    }
	    public static int GetAns(String a) {
	    	String b[]=a.split("_");
	    	return Integer.parseInt(b[1]);
	    }
	    public static boolean isInHappyHour(String startHour, String endHour) throws ParseException {

		    boolean result = false;

		    SimpleDateFormat hourFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		    Date start = (Date) hourFormat.parse(startHour);
		    Date end = (Date) hourFormat.parse(endHour);
		    Date now = new Date(System.currentTimeMillis());

		    String nowHourStr = hourFormat.format(now.getTime());

		    try {
		        Date nowHour = (Date) hourFormat.parse(nowHourStr);
		        if (nowHour.after(start) && nowHour.before(end) || (nowHour.equals(start) || (nowHour.equals(end)))) {
		            result = true;
		        }

		    } catch (ParseException e) {
		        result = false;
		    }

		    return result;

		} 
}
