package sec01;

import java.util.*;

public class StudentExample2 {

	public static void main(String[] args) {

		// HashMap 이용해서 풀기
		
		
		

		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");

		for (int i = 0; i < student.length; i++) {
			System.out.println(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]); // key(이름)와 value(정보) 저장
		}

		
		
		// 입력한 정보 모두 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String name = keyIterator.next();
			
			System.out.println("------------------------------");
			Student stu = map.get(name);
			// name = 값(key) , get은 주어진 키가 있는 값을 리턴
			System.out.println("이름 : " + stu.getName());
			System.out.println("학과 : " + stu.getDepartment());
			System.out.println("학번 : " + stu.getNumber());
			System.out.println("학점평균 : " + stu.getGrade());
			System.out.println("-----------------------------");
		}
		
		
		
		
		// 학생 이름(값) 입력해서 정보 얻기
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = s.next();
			
			if (name.equals("그만")) { 
				System.out.println("종료합니다");
				break;
			}
			
			Student stu = map.get(name);
			stu.find_student(name);
		}

	}

}
