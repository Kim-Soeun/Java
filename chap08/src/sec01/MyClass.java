package sec01;

public class MyClass {
	
	// �ʵ�
	RemoteControl rc = new Television();
	
	// ����Ʈ ������
	// ����Ʈ ������ ȣ��� Television���� ������ �޼ҵ� ȣ��
	MyClass() {
		
	}
	
	// �������̽��� �Ű������� �ϴ� ������
	// �Ű����� ��ü�� �޼ҵ� ȣ��
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();	
		rc.setVolume(5);
		rc.turnOff();	
	}
	
	// Audio ��ü�� �޼ҵ� ȣ��
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	
	// �Ű����� ��ü�� �޼ҵ� ȣ��
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
