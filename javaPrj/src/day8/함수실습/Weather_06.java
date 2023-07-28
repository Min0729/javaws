package day8.함수실습;

public class Weather_06 {

	public static void main(String[] args) {
		//  일주일간의 날씨정보를 반환하는 함수 만들기 (날씨정보는 임의 작성)
		
		//weather();
		
		//System.out.println("==========================");
		
		for(String printWeather : weather2()) {
			System.out.println(printWeather);
		}
		

	}
/*
	public static void weather() {
		System.out.println("월요일: 맑음");
		System.out.println("화요일: 비");
		System.out.println("수요일: 맑음");
		System.out.println("목요일: 눈");
		System.out.println("금요일: 흐림");
		System.out.println("토요일: 흐림");
		System.out.println("일요일: 비");
		
		
	}*/
	
	
	public static String[] weather2() {
		 String[]   result  = { "월요일: 맑음" , "화요일: 비","수요일: 맑음", "목요일: 눈","금요일: 흐림", "토요일: 흐림","일요일: 비"} ;
		 return result;
		
	}
}
