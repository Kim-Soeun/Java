package sec01;

public class NotebookExample {

	public static void main(String[] args) {

		Notebook notebook = new Notebook("homewifi", "������", 1.2);
		
		// ��ӹ��� �޼ҵ�
		notebook.turnOn();
		notebook.game();	
		notebook.connectInternet();
		notebook.turnOff();		
		
		// ���� �޼ҵ�
		notebook.kilogram(1.2);
		
		String result1 = notebook.internet("homewifi");	
		System.out.println(result1);
		
		String result2 = notebook.connect("������");
		System.out.println(result2);
		
		String result3 = notebook.disconnect("������");
		System.out.println(result3);
		
	}
	

}
