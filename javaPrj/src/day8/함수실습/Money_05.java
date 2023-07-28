package day8.함수실습;

import java.util.Scanner;

public class Money_05 {

	public static void main(String[] args) {
		//  자신이 만든 화폐구하기를 함수 만들기
		
		System.out.println("금액을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		money(money);
		

	}
	
	public static void money(int money) {
		
		int[] unit= {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		int [] arr = new int[8];
		
		for(int i=0; i<unit.length; i++) {
			arr[i]=money/unit[i];
			money=money%unit[i];
		}
		
		for(int i=0; i<unit.length; i++) {
			System.err.print(unit[i]+"=>"+arr[i]+" ");
		}
	}

}
