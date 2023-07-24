package sec01;

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		Student st1 = new Student("blue");
		
		if(obj1.equals(obj2)) {
			System.out.println("1과 2는 같아요");
		} else {
			System.out.println("1과 2는 달라요");
		}
		// 매개값이 Member 타입이고 id 필드값도 동일하므로 true
		
		
		if(obj1.equals(obj3)) {
			System.out.println("1과 2는 같아요");
		} else {
			System.out.println("1과 2는 달라요");
		}
		// 매개값이 Member 타입이지만 id 필드값이 다르므로 false
		
		if(obj1.equals(st1)) {
			System.out.println("obj1과 st1은 같아요");
		} else {
			System.out.println("obj1과 st1은 달라요");
		}
		// 오버라이드한 equals에서 타입이 같아야 id를 비교하기 때문에
		// 타입이 다른 두 객체는 false
		
	}

}
