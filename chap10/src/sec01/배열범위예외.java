package sec01;

public class �迭�������� {		// ArrayIndexOutOfBoundsException

	public static void main(String[] args) {

		String[] a = new String[10];
		a[0] = "������";
		String data1 = a[0];

		System.out.println(data1);
		
		// String data2 = args[0];
		// args[0]�� ���� ���� ������ ���� 
		// System.out.println(data2);
		// args[0] = {"��"};       ���� �־��ָ� ��µ� 
		
		String[] name = {"�ƶ�"};
		String data3 = name[0];
		System.out.println(data3); // �迭 �濡 ���� ������ �������� �� ���� ��µ����� 
								   // ���� ������ null�� ��µ�	
		
	 //String[] fruit = new String[2];
	 // String data4 = fruit[3];
	 // System.out.println(data4); // �迭 ���� 2���ε� 3��° ���� ���� �����ϸ� �������ܰ� ������ ��
		
	}

}
