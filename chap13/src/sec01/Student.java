package sec01;

public class Student {

	private String name;
	private String department;
	private String number;
	private double grade;
	
	
	
	// 생성자
	public Student(String name, String department, String number, double grade) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.grade = grade;
	}



	public String getName() {
		return name;
	}



	public String getDepartment() {
		return department;
	}



	public String getNumber() {
		return number;
	}


	public double getGrade() {
		return grade;
	}


	
	// 학생 이름으로 학생 정보를 출력하는 메소드
	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name + ", " + this.department + ", " 
					+ this.number + ", " +this.grade);
		}
	}
	
	
}
