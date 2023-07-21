package sec02;

public class TryCatchFinallyExample3 {

	public static void main(String[] args) {

		
		
		
		
		try {
			
//			 String data1 = args[0];
//			 String data2 = args[1];
//			 실행 매개변수가 부족합니다 출력됨
			
			String data1 = "가나";
			String data2 = "다라";	
//			숫자로 변환할 수 없습니다 출력됨
			
//			 String data1 = "123";
//			 String data2 = "456";
//			 두 수의 합계 : 579 출력됨
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두 수의 합계 : " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
			
//		  catch(Exception e) {
//			  System.out.println("오류가 발행했습니다");
//		  }
//		 모든 예외를 처리함
//		 순서 중요!! 다른 예외들은 모두 Exception을 상속받기 때문에
//	     catch를 여러개 적을 경우 마지막에 Exception을 catch 블록에 넣어줌
			
		}	finally {
			System.out.println("다시 실행하세요");
		}
		
	
		
		
	}

}
