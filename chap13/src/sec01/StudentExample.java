package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		// ArrayList �̿��ؼ� Ǯ��
		
		
		

		Student[] student = new Student[4];
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���");

		// ���� �Է�
		for (int i = 0; i < student.length; i++) {
			System.out.println(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			list.add(student[i]); // ArrayList�� �л� ������ ����
		}

		
		
		// �Է��� ���� ��� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println("------------------------------------");
			Student stu = list.get(i);
			System.out.println("�̸� : " + stu.getName());
			System.out.println("�а� : " + stu.getDepartment());
			System.out.println("�й� : " + stu.getNumber());
			System.out.println("������� : " + stu.getGrade());

		}
		System.out.println("---------------------------------");

		
		// �л� �̸� �Է��ؼ� ���� ���
		while (true) {
			System.out.print("�л� �̸� >> ");
			String name = s.next();
			
			if (name.equals("�׸�")) { 
				System.out.println("�����մϴ�");
				break;
			}
			
			for (int i = 0; i < list.size(); i++) {
				Student stu2 = list.get(i);
				stu2.find_student(name);
			}
		}

	}

}
