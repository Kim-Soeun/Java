package e_oop;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in);

	//�� ��ĳ�� ����Ҽ��ִ� �޼��� �����
	public static String nextLine(){
		return s.nextLine();
	}

	public static int nextInt(){
		return Integer.parseInt(s.nextLine());
	}

	public static long nextLong(){
		return Long.parseLong(s.nextLine());
	}

	public static double nextDouble(){
		return Double.parseDouble(s.nextLine());
	}
	
	
	
}
