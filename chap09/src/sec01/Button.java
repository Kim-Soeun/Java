package sec01;

public class Button {
	
	OnClickListener listener;				// 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	
	}
	
	
	 void touch() {					// 구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}
											
	
	
	static interface OnClickListener {      // 중첩 인터페이스
			 void onClick();
											
	}
		
	
}
