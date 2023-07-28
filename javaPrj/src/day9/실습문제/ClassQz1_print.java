package day9.실습문제;

public class ClassQz1_print {

// 나이가 40살, 이름이 james 라는 남자가 있습니다.
// 이 남자는 결혼을 했고  자식이 셋 있습니다.
	
//	출력결과
//	이 사람이 나이
//	이 사람의 이름
//	이 사람의 결혼 여부
//	이사람의 자녀수
	
	public static void main(String[] args) {
		
		ClassQz1 c = new ClassQz1();
		
		c.name = "james";
		c.age=40;
		c.isMarried=true;
		c.numChild=3;
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.isMarried);
		System.out.println(c.numChild);
		
	}

}
