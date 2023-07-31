package day10.실습;

public class 바닐라라떼 {

	int 우유=1000;
	int 바닐라파우더=100;
	int 원두=1000;
	int 얼음=500;
	
	public void fillCoffee() {
		this.우유+=700;
		this.바닐라파우더+=30;
		this.원두+=500;
		this.얼음+=500;
	}
	
	public void printInfo()	{
		
		System.out.println("바닐라라떼 정보 출력");
		System.out.println(this.우유);
		System.out.println(this.바닐라파우더);
		System.out.println(this.원두);
		System.out.println(this.얼음);
	}
	
	public String 바닐라라떼만들기(int money) {
		if(money==3400) {
			System.out.println("바닐라라떼 만들기");
			this.우유-=100;
			this.바닐라파우더-=30;
			this.원두-=60;
			this.얼음-=70;
			
			return "바닐라라떼 나왔습니다";
			
		}
		return "3400원을 지불하세요";
	}
	
}
