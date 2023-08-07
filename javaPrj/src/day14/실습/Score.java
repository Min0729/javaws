package day14.실습;

public class Score {

	String name;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"입니다";
	}
	
	public boolean equals(Object obj) {
		boolean result=false;
		
		Score s = (Score)obj;
		
		if(this.name==s.name) {
			result=true;
		}
		return result;
	}
	
	
}
