package e_oop;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in);

	//위 스캐너 사용할수있는 메서드 만들기
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
