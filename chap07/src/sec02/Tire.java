package sec02;

public class Tire {
	// �ʵ�
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	
	// ������(�Ű����� 2��)
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;  // ���� ȸ���� 1�� ����
		
		// ����ȸ������ �ִ�ȸ�������� ������ ȸ���� ������Ű��
		// ��ȸ ȸ���ߴ��� (Ÿ�̾� ����) ���
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		// ����ȸ������ �ִ�ȸ���� �̻��̸� Ÿ�̾� ��ũ ���	
	  } else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

	
}
