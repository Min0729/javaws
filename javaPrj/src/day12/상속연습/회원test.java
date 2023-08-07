package day12.상속연습;

public class 회원test {

	public static void main(String[] args) {
		
		Vip회원 v = new Vip회원();
		System.out.println(v.toString());
		
		Vip회원 v2 = new Vip회원("홍길동", "hong", 789, "Vvip" , "20% 할인");
		System.out.println(v2.toString());
	

	}

}
