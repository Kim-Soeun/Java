package sec06;

import java.util.Scanner;

public class Student {
	
	Scanner s = new Scanner(System.in);
	
	private String name="ȫ�浿";
	private String code="A123";
	private int middleScore;
	private int finalScore;
	private double avg;
	
	
	final String id = "admin";
	final int password = 1234;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public boolean checkLogin() {
		System.out.println("���̵� �Է��ϼ���");
		String id = s.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int password = s.nextInt();
		
		if(this.id.equals(id) && this.password==password) {
			return true;
		}	else {
			return false;
		}
	}
	
	public void inputExam() {
		System.out.print("�߰���� : ");
		setMiddleScore(s.nextInt());
		System.out.print("�⸻��� : ");
		setFinalScore(s.nextInt());
		double avg = (double) (getMiddleScore() + getFinalScore())/2;
		setAvg(avg);
		System.out.println(getName() + "���� ��� ������ : " + getAvg());
	}
	
	
	
	
}
