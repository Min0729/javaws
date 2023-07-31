package day10.실습;

public class 바닐라라떼Test {

	public static void main(String[] args) {
	
		바닐라라떼 coffee = new 바닐라라떼();
		
		coffee.printInfo();
		
		coffee.fillCoffee();
		
		coffee.printInfo();
		
		int money=3400;
		String result = coffee.바닐라라떼만들기(money);
		System.out.println(result);
		
	}

}
