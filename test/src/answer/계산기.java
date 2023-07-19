package answer;

import java.util.Scanner;

public class 계산기 {
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int result=0;
	      System.out.print("두 정수와 연산자를 입력하시오 >> ");
	      int a = s.nextInt();
	      int b = s.nextInt();
	      char c = s.next().charAt(0);
	      Calc cal;
	      switch(c) {
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("잘못된 연산자 입니다.");
	         return;
	      }
	      cal.setValue(a, b);
	      result = cal.calculate();
	      System.out.println(result);
	   }
	}