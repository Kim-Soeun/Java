package sec01.exam02;

public class Student extends People {

	public int studentNo;	// 학번
	
	public Student(String name, String ssn, int studentNo) {
		// super = 부모 생성자 호출 , 기본적으로 default 호출
        // 매개변수 순서 맞추기 
		super(name,ssn);		
		this.studentNo=studentNo;
	}
	
}
