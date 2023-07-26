package day6;

public class 민규님2차원배열 {

	public static void main(String[] args) {
		String[][] favor = {{"개","똥","아"},
				{"똥","쌌","니"},
				{"아","니","오"}};

			System.out.print(favor[0][0]);
			System.out.print(favor[1][0]);
			System.out.println(favor[2][0]);
			System.out.print(favor[1][0]);
			System.out.print(favor[1][1]);
			System.out.println(favor[1][2]);
			System.out.print(favor[2][0]);
			System.out.print(favor[2][1]);
			System.out.println(favor[2][2]);
			
			for(int i=0 ; i<favor.length ; i++) {
				for(int j=0; j<favor.length ; j++) {
					System.out.println(favor[i][j]);
				}
			}
			
			// 첫번째 행 출력
			for(int i=0; i<favor[0].length; i++) {
				System.out.print(favor[0][i]);
			}
			
			System.out.println();
			
			// 두번째 행 출력
			for(int i=0; i<favor[1].length; i++) {
				System.out.print(favor[1][i]);
			}
			
			System.out.println();
			
			// 세번째 행 출력
			for(int i=0; i<favor[2].length; i++) {
				System.out.print(favor[2][i]);
			}
			System.out.println();
			
			// 전체 출력
			for(int j=0; j<favor.length; j++) {
				for(int i=0; i<favor[j].length; i++) {
					System.out.println(favor[j][i]);
				}
			}
			
	}

}
