package day11.실습;

public class Dance2 extends Dance {

	public void clap() {
		System.out.println("박수도 친다");
	}
	
	@Override
	public void dance() {
		System.out.println("트와이스 노래의 춤을 춘다");
	}
}
