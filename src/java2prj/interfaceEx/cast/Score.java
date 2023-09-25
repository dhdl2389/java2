package java2prj.interfaceEx.cast;

public class Score implements MyCompareable{
	String name;
	int kor;
	int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public Score() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object other) {
		Score s = (Score) other;
		return this.kor - s.kor;
	}
}
