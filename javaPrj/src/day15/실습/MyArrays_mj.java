package day15.실습;

public class MyArrays_mj {

	public static void sort(Object[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				MyComparable_mj m = (MyComparable_mj)arr[i];
				if(m.compareTo(arr[j])>0) {
					Object tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	
	public static void sort (Object[] arr, MyComparator_mj c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(c.compare(arr[i], arr[j])>0){
					Object tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
}
