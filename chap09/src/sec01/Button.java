package sec01;

public class Button {
	
	OnClickListener listener;				// �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	
	}
	
	
	 void touch() {					// ���� ��ü�� onClick() �޼ҵ� ȣ��
		listener.onClick();
	}
											
	
	
	static interface OnClickListener {      // ��ø �������̽�
			 void onClick();
											
	}
		
	
}
