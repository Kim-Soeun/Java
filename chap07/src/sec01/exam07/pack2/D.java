package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	
	String a;
	String b;

	public D(String a, String b) {		// new 연산자를 사용해서 생성자 호출 x
		super();		              	// 다른 패키지라도 상속받은 자식 클래스는 접근됨
		this.field = "value";			// super()로 생성자 호출
		this.method();
		this.a = a;
		this.b = b;
	}
	
}
