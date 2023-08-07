package day14.실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 친구이름읽어오기 {

	public static void main(String[] args) {
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/friendName"));
			
			while(true) {
				String data =  bf.readLine();
				if(data==null) {
					break;
				}
				String dataResult=data.substring(1);
				System.out.println(dataResult);
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
