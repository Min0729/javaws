package day9.실습문제;

import java.util.Scanner;

	// Qz1을 함수로 작성하기

public class Qz2 {

	static String[] favorites = new String[5];
	static Scanner sc = new Scanner( System.in);
	static int index=0;
	
	public static void main(String[] args) {
		
		
		loop: while(true) {
			System.out.println("메뉴선택: 1.등록, 2.조회");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				insert();
				break;
				
			case 2:
				search();
				break;
				
			default:
				System.out.println("잘못된 입력");
				break loop;
			}
		}
	}

	public static void insert() {
		System.out.println("좋아하는것을 입력하세요");
		String favorite = sc.next();
		favorites[index]=favorite;
		index++;		
	}
	
	public static void search() {
		System.out.println("좋아하는것을 조회합니다");
		for(int i=0; i<index; i++) {
			System.out.println((i+1)+"."+ favorites[i]);
		}
	}
	
}
