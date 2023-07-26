package day6.arry3;

public class Array3Ex3 {
	public static void main(String[] agrs) {
		
		// 3차원배열 => 면 행 열
		
		int [][] even = {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		};
		
		int [][] odd= {
				{1,3,5},
				{7,9,11},
				{13,15,17}
		};
		
		int [][][] numbers= {
				{
					{2,4,6},
					{8,10,12},
					{14,16,18}
				},
				{
					{1,3,5},
					{7,9,11},
					{13,15,17}
				}
		};
		
		// 10 , 15 출력
		System.out.println(numbers[0][1][1]);	// 0면 1행 1열
		System.out.println(numbers[1][2][1]);
		
		System.out.println();
		
		// 전체 출력
		for(int i=0; i<numbers.length; i++) {
			for( int j=0; j<numbers[i].length; j++) {
				for(int k=0; k<numbers[i][j].length; k++) {
					System.out.print(numbers[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
