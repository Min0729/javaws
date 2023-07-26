package day7.함수;

public class Ex08 {

	public static void main(String[] args) {
		
		int result = a(5);
		System.out.println(result);
		
		int resultB = b('a');
		System.out.println(resultB);
		
		char resultC=c(3);
		System.out.println(resultC);
		
		double resultD=d();
		System.out.println(resultD);
		
		String resultE=e();
		System.out.println(resultE);
		
	}
	
	 //반환타입    //입력정보
		public static int  a( int a ) {
			System.out.println("a 호출");
			return 3;
		}
		
		
		public static int b(char a){
			System.out.println("b 호출");
			return 4;
		}
		
		
		public static char c( int a){
			System.out.println("c 호출");
			return 'c';
		}
		
		
		public static double d( ){
			System.out.println("d 호출");
			return 2.5;
		}
		
		
		public static String e(){
			System.out.println("e 호출");
			return "안녕" ;

}
}
