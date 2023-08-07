package day15.실습;

public class LgBattery implements Battery {

	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
		
	}

	public LgBattery() {
		System.out.println("LG battery입니다");
	}
}
