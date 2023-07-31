package day10.실습;

public class 쇼핑몰정보Test {

	public static void main(String[] args) {
		
		쇼핑몰정보 info = new 쇼핑몰정보();
		
		info.input(201803120001L, "abc123", "2018년3월12일", "홍길순", "D0345-12", "서울시 영등포구 여의도동 20번지");

		info.printInfo();
	}

}
