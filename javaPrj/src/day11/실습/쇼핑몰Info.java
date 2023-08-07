package day11.실습;

public class 쇼핑몰Info {

	// 생성자와 toString을 이용하여 값을 저장하고 출력하기 (쇼핑몰)
	
	private long number;
	private String id;
	private String date;
	private String name;
	private String product_number;
	private String address;
	
	// 기본생성자
	public 쇼핑몰Info() {};
	
	public 쇼핑몰Info(long number,String id,String date,String name,String product_number,String address) {
		
		this.number=number;
		this.id=id;
		this.date=date;
		this.name=name;
		this.product_number=product_number;
		this.address=address;
		
	}
	
	public String toString() {
		return number+" "+id+" "+date+" "+ name+" "+product_number+" "+address;
	}
	
	
}
