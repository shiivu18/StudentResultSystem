package record;

public class Result {
	
	private int studentId;
	private String subject;
	private int marks;
	@Override
	public String toString() {
		return "result [studentId=" + studentId + ", subject=" + subject + ", marks=" + marks + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Result(int studentId, String subject, int marks) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.marks = marks;
	}
	
	
	
	

}
