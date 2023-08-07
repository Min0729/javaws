package day14.실습;

public class NegativeNumberException extends Exception{

	public NegativeNumberException() {
		super("음수이면 안된다");
	}
}
