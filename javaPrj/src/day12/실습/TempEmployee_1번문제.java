package day12.실습;

public class TempEmployee_1번문제 extends Employee_1번문제 {

	String expiration_date;
	
	public TempEmployee_1번문제() {
		
	}
	
	public TempEmployee_1번문제(String name,String rank,int number,int pay,String expiration_date ) {
		super(name,rank, number, pay);
		this.expiration_date=expiration_date;
	}
	
	public String toString() {
		return "사원이름:"+name+", 직급:"+rank+", 사원번호:"+number+", 월급:"+pay+"만원, 계약만료일:"+expiration_date;
	}
	
}
