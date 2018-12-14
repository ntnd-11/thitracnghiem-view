package grouptwo.quizexam.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecurityConfig {

	private static final Map<String,List<String>> map=new HashMap<String,List<String>>();
		static {
			init();
		}
		private static void init()
		{
			//cấu hình cho admin
			List<String> urlPatternsAD=new ArrayList<String>();
			urlPatternsAD.add("/HomeQuizController");
			//cấu hình cho học sinh
			List<String> urlPatternsStu=new ArrayList<String>();
			urlPatternsStu.add("/HomeQuizController");
			//cấu hình cho quản lý đề
			List<String> urlPatternsExam=new ArrayList<String>();
			urlPatternsExam.add("/HomeQuizController");
			//cấu hình cho quản lý câu hỏi
			List<String> urlPatternsQus=new ArrayList<String>();
			urlPatternsQus.add("/HomeQuizController");
			//cấu hình cho quản lý lớp học và sinh viên
			List<String> urlPatternsStu_Course=new ArrayList<String>();
			urlPatternsStu_Course.add("/HomeQuizController");
			
			
			
			
			
			map.put("ad", urlPatternsAD);
			map.put("stu",urlPatternsStu);
			map.put("asma",urlPatternsQus);
			map.put("stuma",urlPatternsStu_Course);
			map.put("exma",urlPatternsExam);
			
		
		}
		public static Set<String> getAllRoles()
		{
			return map.keySet();
		}
		public static List<String> getAllUrlPatternForRole(String role)
		{
			return map.get(role);
		}
}
