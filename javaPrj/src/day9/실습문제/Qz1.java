package day9.실습문제;

import java.util.Scanner;

public class Qz1 {

	public static void main(String[] args) {
		// 좋아하는거 5개를 관리할 수 있는 프로그램 작성하기     
		// main에서 작성하기  ( 등록과 조회만 해 보기)
		
		String[] favorites=new String[5];
		
		Scanner sc = new Scanner(System.in);
		int index=0;
		
		loop: while(true) {
			System.out.println("메뉴선택: 1.등록 2.조회");
			
			int menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는것을 입력하세요");
				String favorite = sc.next();
				favorites[index]=favorite;
				index++;
				
				break;
				
			case 2:
				System.out.println("좋아하는것을 조회합니다");
				for(int i=0; i<index; i++) {
					System.err.println((i+1)+"."+favorites[i]);
				}
				
				break;
				
			default:
				System.out.println("잘못된 입력");
				break loop;
			}
			
			
		}

	}

}
