package sec04;

public class �л� {
	String gender;
	String deptCode;
	int score;

	public �л�(String gender, String deptCode, int score) {
		this.gender = gender;
		this.deptCode = deptCode;
		this.score = score;
	}

	void start() {
		System.out.println("���� : " + gender);
		System.out.println("�а��ڵ� : " + deptCode);
		System.out.println("���� : " + score);
		char grade = end(score);
		System.out.println("���� : " + grade);
	}

	char end(int x) {
		char result;
		if (x >= 90) {
			result = 'A';
		} else if (x > 80) {
			result = 'B';
		} else if (x >= 70) {
			result = 'C';
		} else {
			result = 'D';
		}	return result;

	}
}
