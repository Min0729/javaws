package day11.실습;

public class 제임스Info {

	private int age;
	private String name;
	private boolean isMarried;
	private int childNum;
	
	// 기본생성자
	public 제임스Info() {};
	
	public 제임스Info(int age, String name, boolean isMarried, int childNum) {
		this.age = age;
		this.name=name;
		this.isMarried=isMarried;
		this.childNum=childNum;
	}
	
	public String toString() {
		return age+" "+name+" "+isMarried+" "+childNum; 
	}
	
}
