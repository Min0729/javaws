package day9.class자료형;

public class ClassTest2 {

	public static void main(String[] args) {
		
		Friends a = new Friends();
		
		a.name="박나윤";
		a.age=25;
		a.job="gym trainer";
		a.birthDay=19990712;
		
		Friends b = new Friends();
		
		b.name = "박나래";
		b.age=25;
		b.job="editor";
		b.birthDay=19991212;
		
		Friends c = new Friends();
		c.name="박지현";
		c.age=25;
		c.job="nurse";
		c.birthDay=19990330;
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.job);
		System.out.println(a.birthDay);
		
		System.out.println();
		
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.job);
		System.out.println(b.birthDay);
		
		System.out.println();
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.job);
		System.out.println(c.birthDay);
		

	}

}
