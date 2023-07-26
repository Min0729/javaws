package day6;

public class ArrayEx {

	public static void main(String[] args) {
		
		// 배열
		
		// 1.배열 사용해 보기	- 1차원 2차원 3차원
		// 2. 배열 이해하기
		
		// 자바에서 1차원 배열 선언
		
		// 변수 5개 선언 (메모리공간을 확호하는 행위)
		// int a, b, c, d, e;
		
		// 배열 선언
		// 자바는 배열부터 heap메모리 강제한다.
		
		// c에서 배열을 선언하는 코드, 자바는 사용할 수 없다.
		// c언어에서 배열을 선언하는 두가지 방법
		// int arr[5];
		// int&*arr2=(int*)malloc(sizeof(int)*5);
		
		// 자바에서 배열을 선언하는 방법
		// int arr[5];	이런 문법이 제공되지 않음
		int [] kors=new int[5];		//자바에서 1차원배열
		int [] kors2 = {90,80,99,100,89};	// 배열의 초기화블럭

		int a=10, b=5, c=8, d=9, e=25;
		int sum = a+b+c+d+e;
		System.out.println(sum);
		
		int[] arr = new int[5];
		// arr=100; (X), 배열명은 배열(연속적인 기억장소의 시작점이다)
		arr[0]=10;
		arr[1]=5;
		arr[2]=8;
		arr[3]=9;
		arr[4]=25;
		int sum2=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 배열의 첨자는 변수를 사용할 수 있다.
		// 반복문을 사용할 수 있다.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 내가 좋아하는것 5개 배열로 만들고 출력하시오 
		// char[] arr = new char[5];	' '
		// double[] arr2  arr2=new double[5];
		// String[] arr3 = new String[5];	" "
		// int[] arr4 = new int[5];
		
		String [] likeFood =  new String[5];
		likeFood[0]="치킨";
		likeFood[1]="피자";
		likeFood[2]="떡볶이";
		likeFood[3]="돈까스";
		likeFood[4]="튀김";
		
		for(int j=0; j<likeFood.length; j++) {
			System.out.println(likeFood[j]);
		}
		// 배열은 초기화를 해준다
		// 자료형의 기본값으로 초기화 해줌
		// 배열은 기억단계와 처리단계가 다를 때 반드시 필요함
		
		
		String str;
		for(int i=0; i<5; i++) {
			str=(i+1)+"번째 요소";
			System.out.println(str);
		}
		
	}
}
