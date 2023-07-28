package day8.함수실습;

public class EvenOdd_07 {

	public static void main(String[] args) {
		// 짝수(2~10),   홀수(1~9) 를 반환하는 함수 만들기
		
		int[][] result = EvenOdd();
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] EvenOdd() {
		int [][] num = {
				{2,4,6,8,10},
				{1,3,6,9}
		};
		
		return num;
	}
}
