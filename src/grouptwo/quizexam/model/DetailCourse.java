package grouptwo.quizexam.model;

public class DetailCourse {

	public DetailCourse() {
	}
	public DetailCourse(int courseId, int studentId) {
		this.courseId = courseId;
		this.studentId = studentId;
	}
	
	private int courseId;
	private int studentId;

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
