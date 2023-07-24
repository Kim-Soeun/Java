package sec01;

public class Member {
	
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)  {
			Member member = (Member) obj;
			// 매개변수 타입을 Member로 강제 변환
		if(id.equals(member.id)) {
			return true;
		}
		}
		return false;
	}
	
	
	
	
}
