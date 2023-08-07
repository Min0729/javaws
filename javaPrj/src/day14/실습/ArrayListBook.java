package day14.실습;

import java.util.ArrayList;

public class ArrayListBook {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<>();
		
		Book book = new Book("책1", "작가1");
		
		// 등록하기
		System.out.println("등록하기");
		list.add(book);
		list.add(new Book("책2", "작가2"));
		list.add(new Book("책3", "작가3"));
		
		// 조회하기
		System.out.println("전체 조회하기");
		for(int i=0; i<list.size();i++) {
			Book b = list.get(i);
			System.out.println(b);
		}
		
		// 작가2의 책정보 조회하기
		System.out.println("작가2의 책정보 조회하기");
		for(int i=0; i<list.size();i++) {
			Book b=list.get(i);
			String author = b.getAuthor();
			if(author.equals("작가2")) {
				System.out.println(b);
			}
		}
		
		// 삭제하기
		int index = 1;
		list.remove(index-1);
		
		System.out.println("전체 조회하기");
		
		
		
		
	}

}
