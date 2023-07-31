package day10.실습;

public class Movie {

	String name1;
	String genre1;
	int runnigTime1;
	String director1;
	
	String name2;
	String genre2;
	int runnigTime2;
	String director2;
	
	String name3;
	String genre3;
	int runnigTime3;
	String director3;
	
	
	public void input1(String name, String genre, int runnigTime,String director ) {
		this.name1=name;
		this.genre1=genre;
		this.runnigTime1=runnigTime;
		this.director1=director;
	}
	
	public void input2(String name, String genre, int runnigTime,String director ) {
		this.name2=name;
		this.genre2=genre;
		this.runnigTime2=runnigTime;
		this.director2=director;
	}
	
	public void input3(String name, String genre, int runnigTime,String director ) {
		this.name3=name;
		this.genre3=genre;
		this.runnigTime3=runnigTime;
		this.director3=director;
	}
	
	public void printInfo() {
		System.out.println(name1);
		System.out.println(genre1);
		System.out.println(runnigTime1);
		System.out.println(director1);
		
	}
	
	public void printInfo2() {
		System.out.println(name2);
		System.out.println(genre2);
		System.out.println(runnigTime2);
		System.out.println(director2);
		
	}
	
	public void printInfo3() {
		System.out.println(name3);
		System.out.println(genre3);
		System.out.println(runnigTime3);
		System.out.println(director3);
		
	}
}
