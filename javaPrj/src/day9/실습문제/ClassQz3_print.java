package day9.실습문제;

import java.util.Scanner;

//3. 학생성적을 담을  class  작성하기
//Score 이름으로 작성하시오
//  - name 학생이름
//  - kor  국어성적
//  - eng 영어성적
//  - avg 평균   
//
//출력결과
//학생이름: 홍길동
//국어 :90
//영어 :80
//평균: 85

public class ClassQz3_print {

	public static void main(String[] args) {
		
		Score s = new Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		s.name=sc.next();
		System.out.println("국어성적을 입력하세요");
		s.kor=sc.nextInt();
		System.out.println("영어성적을 입력하세요");
		s.eng=sc.nextInt();
		s.avg=(s.kor+s.eng)/2;
		
		System.out.println("학생이름: "+s.name);
		System.out.println("국어: "+s.kor);
		System.out.println("영어: "+s.eng);
		System.out.println("평균: "+s.avg);
		
		
				
				

	}

}
