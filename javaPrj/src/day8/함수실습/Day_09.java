package day8.함수실습;

import java.util.Scanner;

public class Day_09 {

	static Scanner sc = new Scanner( System.in);
	static String[] days = new String[10];	
	static int index=0;		
	
	public static void main(String[] args) {
	
		int menu;
		
		loop:while(true) {
			System.out.println("메뉴선택:  1.등록 , 2조회, 3.변경, 4.삭제 , 5.종료 ");
			
			String menu_=sc.nextLine();
			menu=Integer.parseInt(menu_);
			
			switch(menu) {
			case 1:
				insertDay();
				break;
			
			case 2:
				selectDays();
				break;
			
			case 3:
				updateDay();
				break;
			
			case 4:
				deleteDay();
				break;
			
			case 5:
				System.out.println("종료");
				break loop;
			
			default:
				System.out.println("잘못된 입력");
			
			}
		}
		
		System.out.println("bye");
		
	}

	public static void insertDay() {
		System.out.println("일정을 입력하세요");
		String day = sc.nextLine();
		days[index]=day;
		index++;
	}
	
	public static void selectDays(){
		
		System.out.println("일정을 조회합니다");
		for(int i=0; i<index; i++) {
			System.out.println((i+1)+"."+days[i]);
		}
		
	}
	
	public static void updateDay() {
		System.out.println("변경");
		
		selectDays();
		
		System.out.println("변경할 순번과 내용을 입력하세요");
		String updateIndex_=sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);
		
		String updateDay = sc.nextLine();
		days[updateIndex-1]=updateDay;
		
	}
	
	// 1. 잠자기
	// 2. 집에가기
	
	public static void deleteDay() {
		System.out.println("삭제");
		
		selectDays();
		
		System.out.println("삭제하고 싶은 일정을 선택하세요");
		String deleteIndex_=sc.nextLine();
		int deleteIndex = Integer.parseInt(deleteIndex_);
		days[deleteIndex-1]="";
		
		for(int i=0; i<days.length-1; i++) {
			days[i]=days[i+1];
		
		}
	}
	
}
