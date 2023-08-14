package sec08.exam14;

import java.util.*;

public class StudentExample {

	public static void main(String[] args) {

		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���");
		
		for(int i=0; i<student.length; i++) {
			System.out.println(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]);
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String name = keyIter.next();
			
			System.out.println("--------------------");
			Student stu = map.get(name);
			System.out.println("�̸� : " + stu.getName());
			System.out.println("�а� : " + stu.getDepartment());
			System.out.println("�й� : " + stu.getNumber());
			System.out.println("������� : " + stu.getGrade());
			System.out.println("----------------------");
		}
		
		
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = s.next();
			
			if(name.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			
			Student stu = map.get(name);
			stu.find_student(name);
		}
		
	}

}
