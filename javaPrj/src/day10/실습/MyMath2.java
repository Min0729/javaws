package day10.실습;

public class MyMath2 {

	public static int add(int su1, int su2) {
		return su1+su2;
	}
	
	public static int abs(int su) {
		int result = 0;
		
		if(su>0) {
			result = su;
		}else if(su<0) {
			result = -su;
		}
		return result;
	}
}
