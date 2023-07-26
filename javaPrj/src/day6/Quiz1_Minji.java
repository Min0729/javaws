package day6;

import java.util.Scanner;

public class Quiz1_Minji {

	public static void main(String[] args) {
		
		/* 	문제
		 	배열은 10개로 준비한다.
			수를 10개 입력받아서 짝수인경우에만 배열에 저장하시오
			짝수배열의 내용만큼만 모두 출력하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[10];
		int index=0;
		
		System.out.println("10개의 수 입력");

			for(int i=0; i<10; i++) {
				
				int num=sc.nextInt();
				
				if(num%2==0) {
					arr[index]=num;
					index++;
				}	
		}
			
		for(int i=0; i<index; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
