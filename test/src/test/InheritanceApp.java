package test;

public class InheritanceApp {

	public static void main(String[] args) {

		Cal c = new Cal(2, 1);
		Cal3 c3 = new Cal3(2, 1);
		System.out.println(c3.sum()); // 3
		System.out.println(c3.minus()); // 1
	}

}
