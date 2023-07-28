package day9.함수;

public class CallByReference2 {

	public static void main(String[] args) {
			
		//
		int[] kors = new int[3];
		
		// 등록
		//kors[0]=5;
		//kors[1]=8;
		//kors[2]=9;
		
		insertKors(kors);
		
		
		// 조회
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
		printKors(kors);
		
		
		
	}
	
	public static int[] insertKors(int[] kors) {
		for(int i=0; i<kors.length; i++) {
			kors[i]=i;
		}
		return kors;
	}
	
	
	public static void printKors(int[] kors) {
		for( int i=0; i<kors.length; i++) {
			System.out.print(kors[i]+" ");
		}
	}


}
