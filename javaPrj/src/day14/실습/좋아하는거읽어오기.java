package day14.실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 좋아하는거읽어오기 {

	public static void main(String[] args) {
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/favorite.txt"));
			
			while(true) {
				String favorite =bf.readLine();
				if(favorite==null) {
					break;
				}
				System.out.println(favorite);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
