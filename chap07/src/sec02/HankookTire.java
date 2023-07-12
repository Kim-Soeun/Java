package sec02;

public class HankookTire extends Tire {
	
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	// 부모 클래스의 메소드 오버라이드
	@Override
	public boolean roll() {
		++accumulatedRotation;  // 누적 회전수 1씩 증가
		
		// 누적회전수가 최대회전수보다 작으면 회전수 증가시키고
		// 몇회 회전했는지 (타이어 수명) 출력
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		// 누적회전수가 최대회전수 이상이면 타이어 펑크 출력	
	  } else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}

}
