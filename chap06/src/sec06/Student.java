package sec06;

import java.util.Scanner;

public class Student {
	
	Scanner s = new Scanner(System.in);
	
	private String name="홍길동";
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
		System.out.println("아이디를 입력하세요");
		String id = s.next();
		System.out.println("비밀번호를 입력하세요");
		int password = s.nextInt();
		
		if(this.id.equals(id) && this.password==password) {
			return true;
		}	else {
			return false;
		}
	}
	
	public void inputExam() {
		System.out.print("중간고사 : ");
		setMiddleScore(s.nextInt());
		System.out.print("기말고사 : ");
		setFinalScore(s.nextInt());
		double avg = (double) (getMiddleScore() + getFinalScore())/2;
		setAvg(avg);
		System.out.println(getName() + "님의 평균 점수는 : " + getAvg());
	}
	
	
	
	
}
