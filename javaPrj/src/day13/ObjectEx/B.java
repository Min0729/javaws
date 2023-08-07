package day13.ObjectEx;

public class B {
	int number;
	
	public B() {}
	
	public B(int number) {
		super();
		this.number = number;
	}


	@Override
	public String toString() {
	
		return number+"입니다";
	}
	 
	// public boolean equals(B this,Object obj) {
	 	public boolean equals(B this, Object obj) {
		boolean result=false;
		
		B b = (B)obj;	// 다운캐스팅
		
		if(this.number == b.number)
			result=true;
		
		return result;
	 }
	 	
	 	
}
