package day6;

public class Array2Ex {

	public static void main(String[] args) {
		
 		// 내가 좋아하는 과일	5
 		// 내가 좋아하는 음료	5
		
		String[] fruits= {"바나나","복숭아","사과","샤인머스켓","망고"};
		String[] beverage= {"초코라떼","바닐라라떼","딸기요거트스무디","초코바나나","아이스티"};
		
		// 2차원 배열
		
		// 2차원 배열 선언	[행][열]
		// String[][] favorites = new String[2][5];
		
		String[][] favorites = {{"바나나","복숭아","사과","샤인머스켓","망고"},
								{"초코라떼","바닐라라떼","딸기요거트스무디","초코바나나","아이스티"}};
		
		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);
		
		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);
		
	}

}
