package sec02;

public class CharOperation {

	public static void main(String[] args) {

		char c1 = 'A' + 1;  	// B
		System.out.println(c1);
		char c2 = 'A';  
//		char c3 = c2 + 1;  ºÒ°¡´É
		char c3 = (char) (c2 + 1);
		System.out.println(c3);	// B
	}

}
