package sec02;

public class ThrowsExample {

	public static void main(String[] args) {

		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʾƿ�");
		}
		
  }
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.util.Scaner");
		// java.util.Scanner�� �����ϱ� ������ �ƹ��͵� ��µ��� ����
		// java.util.Scaner�� ���� ������ catch����� ���ǿ� �ش��Ͽ� 
		// Ŭ������ �������� �ʾƿ� ���
}
}
