package sec04;

public class MemberService {

	String id = "hong";
	
	boolean login(String id, String password) {
		if (id.equals(this.id) && password.equals("12345")) {
			return true;
		}	else { 
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}
