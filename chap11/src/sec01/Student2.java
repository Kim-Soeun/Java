package sec01;

public class Student2 {				// 509p 3¹ø ¹®Á¦

	private String studentNum;

	public Student2(String studentNum) {
		this.studentNum = studentNum;
	}
	
	
	public String getStudentNum() {
		return studentNum;
	}


	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}


	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 student = (Student2) obj;
			if (studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
