package sec01;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		
		// ��ü ���� ����(toString())
		// 'Ŭ�����̸�@16�����ؽ��ڵ�'�� ���� ���� ����
		
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		// Date Ŭ������ toString�� ���� ��¥�� �ð� ���� ���
		
		
	}

}
