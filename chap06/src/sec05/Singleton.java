package sec05;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {} // 생성자
	
	static Singleton getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton(); -> 객체 두개 이상 만들면 x
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 객체");
		}	else {
			System.out.println("다른 객체");
		}
		
	}
}
