package day8.함수실습;

import java.util.Scanner;

public class IntegerParseInt_08 {

//	Integer.parseInt("25") ;   기능 만들어 보기
//    MyLib클래스 작성
//    함수이름    int  parseInt( String  str) 
//  //  char    ch = str.charAt(0) ;    // '2'
//  //  char   ch2 = str.charAt(1) ;    // '5'
// 
//
//  int su=  Integer.parseInt("25") ;    
//	프로그램에서 "25"  문자열 "25 " => 숫자로 바꿔주는 기능 25  
	
	
	public static void main(String[] args) {
		
		System.out.println("숫자로 바꿀 두자리 문자숫자를 입력하세요");	// 두자리 수일때만 됨
		Scanner sc = new Scanner(System.in);
		String s=sc.next();   // 2     =>  253
		char ch = s.charAt(0);
		char ch2 = s.charAt(1);
		
		int result = parseInt(ch, ch2); 
		System.out.println(result);
		
	}

	
	//    "253" =>  253     "456"  "125600"   => 125600 
	public static int parseInt(char ch, char ch2) {
		int su1 = (ch-48)*10;
		int su2= ch2-48;
		int result = su1 + su2;		
		return result;
	}
	
	
	//   '2' '5'    => 25  
	
	// "2563"  =>  2563
	// 
	
	
}
