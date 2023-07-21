package sec01;

public class 배열범위예외 {		// ArrayIndexOutOfBoundsException

	public static void main(String[] args) {

		String[] a = new String[10];
		a[0] = "가나다";
		String data1 = a[0];

		System.out.println(data1);
		
		// String data2 = args[0];
		// args[0]의 값이 없기 때문에 오류 
		// System.out.println(data2);
		// args[0] = {"가"};       값을 넣어주면 출력됨 
		
		String[] name = {"아라"};
		String data3 = name[0];
		System.out.println(data3); // 배열 방에 값이 있으면 실행했을 때 값이 출력되지만 
								   // 값이 없으면 null이 출력됨	
		
	 //String[] fruit = new String[2];
	 // String data4 = fruit[3];
	 // System.out.println(data4); // 배열 방은 2개인데 3번째 방의 값을 실행하면 범위예외가 오류로 뜸
		
	}

}
