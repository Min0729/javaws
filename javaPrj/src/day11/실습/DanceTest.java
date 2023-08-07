package day11.실습;

public class DanceTest {

	public static void main(String[] args) {
		
		Dance1 d1 = new Dance1();
		
		Dance2 d2 = new Dance2();
		
		print(d1);
		print(d2);
		
		d1.sing();
		d2.clap();
		
	}
	
	public static void print(Dance dance) {
		dance.dance();
	}

}
