package day12.인터페이스;


// 인터페이스 상속
// 인터페이스 (약속)을 구현한다는 의미를 가짐
// implements 키워드 사용
public class MyCalculator implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		System.out.println("민지 add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("민지 sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("민지 multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("민지 divide");
		return su1/su2;
	}

	
	
}
