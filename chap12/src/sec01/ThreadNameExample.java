package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {		// �������� �̸�

		// ���� ���� ���� �������� ���� ����
		Thread mainThread = Thread.currentThread();  
		// getName() : ������ �̸� ������
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName());  // main ���
		
		// Thread�� ��ӹ��� ThreadA ��ü ����
		// �۾� �������� �̸� ����
		ThreadA threadA = new ThreadA();
		System.out.println("ù��° �۾� ������ �̸� : " + threadA.getName()); // Thread-0 ���
		threadA.start();         									   // ThreadA�� �������� run() ȣ��
																	   // �ٲ� �̸� ���
		
		ThreadB threadB = new ThreadB();
		System.out.println("ù��° �۾� ������ �̸� : " + threadB.getName()); // Thread-1 ���
		threadB.start();
		
		
	}

}
