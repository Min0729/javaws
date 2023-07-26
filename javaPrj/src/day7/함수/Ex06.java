package day7.함수;

public class Ex06 {

	public static void main(String[] args) {
		
		// 1~10 까지의 합을 출력하는 코드
		
		System.out.println("프로그램 시작합니다");
		
		printSum();
		
		System.out.println("프로그램이 수행합니다");
		
		printSum();
		
		System.out.println("프로그램이 종료합니다");
		

	}

	public static void printSum() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
