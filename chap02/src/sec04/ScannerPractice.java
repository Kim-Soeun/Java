package sec04;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

//		����� ��й�ȣ�� �Է��ϼ���
//		��й�ȣ : 1234
//		���� ��й�ȣ�� �߸� �Է������� -> ��й�ȣ�� Ʋ���ϴ�
//		����� �Է������� -> ȯ���մϴ�
		
		Scanner s = new Scanner(System.in);
		String password;
		
		
		while(true) {
			System.out.println("����� ��й�ȣ�� �Է��ϼ���");    //�ȳ�����
			password = s.nextLine();    //�Է¹ޱ�
			
			if(password.equals("1234")) {    //�Է¹��� ���� Ȯ���ϱ�
				System.out.println("ȯ���մϴ�");
				break;
			}
				
			System.out.println("��й�ȣ�� Ʋ���ϴ�");
		}
			
		}
	}