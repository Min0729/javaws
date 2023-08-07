package day12.상속연습;

public class 회원 {
	
	String name;
	String id;
	int number;
	String rating;
	
	public 회원() {
		this("김민지","myid99",12345,"Vip");
	}
	
	public 회원(String name, String id, int number, String rating) {
		this.name=name;
		this.id=id;
		this.number = number;
		this.rating = rating;
	}
	
}
