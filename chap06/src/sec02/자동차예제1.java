package sec02;

public class 자동차예제1 {

	public static void main(String[] args) {

		Car myCar = new Car();  // Car 객체 생성 (인스턴스 이름 : myCar)
		
		System.out.println("회사 이름 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		
		myCar.company = "페라리";		//  내용 변경 가능
		myCar.model = "아벤타도르";
		
		System.out.println("회사 이름 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		
	}

}
