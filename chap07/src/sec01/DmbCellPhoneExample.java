package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbcellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println(dmbcellPhone.model);	// 상속받은 필드 출력
		
		dmbcellPhone.turnOnDmb();	// 자기 메소드 출력
		dmbcellPhone.bell();		// 상속받은 메소드 출력
		
		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbcellPhone.model);
		System.out.println("색상 : " + dmbcellPhone.color);
		
		// DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbcellPhone.channel);
		
		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbcellPhone.powerOn();
		dmbcellPhone.bell();
		dmbcellPhone.sendVoice("여보세요");
		dmbcellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		
		// DmbCellPhone 클래스의 메소드 호출
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(22);
		
	}

}
