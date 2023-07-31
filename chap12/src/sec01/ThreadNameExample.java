package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {		// �������� �̸�

		// ���� ���� ���� �������� ���� ����
		Thread mainThread = Thread.currentThread();  
		// getName() : ������ �̸� ������
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName());  // main ���
		
		// Thread�� ��ӹ��� ThreadA ��ü ����
		// �۾� �������� �̸� ����
		Thread threadA = new ThreadA();
		System.out.println("ù��° �۾� ������ �̸� : " + threadA.getName()); // �ٲ� �̸� ���
		threadA.start();         									   // ThreadA�� �������� run() ȣ��
																	   
		
		Thread threadB = new ThreadB();
		System.out.println("�ι�° �۾� ������ �̸� : " + threadB.getName()); // Thread-1 ���
		threadB.start();
		
		
	}

}
