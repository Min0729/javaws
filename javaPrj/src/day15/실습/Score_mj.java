package day15.실습;

public class Score_mj implements MyComparable_mj {

	private String name;
	private int kor;
	private int eng;
	
	public Score_mj() {
		// TODO Auto-generated constructor stub
	}

	public Score_mj(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

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
	public int compareTo(Object obj) {

		Score_mj s = (Score_mj)obj;
		return this.kor - s.kor;
	}
	
	
	
	
}
