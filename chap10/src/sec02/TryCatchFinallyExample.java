package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clzz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		} finally {
			System.out.println("���� ó�� �Ǿ����ϴ�");
		}
		
	}

}
