package day8.함수실습;

import java.util.Scanner;

public class Sum_01 {

	public static void main(String[] args) {
		
		// 두 수의 합을 구하는 함수 만들기
		
		Scanner sc=new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result=sum(a,b);
		System.out.print("두 수의 합은: ");
		System.out.println(result);
	}

	public static int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
}
