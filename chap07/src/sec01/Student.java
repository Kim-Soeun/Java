package sec01;

public class Student extends Human {

	int studentCode;		// �й�
	String studentDept;		// �а�
	
	Student(int weight, int height, int studentCode) {
		super(weight, height);
		this.studentCode = studentCode;
	}
	

	void study(String place) {
		System.out.println(place + "���� �����մϴ�");
	}
	
	void dressOn() {
		System.out.println("������ �Խ��ϴ�");
	}
	
	void dressOff() {
		System.out.println("������ �����ϴ�");
	}


	@Override
	public String eat(String food) {
		String result = food + "�� ���� �Խ��ϴ�";
		return result;
	}
	
	
	
}
