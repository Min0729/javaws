package day11.실습;

public class Dance1 extends Dance{

	public void sing() {
		System.out.println("노래도 부른다");
	}
	
	@Override
	public void dance() {
		System.out.println("오마이걸 노래의 춤을 춘다");
	}
	
}
