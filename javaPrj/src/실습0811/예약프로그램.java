package 실습0811;

import java.util.Scanner;

public class 예약프로그램 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		loop: while(true) {
			System.out.println("메뉴를 선택해주세요, 1:회원가입 2:로그인 3:프로그램 종료");
			int menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-----------회원가입 하기------------");
				기능구현.회원가입하기();
				break;
			
			case 2:
				System.out.println("-----------로그인 하기--------------");
				기능구현.로그인();
				
				break;
		
			case 3:
				System.out.println("------------프로그램 종료------------");
				break loop;
			}
			
		}
		
	}

	

}
