package sec02;

public class TryCatchFinallyExample3 {

	public static void main(String[] args) {

		
		
		
		
		try {
			
//			 String data1 = args[0];
//			 String data2 = args[1];
//			 ���� �Ű������� �����մϴ� ��µ�
			
			String data1 = "����";
			String data2 = "�ٶ�";	
//			���ڷ� ��ȯ�� �� �����ϴ� ��µ�
			
//			 String data1 = "123";
//			 String data2 = "456";
//			 �� ���� �հ� : 579 ��µ�
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("�� ���� �հ� : " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű������� �����մϴ�");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
			
//		  catch(Exception e) {
//			  System.out.println("������ �����߽��ϴ�");
//		  }
//		 ��� ���ܸ� ó����
//		 ���� �߿�!! �ٸ� ���ܵ��� ��� Exception�� ��ӹޱ� ������
//	     catch�� ������ ���� ��� �������� Exception�� catch ��Ͽ� �־���
			
		}	finally {
			System.out.println("�ٽ� �����ϼ���");
		}
		
	
		
		
	}

}
