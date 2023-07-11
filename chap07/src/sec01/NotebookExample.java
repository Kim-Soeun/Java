package sec01;

public class NotebookExample {

	public static void main(String[] args) {

		Notebook notebook = new Notebook("homewifi", "에어팟", 1.2);
		
		// 상속받은 메소드
		notebook.turnOn();
		notebook.game();	
		notebook.connectInternet();
		notebook.turnOff();		
		
		// 기존 메소드
		notebook.kilogram(1.2);
		
		String result1 = notebook.internet("homewifi");	
		System.out.println(result1);
		
		String result2 = notebook.connect("에어팟");
		System.out.println(result2);
		
		String result3 = notebook.disconnect("에어팟");
		System.out.println(result3);
		
	}
	

}
