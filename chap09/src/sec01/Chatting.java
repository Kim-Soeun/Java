package sec01;

public class Chatting {		// 422p 4�� ����
	


	void startChat(String chatId) {
		
		String nickName = chatId;
		
//		String nickName=null;
//		���� Ŭ������ ���Ե� �޼ҵ��� �ʵ�� �⺻������ final�� �پ
//		�ݵ�� ���� �����ؾ� ��
		
//		inputData="�������";
//		���� Ŭ������ �޼ҵ� �ȿ� ���� �ʵ�� �ش� ���� �ȿ����� ��� ������
		
		
		
		class Chat {				// ���� Ŭ����
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
			
		}
		
		
		Chat chat = new Chat();
		chat.start();
	}
	
	
}
