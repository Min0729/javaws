package day15.실습;

public class SMBattery implements Battery {

	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
		
	}
	
	public SMBattery() {
		System.out.println("SM battery입니다");
	}

}
