package 사이드메뉴만들기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 객체다루기메뉴 {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Movie> list  = new ArrayList<Movie>();
	
	public static void main(String[] args) {
		
		loop:while(true) {
			
			System.out.println("\n1.조회, 2.투표, 3.인기순조회, 4.종료");
			
			String menu=sc.next();
			initMovie();
			
			switch(menu) {
			case "1":
				System.out.println(" 요즘 인기 영화를 소개합니다\n");
				selectMovie();
				break;
			
			case "2":
				System.out.println("\n \n 재미있어 보이는 영화를 선택주세요");
				
					int choice=sc.nextInt();
					
					Movie movie = list.get(choice-1);		
					movie.increatePopular();
					break;
					
			
			case "3":
				//인기순으로 조회하기
				System.out.println(" 인기순 정렬");
				인기순으로조회하기();
				break;
			
			
			case "4":
				System.out.println("종료되었습니다");
				break loop;
				
			default:
				System.out.println("잘못된 선택입니다, 메뉴를 다시 선택해주세요");
			}
			
			
		}
		

	}
	
	private static void 인기순으로조회하기() {
		 //정렬하기
		
		Collections.sort(list, new Comparator<Movie> () {

			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o2.popular - o1.popular;
			}});
		
		selectMovie();
		
	}


	public static void selectMovie() {
		for(int i=0; i<list.size(); i++) {
			Movie a = list.get(i);
			System.out.println(a);
		}
	}

	
	
	public static void initMovie() {
		list.add(new Movie("콘크리트 유토피아","드라마",1,"엄태화","130분"));
		list.add(new Movie("밀수","범죄",2,"류승완","129분"));
		list.add(new Movie("엘리멘탈","애니메이션",3,"피터 손","109분"));
		list.add(new Movie("비공식작전","드라마",4,"김성훈","132분"));
		list.add(new Movie("더문","SF",5,"김용화","129분"));
		list.add(new Movie(" 미션 임파서블: 데드 레코닝 PART ONE","액션",6,"크리스토퍼 맥쿼리","163분"));
		list.add(new Movie("바비","드라마",7,"그레타 거윅","114분"));
		list.add(new Movie("명탐정코난: 흑철의 어영","애니메이션",8,"타치카와 유즈루","110분"));
		list.add(new Movie("몬스터 패밀리2","애니메이션",9,"호거 태프","103분"));
		list.add(new Movie("보호자","액션",10,"정우성","97분"));
	}

}
