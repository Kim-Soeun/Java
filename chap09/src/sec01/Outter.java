package sec01;

public class Outter {
	String name = "ȫ�浿";
	void reName() {
		System.out.println("�̸��� �����մϴ�");
	}
	
	
	
	class Nested {
		String name = "�嵿��";
		void reName() {
			System.out.println("�嵿�� �̸��� �����մϴ�");
		}
		void print() {
			System.out.println(this.name);
			System.out.println(Outter.this.name); // ��ø Ŭ������ �ٱ� Ŭ���� ���� ���
		}
	}
	
}


