package day15.실습;

public class MyArraysTest_mj {

	public static void main(String[] args) {
		
		Score_mj[] arr = new Score_mj[3];
		arr[0]= new Score_mj("이길동",90,71);
		arr[1]= new Score_mj("김길동",70,99);
		arr[2]= new Score_mj("박길동",90,89);
		MyArrays_mj.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		MyArrays_mj.sort(arr, new MyComparator_mj() {

			@Override
			public int compare(Object o1, Object o2) {
				Score_mj s1 = (Score_mj)o1;
				Score_mj s2 = (Score_mj)o2;
				
				return s1.getEng()-s2.getEng();
			}});
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		
	}

}
