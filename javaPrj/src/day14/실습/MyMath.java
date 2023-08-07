package day14.실습;

public class MyMath {
	
	public int add(int num1, int num2) throws NegativeNumberException {
		
		if(num1<0 || num2<0) {
			throw new NegativeNumberException();
		}
		return num1+num2;
	}
}
