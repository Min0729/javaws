package day9.실습문제;

import java.util.Scanner;

public class Qz4 {
	
	// 3번을 함수로 만들어 보기 

	static String [] favorites = new String[5];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
		
	public static void main(String[] args) {
		
		loop:while(true) {
			System.out.println("메뉴선택 1.등록 2.조회 3.변경 4.삭제");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				insert();
				break;
				
			case 2:
				search();
				break;
				
			case 3:
				search();
				change();
				break;
				
			case 4:
				search();
				delete();
				break;
				
			default:
				System.out.println("잘못된 입력입니다");
				System.out.println("프로그램을 종료합니다");
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
			System.out.println((i+1)+"."+favorites[i]);
		}
	}
	
	public static void change() {
		System.out.println("변경할 순번을 입력하세요");
		int updateIndex = sc.nextInt();
		
		System.out.println("변경할 내용을 입력하세요");
		String updateFavorite=sc.next();
		
		favorites[updateIndex-1]=updateFavorite;
	}
	
	public static void delete() {
		System.out.println("삭제하고싶은것의 번호를 선택하세요");
		int deleteIndex = sc.nextInt()-1;
		String [] newFavorites = new String[favorites.length-1];
		
		for(int i=0; i<deleteIndex; i++) {
			newFavorites[i]=favorites[i];
		}
		
		for(int i=deleteIndex; i<newFavorites.length; i++) {
			newFavorites[i]=favorites[i+1];
		}
	
		index--;
		favorites=newFavorites;
		
		
	}
}
