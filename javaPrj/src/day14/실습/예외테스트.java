package day14.실습;

import java.util.Scanner;

public class 예외테스트 {

	public static void main(String[] args) {
		
		MyMath m = new MyMath();
		
		int su1, su2;
		Scanner sc = new Scanner(System.in);
		su1=sc.nextInt();
		su2=sc.nextInt();
		
		try {
			m.add(su1,su2);
		} catch (NegativeNumberException e) {
			// e.printStackTrace();
			System.out.println("음수를 입력했군요");
		}
		
		System.out.println("정상종료");
	}

}
