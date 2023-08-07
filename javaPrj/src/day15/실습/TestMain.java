package day15.실습;

public class TestMain {

	public static void main(String[] args) {

		HandPhone cellphone = new HandPhone();
		
		LgBattery lg = new LgBattery();
		
		cellphone.setBattery(lg);
		cellphone.powerOn();
		
		
		SMBattery sm = new SMBattery();
		
		cellphone.setBattery(sm);
		cellphone.powerOn();
	}

}
