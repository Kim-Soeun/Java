package sec01;

public class CarExample {

	public static void main(String[] args) {

		System.out.println("차가 출발합니다");
		System.out.println();
		
		
		// 매개값으로 익명 구현 객체 삽입
		// 스레드 먼저 생성
		// 스레드가 더 위에 위치해 있지만 반복문보다 뒤에 출력되는 이유는
		// 메인 구문 안에 있는 메소드가 우선 순위이기 때문
		// 스레드를 먼저 출력하고 싶으면 일시정지하는 시간을 줄여주면 됨
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=50; i<=200; i+=50) {
					try { Thread.sleep(500);} catch(Exception e) {}
					System.out.println("현재 속도 : " + i + "km");
				}
			}
			
		});
		thread.start();
		
		
		
		
		for(int i=1; i<=4; i++) {
			try { Thread.sleep(500);} catch(Exception e) {}
			System.out.print("속도를 올립니다.");
		}
		
		
		
		
		try { Thread.sleep(500);} catch(Exception e) {}
		System.out.println();
		System.out.println("차가 멈춥니다");
		
	}

}
