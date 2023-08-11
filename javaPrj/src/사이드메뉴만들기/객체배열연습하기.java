package 사이드메뉴만들기;

public class 객체배열연습하기 {

	public static void main(String[] args) {
		
		Movie[] m = new Movie[10];
		
		m[0]=new Movie("콘크리트 유토피아","드라마",1,"엄태화","130분");
		m[1]=new Movie("밀수","범죄",2,"류승완","129분");
		m[2]=new Movie("엘리멘탈","애니메이션",3,"피터 손","109분");
		m[3]=new Movie("비공식작전","드라마",4,"김성훈","132분");
		m[4]=new Movie("더문","SF",5,"김용화","129분");
		m[5]=new Movie(" 미션 임파서블: 데드 레코닝 PART ONE","액션",6,"크리스토퍼 맥쿼리","163분");
		m[6]=new Movie("바비","드라마",7,"그레타 거윅","114분");
		m[7]=new Movie("명탐정코난: 흑철의 어영","애니메이션",8,"타치카와 유즈루","110분");
		m[8]=new Movie("몬스터 패밀리2","애니메이션",9,"호거 태프","103분");
		m[9]=new Movie("보호자","액션",10,"정우성","97분");
	
		
		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
		}
	}

}
