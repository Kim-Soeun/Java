package sec08.exam08;

import java.util.*;

public class CarExample {

	public static void main(String[] args) {

				// 1�� ������ �߰�
				// ����ڷκ��� ������ �Է� �޾� �ڵ��� Ŭ���� ��ü�� �����Ͽ�
				// ����Ʈ�� �߰��ϼ���
				
				// 2�� ������ ����
				// ����ڷκ��� �ε��� ��ȣ�� �Է¹޾� ����Ʈ �����͸� �����ϼ���
				
				// 3�� ������ ���
				// �Էµ� ����Ʈ �����͸� ��� ����ϼ���
				
				// 4�� ����
		
		
		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		
		
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("���ڸ� �Է��ϼ���");
			System.out.println("1�� ������ �߰�, 2�� ������ ����, 3�� ������ ���, 4�� ����");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.print("ȸ�� �̸� �Է� : ");
				String company = s.next();
				System.out.print("���� �Է� : ");
				int cost = s.nextInt();
				System.out.print("�ְ� �ӵ� �Է� : ");
				int maxSpeed = s.nextInt();
				System.out.print("���� ���� �Է� : ");
				String color = s.next();
				list.add(new Car(company, cost, maxSpeed, color));
				break;
			case 2 :
				System.out.println("������ �ε��� ��ȣ�� �Է��ϼ���");
				int num = s.nextInt();
				list.remove(num);
				break;
			case 3 :
				for(int i=0; i<list.size(); i++) {
					Car car = list.get(i);
					System.out.println(car.company+" " +car.cost+" " +car.maxSpeed+" " + car.color);
				}
				break;
			case 4 :
				System.out.println("�����մϴ�");
				run = false;
			}
			
		}
		
		
		
		
		
		
		
	}

}
