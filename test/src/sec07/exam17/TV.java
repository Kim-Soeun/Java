package sec07.exam17;

public class TV {

	private String company;
	private int year;
	private int inch;
	
	
	public TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
	
}
