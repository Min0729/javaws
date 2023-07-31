package day10.실습;

public class 쇼핑몰정보 {

	long number;
	String id;
	String date;
	String name;
	String product_number;
	String address;
	
	
	public void input(long number,String id, String date,String name,String product_number, String address   ) {
		
		this.number=number;
		this.id=id;
		this.date=date;
		this.name=name;
		this.product_number=product_number;
		this.address=address;
	}
	
	public void printInfo() {
		System.out.println(number);
		System.out.println(id);
		System.out.println(date);
		System.out.println(name);
		System.out.println(product_number);
		System.out.println(address);
		
	}
	
}
