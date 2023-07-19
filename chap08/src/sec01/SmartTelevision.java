package sec01;

public class SmartTelevision implements RemoteControl, Searchable {
// �������̽��� ��ø���� ������
	
	private int volume;
	
	// Searchable �߻� �޼ҵ��� ��ü �޼ҵ�
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�");
	}

	// RemoteControl�� �߻� �޼ҵ� 3���� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("����Ʈ TV�� �մϴ�");
	}

	public void turnOff() {
		System.out.println("����Ʈ TV�� ���ϴ�");
	}

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����Ʈ TV ���� : " + this.volume);
	}

}
	
