package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		// ArrayList 이용해서 풀기
		
		
		

		Student[] student = new Student[4];
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");

		// 정보 입력
		for (int i = 0; i < student.length; i++) {
			System.out.println(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			list.add(student[i]); // ArrayList에 학생 정보를 저장
		}

		
		
		// 입력한 정보 모두 얻기
		for (int i = 0; i < list.size(); i++) {
			System.out.println("------------------------------------");
			Student stu = list.get(i);
			System.out.println("이름 : " + stu.getName());
			System.out.println("학과 : " + stu.getDepartment());
			System.out.println("학번 : " + stu.getNumber());
			System.out.println("학점평균 : " + stu.getGrade());

		}
		System.out.println("---------------------------------");

		
		// 학생 이름 입력해서 정보 얻기
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = s.next();
			
			if (name.equals("그만")) { 
				System.out.println("종료합니다");
				break;
			}
			
			for (int i = 0; i < list.size(); i++) {
				Student stu2 = list.get(i);
				stu2.find_student(name);
			}
		}

	}

}
