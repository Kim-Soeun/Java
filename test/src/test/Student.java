package test;

public class Student extends Human {

	String dept;
	
	Student(int age, String dept) {
		super(age);
		this.dept = dept;
	}

	@Override
	void eat(String food) {
		if(food.equals("���")) {
			System.out.println(food + "�� ���� �Խ��ϴ�"); 
		} else {
			super.eat(food);
	}
	}
	
	
}
