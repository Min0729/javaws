package day8.함수;

public class Ex02 {

	public static void main(String[] args) {
	
		int n=5;
		getSum2(n);
		
	
	
	
	}

	public static void getSum2(int n) {
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

	

}
