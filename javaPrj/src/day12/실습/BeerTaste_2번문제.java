package day12.실습;

import java.text.StringCharacterIterator;

public class BeerTaste_2번문제 extends Beer_2번문제{
	String flavor;
	int price;
	
	public BeerTaste_2번문제() {
		
	}
	public BeerTaste_2번문제(String name, String type, String flavor, int alcohol_level, int price) {
		super(name,alcohol_level,type);
		this.flavor=flavor;
		this.price=price;
	}
	public String toString() {
		return "이름: "+name+" 타입: "+type+" 도수: "+alcohol_level+" 맛: "+flavor+" 가격: "+price;
	}
}
