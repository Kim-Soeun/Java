package sec01;

public class IndexOfExample {

	public static void main(String[] args) {
		String str1 = "���� �ڹٸ� ����մϴ�";
		
		int index = str1.indexOf("����մϴ�");
		System.out.println(index); 		// �ε��� ���� ��ȣ
		
		int index2 = str1.indexOf("�ڵ�");
		System.out.println(index2);     //-1 ��� : index2�� ���ڿ��� str1�� �������� ����
		
	}

}
