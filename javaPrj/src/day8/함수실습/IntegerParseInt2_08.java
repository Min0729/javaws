package day8.함수실습;

import java.util.Scanner;

public class IntegerParseInt2_08 {

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
		
		System.out.println("숫자로 바꿀 문자숫자를 입력하세요");	// 어떤자리의 수든 다 되게 해보기 => 된다!!!!!!!!!!!!!♥
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char[] ch = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			ch[i]=s.charAt(i);
		}
		
		int result = parseInt(ch);
		System.out.println(result);
				
		
	}
	
	//    "253" =>  253       "125600"   => 125600 
	public static int parseInt(char[] ch) {
		int result=0;
		for(int i=0; i<ch.length; i++) {
			//Math.pow(밑, 지수)
			int su = (ch[i]-48)*(int)Math.pow(10, ch.length-i-1);
	
			result=result+su;
		}
		return result;
	}
	
	
	//   '2' '5'    => 25  
	
	// "2563"  =>  2563
	// 
	
	
}
