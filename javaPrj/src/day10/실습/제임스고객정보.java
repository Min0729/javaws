package day10.실습;

public class 제임스고객정보 {
	
	int age;
	String name;
	boolean isMarried;
	int childNum;
	
	public void input(int age, String name, boolean isMarried, int childNum) {
		this.age = age;
		this.name=name;
		this.isMarried=isMarried;
		this.childNum=childNum;
	}
	
	public void printInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(isMarried);
		System.out.println(childNum);
		
	}
}
