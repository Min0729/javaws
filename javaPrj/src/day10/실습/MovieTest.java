package day10.실습;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		movie.input1("엘리멘탈", "애니메이션", 109, "피터 손");
		movie.input2("밀수", "범죄", 129, "류승완");
		movie.input3("명탐정 코난 : 흑철의 어영", "애니메이션", 110, "타치카와 유즈루");
		
		movie.printInfo();
		System.out.println();
		
		movie.printInfo2();
		System.out.println();
				
		movie.printInfo3();
		
	}

}
