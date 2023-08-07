package day12.다른분들코드;

public class NotebookTest {
	
	public static void main(String[] args) {
		
		// Gram g2=new Gram(); <= 불가
		Gram g = new Gram("i7", 16, "Gram", "RTX4090");
		System.out.println(g.toString());
	}

}
