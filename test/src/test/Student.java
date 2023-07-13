package test;

public class Student extends Human {

	String dept;
	
	Student(int age, String dept) {
		super(age);
		this.dept = dept;
	}

	@Override
	void eat(String food) {
		if(food.equals("사과")) {
			System.out.println(food + "를 매일 먹습니다"); 
		} else {
			super.eat(food);
	}
	}
	
	
}
