package day13.ObjectEx;

public class Ex02 {

	public static void main(String[] args) {
		
		B b1 = new B(5);
		B b2 = new B(5);
		
		// 두 개의 객체가 만들어짐
		
		// true, false => 생각하기
	
		if(b1.equals(b2)) {	// b1, b2 <= b1이 가서 this로 받음
			System.out.println("두 객체는 같습니다");
		}

		// Object의 equals()는 객체의 래퍼런스를 비교함
	}

	
}
