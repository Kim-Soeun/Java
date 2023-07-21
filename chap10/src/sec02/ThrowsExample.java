package sec02;

public class ThrowsExample {

	public static void main(String[] args) {

		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않아요");
		}
		
  }
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.util.Scaner");
		// java.util.Scanner는 존재하기 때문에 아무것도 출력되지 않음
		// java.util.Scaner는 없기 때문에 catch블록의 조건에 해당하여 
		// 클래스가 존재하지 않아요 출력
}
}
