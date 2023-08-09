package sec01;

import java.util.*;

public class StudentExample2 {

	public static void main(String[] args) {

		// HashMap �̿��ؼ� Ǯ��
		
		
		

		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���");

		for (int i = 0; i < student.length; i++) {
			System.out.println(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]); // key(�̸�)�� value(����) ����
		}

		
		
		// �Է��� ���� ��� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String name = keyIterator.next();
			
			System.out.println("------------------------------");
			Student stu = map.get(name);
			// name = ��(key) , get�� �־��� Ű�� �ִ� ���� ����
			System.out.println("�̸� : " + stu.getName());
			System.out.println("�а� : " + stu.getDepartment());
			System.out.println("�й� : " + stu.getNumber());
			System.out.println("������� : " + stu.getGrade());
			System.out.println("-----------------------------");
		}
		
		
		
		
		// �л� �̸�(��) �Է��ؼ� ���� ���
		while (true) {
			System.out.print("�л� �̸� >> ");
			String name = s.next();
			
			if (name.equals("�׸�")) { 
				System.out.println("�����մϴ�");
				break;
			}
			
			Student stu = map.get(name);
			stu.find_student(name);
		}

	}

}
