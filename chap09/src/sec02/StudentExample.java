package sec02;


public class StudentExample {

	public static void main(String[] args) {

		// ��ø Ŭ����(StudentB) ��ü �����ϼ���

		StudentA sta = new StudentA();
		StudentA.StudentB stb = sta.new StudentB();

		stb.name = "ȫ�浿";
		stb.age = 21;
		stb.sleep();

		// �͸�ü(Person)�� �޼ҵ� ȣ��
		sta.person.wake();
		sta.method1();
		// sta.person.work();
		// �������̵� �ȵ� �޼ҵ带 ���� ȣ�� x

		// method2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��
		// �Ű������� �������� ; ������
		sta.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�");
				study();
				// �������̵� �ȵ� �޼ҵ�� �ٷ� ȣ�� �ȵǱ� ������
				// �������� �޼ҵ带 ȣ����
			}

		}

		);

	}

}
