package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// throws Exception�� ���ܻ�Ȳ�� ȭ�鿡 �����
		
		int keyCode;
		keyCode = System.in.read();
		System.out.println("Ű�ڵ� : " + keyCode); // t �Է� -> Ű�ڵ� : 116��µ�
		keyCode = System.in.read();
		System.out.println("Ű�ڵ� : " + keyCode); // Ű�ڵ� : 13 -> Enter�� �ν��ؼ� ����� ���
		keyCode = System.in.read();
		System.out.println("Ű�ڵ� : " + keyCode); //Ű�ڵ� : 10

		while(true) {    // ���� �ݺ���
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� : " + keyCode);
		}
//			�� (�Է�)
//			Ű�ڵ� : 176
//			Ű�ڵ� : 161
//			Ű�ڵ� : 13
//			Ű�ڵ� : 10
			
			
		}
	}


