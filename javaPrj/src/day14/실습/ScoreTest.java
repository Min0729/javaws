package day14.실습;

public class ScoreTest {

	public static void main(String[] args) {
	
		Score s1=  new Score("김민지");
		Score s2 = new Score("김민지");
		
		if(s1.equals(s2)) {
			System.out.println("같은 학생입니다");
		}else {
			System.out.println("다른 학생입니다");
		}

	}

}
