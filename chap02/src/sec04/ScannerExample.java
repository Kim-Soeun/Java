package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

//		���ڿ� �Է� ���� �� ���ѹݺ� ���
//		q �Է��ϸ� "����"�߸鼭 ����
//		ex) �Էµ� ���ڿ�: "�����ٶ󸶹�"

		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: " + inputData + "\"");
			if (inputData.equals("q")) { // equlas : ���ڿ��� � �Ͱ� ���ٰ� �� �� ���� ��
				break; // q �Է��ϸ� ���ѹݺ� ����
			}

		}
		System.out.println("����");
	}

}
