package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	
	String a;
	String b;

	public D(String a, String b) {		// new �����ڸ� ����ؼ� ������ ȣ�� x
		super();		              	// �ٸ� ��Ű���� ��ӹ��� �ڽ� Ŭ������ ���ٵ�
		this.field = "value";			// super()�� ������ ȣ��
		this.method();
		this.a = a;
		this.b = b;
	}
	
}
