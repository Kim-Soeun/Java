package test.exam1;

public class Grade {

	private int math;
	private int science;
	private int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public double average() {
		int sum = (getMath() + getScience() + getEnglish());
		double av = sum / 3;
		return av;
	}

}
