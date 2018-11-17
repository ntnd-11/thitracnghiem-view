package grouptwo.quizexam.model;

public class DetailCourse {

	public DetailCourse() {
		// TODO Auto-generated constructor stub
	}
	public DetailCourse(int courseId, String profileStudentId) {
		this.courseId = courseId;
		this.profileStudentId = profileStudentId;
	}
	private int courseId;
	private String profileStudentId;

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getProfileStudentId() {
		return profileStudentId;
	}
	public void setProfileStudentId(String profileStudentId) {
		this.profileStudentId = profileStudentId;
	}
}
