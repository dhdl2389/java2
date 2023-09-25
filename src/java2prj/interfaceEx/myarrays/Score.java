package java2prj.interfaceEx.myarrays;

public class Score implements MyComparable {
	int kor;
	int eng;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public int compareTo(Object other) {
		Score s1 = (Score) other;
		int result = this.eng - s1.eng; // 내가 크면 양수, 작으면 음수
		return result;
	}

}
