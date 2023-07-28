package day8.함수실습;

import java.util.Scanner;

public class Weather2_06 {

	//  원하는 요일의 날씨정보를 반환하는 함수 만들기 (날씨정보는 임의 작성)
	
	public static void main(String[] args) {
		
		System.out.println("요일을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		String result = weather(day);
		System.out.println(result);

	}
	
	public static String weather(String day) {
		 String[]   result  = { "월요일: 맑음" , "화요일: 비","수요일: 맑음", "목요일: 눈","금요일: 흐림", "토요일: 흐림","일요일: 비", "잘못된 입력입니다"} ;
		 
		 String weather;
		 switch(day) {
		 	case "월요일":
		 		weather  =result[0];
		 		break;
		 	case "화요일":
		 		weather=  result[1];
		 		break;
			case "수요일":
				weather= result[2];
				break;
		 	case "목요일":
		 		weather= result[3];
		 		break;
		 	case "금요일":
		 		weather= result[4];
		 		break;
		 	case "토요일":
		 		weather= result[5];
		 		break;
		 	case "일요일":
		 		weather= result[6];
		 		break;
		 	default:
		 		weather= result[7];
			  
		 }
		 
		 return  weather;
		 
		 
	}
}
