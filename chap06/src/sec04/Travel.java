package sec04;

public class Travel {
	private int oil;
	private String location;
	
	
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	void oilMinus(int x) {
		oil -= x;
	}
	
	boolean isLeftOil() {
		if(oil <= 0) {
			System.out.println("�ֹ����� �����. ���� �����ϼ���");
			return false;
		}	else {
			System.out.println("�ֹ����� ���Ҿ��. ��� �����ϼ���");
			return true;
		}
	}
}