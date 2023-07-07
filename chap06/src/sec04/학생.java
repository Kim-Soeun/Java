package sec04;

public class 학생 {
	String gender;
	String deptCode;
	int score;

	public 학생(String gender, String deptCode, int score) {
		this.gender = gender;
		this.deptCode = deptCode;
		this.score = score;
	}

	void start() {
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + deptCode);
		System.out.println("성적 : " + score);
		char grade = end(score);
		System.out.println("학점 : " + grade);
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
