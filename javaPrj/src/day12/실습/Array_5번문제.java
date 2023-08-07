package day12.실습;

public class Array_5번문제 {

	String singer;
	String song;
	String genre;
	String composer;
	
	public Array_5번문제() {}
	
	public Array_5번문제(String singer,String song,String genre,String composer) {
		this.singer=singer;
		this.song=song;
		this.genre=genre;
		this.composer=composer;
	}
	
	public String toStirng() {
		return singer+song+genre+composer;
	}
	
}
