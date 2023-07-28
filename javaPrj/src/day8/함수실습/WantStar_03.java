package day8.함수실습;

import java.util.Scanner;

public class WantStar_03 {

	//  원하는 개수만큼 별을 출력하는 함수 만들기
	
	public static void main(String[] args) {
		
		System.out.println("별을 몇개 찍을것인지 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		star(n);

	}
	
	public static void star(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("*");
		}
	}

}
