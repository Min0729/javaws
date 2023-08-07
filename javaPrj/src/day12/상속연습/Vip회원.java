package day12.상속연습;

public class Vip회원 extends 회원{

	String benefit;
	
	public Vip회원() {
		super();
		this.benefit="10% 할인";
	}
	
	public Vip회원(String name, String id, int number, String rating, String benefit) {
		super(name,id,number,rating);
		this.benefit=benefit;
	}
	
	public String toString() {
		return name+id+" "+number+" "+rating+benefit;
	}
}
