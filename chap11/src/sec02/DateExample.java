package sec02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		// Date Ŭ������ �ٷ� new ��ü ���� ����
		// Calendar Ŭ������ �ٷ� new ��ü ���� �Ұ���
		
		Date now = new Date();  			// import ���ֱ�
		String strNow1 = now.toString();
		System.out.println(strNow1);  		// �������� �� ��¥ ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);   // format() �޼ҵ� ȣ���ؼ� ���ϴ� ������ ��¥ ���� ���� �� ����
		System.out.println(strNow2);
		
		
		
	}

}
