package sec01;

public class Member2 {
	
	
	private String id;
	private String name;
	
	
	public Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}




	@Override
	public String toString() {
		return id + ": " + name ;
	}




	public static void main(String[] args) {

		Member2 member = new Member2("blue", "���Ķ�");
		System.out.println(member);
		// blue: ���Ķ� ��µ�
		
		
	}

}
