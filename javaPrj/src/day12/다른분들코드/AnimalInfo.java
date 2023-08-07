package day12.다른분들코드;

public class AnimalInfo extends Animal {

	int age;

	public AnimalInfo(String name, String fname, int age) {
		
		super(name , fname);	// 명시적으로 부모의 매개변수있는 생성자 call
		this.age = age;

	}

	public String toString() {
		return "이름:"+ name +" 별명:"+  fname + " 나이:" + age;
	}

}
