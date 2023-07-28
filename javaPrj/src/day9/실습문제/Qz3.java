package day9.실습문제;

import java.util.Scanner;

public class Qz3 {

	public static void main(String[] args) {
		// 좋아하는거 5개를 관리할 수 있는 프로그램 작성하기
		// main에서 작성하기  ( 등록, 조회, 변경, 삭제)

		String [] favorites = new String[5];
		Scanner sc=new Scanner(System.in);
		int index=0;
		
		loop: while(true) {
			System.out.println("메뉴선택 1.등록 2.조회 3.변경 4.삭제");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("좋아하는것을 입력하세요");
				String favorite =sc.next();
				favorites[index]=favorite;
				index++;
				
				break;
				
			case 2:
				System.out.println("좋아하는것을 조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"."+favorites[i]);
				}
				
				break;
				
			case 3:
				System.out.println("좋아하는것을 조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"."+favorites[i]);
				}
				
				System.out.println("변경할 순번을 입력하세요");
				int updateIndex = sc.nextInt();
				
				System.out.println("변경할 내용을 입력하세요");
				String updateFavorite=sc.next();
				
				favorites[updateIndex-1]=updateFavorite;
				
				break;
				
				
			case 4:
				System.out.println("좋아하는것을 조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+"."+favorites[i]);
				}
				
				System.out.println("삭제하고싶은것의 번호를 선택하세요");
				int deleteIndex = sc.nextInt()-1;
				String [] newFavorites = new String[favorites.length-1];
				
				for(int i=0; i<deleteIndex; i++) {
					newFavorites[i]=favorites[i];
				}
				
				for(int i=deleteIndex; i<newFavorites.length; i++) {
					newFavorites[i]=favorites[i+1];
				}
				
				favorites= newFavorites;				
				index--;
				break;
				
			default:
				System.out.println("잘못된 입력입니다");
				System.out.println("프로그램을 종료합니다");
				break loop;
			}
		}
		
	}

}
