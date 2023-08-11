package 실습0811;

import java.util.ArrayList;
import java.util.Scanner;

public class 기능구현 {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<회원정보> info = new ArrayList<회원정보>();
	
	
	public static void 회원가입하기() {
		
		System.out.println("아이디를 입력하세요");
		String id=sc.next();
		
		System.out.println("비밀번호를 입력하세요");
		String pwd=sc.next();
		
		System.out.println("사용자 이름을 입력하세요");
		String name=sc.next();
		
		info.add(new 회원정보(id,pwd,name));
		
		System.out.println("회원가입이 완료되었습니다");
	}
	
	public static void 로그인() {
		
		System.out.println("아이디를 입력하세요");
		String id=sc.next();
		
		System.out.println("비밀번호를 입력하세요");
		String pwd=sc.next();
		
		for(int i=0; i<info.size();i++) {
			회원정보 info_ = info.get(i);
			if(info_.getId().equals(id) && info_.getPwd().equals(pwd)) {
				System.out.println("로그인 성공");
				로그인후메뉴();
				
			}else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
			}
				
			
		}
		
	}
	
	public static void 로그인후메뉴() {
		
		loop: while(true) {
		System.out.println("메뉴를 선택해주세요, 1:마이페이지 2:예약하기 3:로그아웃하기");
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			
			break;
		case 2:	
			
			break;
			
		case 3:
			System.out.println("------------로그아웃 합니다-------------");
			break loop;
			
			
			}
		}
	}
	
}
