package day5.quiz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 1~원하는 수까지 합계
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();	// 입력
		int sum=0;				// 합, 출력변수
		
		for(int i=1; i<=su; i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
