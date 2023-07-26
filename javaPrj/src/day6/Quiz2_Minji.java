package day6;

import java.util.Scanner;

public class Quiz2_Minji {

	public static void main(String[] args) {
		
		/*문제
		 *배열은 10개로 준비한다
		 *수를 10개 입력받아서 배열에 모두 저장
		 *배열의 모든값을 다 더한 결과를 출력
		 *배열의 모든 값을 출력
		 *단, 입력과 출력을 분리
		 */
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[10];
		int sum=0;
		System.out.println("10개의 수 입력");
		
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("배열의 모든값을 다 더한 결과");
		System.out.println(sum);
	}

}
