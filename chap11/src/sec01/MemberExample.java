package sec01;

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		Student st1 = new Student("blue");
		
		if(obj1.equals(obj2)) {
			System.out.println("1�� 2�� ���ƿ�");
		} else {
			System.out.println("1�� 2�� �޶��");
		}
		// �Ű����� Member Ÿ���̰� id �ʵ尪�� �����ϹǷ� true
		
		
		if(obj1.equals(obj3)) {
			System.out.println("1�� 2�� ���ƿ�");
		} else {
			System.out.println("1�� 2�� �޶��");
		}
		// �Ű����� Member Ÿ�������� id �ʵ尪�� �ٸ��Ƿ� false
		
		if(obj1.equals(st1)) {
			System.out.println("obj1�� st1�� ���ƿ�");
		} else {
			System.out.println("obj1�� st1�� �޶��");
		}
		// �������̵��� equals���� Ÿ���� ���ƾ� id�� ���ϱ� ������
		// Ÿ���� �ٸ� �� ��ü�� false
		
	}

}
