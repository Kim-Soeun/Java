package sec03;

public class Student {

	String name;
	int age;
	String deptNum;
	String gender;
	String phone;		// ��� �ʿ���� ���� ���� ��� int ���� String
	
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, String deptNum, String phone) {
		this.name = name;
		this.deptNum = deptNum;
		this.phone = phone;
	}

}
