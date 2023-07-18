package sec07.exam17;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int num = s.nextInt();
		Phone[] phone = new Phone[num];

		int i;
		// 전역변수 i 선언함

		// 배열의 길이만큼 반복해서 이름과 전화번호를 입력받아
		// 각 배열의 방에 Phone 객체를 생성하여 넣음
		for (i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸 없이 입력");
			String name = s.next();
			String tel = s.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다");

		while (true) {
			System.out.println("검색할 이름 : ");
			String name = s.next();
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 전화번호는 " + phone[i].getTel());
					break; // 찾는 데이터가 있으면 이름과 번호 출력 후 for문 종료
				}
			}

			if (name.equals("그만")) {
				break;  // 그만을 입력하면 while 종료
			}

			if (i == num) {	
				System.out.println(name + "이 없습니다");  // 찾는 데이터가 없으면 없다는 안내문 출력
			}
		}
	}

}
