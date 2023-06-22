package sec02;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean play = true;
		System.out.println(play);
		
		play = !play;   //  ! : 피연산자가 true면 false, 피연산자가 false면 true
		System.out.println(play);

		play = !play;
		System.out.println(play);
	
	}

}
