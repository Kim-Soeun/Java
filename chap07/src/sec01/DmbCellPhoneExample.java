package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbcellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println(dmbcellPhone.model);	// ��ӹ��� �ʵ� ���
		
		dmbcellPhone.turnOnDmb();	// �ڱ� �޼ҵ� ���
		dmbcellPhone.bell();		// ��ӹ��� �޼ҵ� ���
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbcellPhone.model);
		System.out.println("���� : " + dmbcellPhone.color);
		
		// DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbcellPhone.channel);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbcellPhone.powerOn();
		dmbcellPhone.bell();
		dmbcellPhone.sendVoice("��������");
		dmbcellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		
		// DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(22);
		
	}

}
