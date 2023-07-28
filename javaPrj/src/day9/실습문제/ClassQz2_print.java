package day9.실습문제;

public class ClassQz2_print {

		//주문번호: 201803120001
		//주문자아이디: abc123
		//주문날짜:2018년3월12일
		//주문자이름: 홍길순
		//주문상품번호😛D0345-12
		//배송주소: 서울시 영등포구 여의도동 20번지
	
	public static void main(String[] args) {
	
		ClassQz2 c = new ClassQz2();
		
		c.num=201803120001L;
		c.id="abc123";
		c.date="2018년3월12일";
		c.name="홍길순";
		c.product_number="D0345-12";
		c.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println(c.num);
		System.out.println(c.id);
		System.out.println(c.date);
		System.out.println(c.name);
		System.out.println(c.product_number);
		System.out.println(c.address);

	}

}
