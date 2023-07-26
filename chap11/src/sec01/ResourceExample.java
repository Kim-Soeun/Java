package sec01;

public class ResourceExample {

	public static void main(String[] args) {

		Class clazz = Car.class;		// Car 객체 생성
		
		String photo1 = clazz.getResource("a.jpg").getPath();
		String photo2 = clazz.getResource("images/dog.jpg").getPath();
		// getResource : clazz 클래스 안에 있는 자원을 가져올 수 있음
		// getPath : 경로 가져옴
		
		System.out.println(photo1);
		System.out.println(photo2);
		
		String photo3 = clazz.getResource("a.jpg").getPath();
		String photo4 = clazz.getResource("dog.jpg").getPath();
		
		System.out.println(photo3);
		System.out.println(photo4);
		
	}

}
