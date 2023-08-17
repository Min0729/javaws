package day21.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Clientjar {

	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Clientjar() {
		// 서버의 ip, port
		try {
		//	s=new Socket("localhost", 6100);
		//	s=new Socket("192.168.0.23", 6100);
			s=new Socket("192.168.0.80", 6100);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			// 보내기
			dataSend();
			
			// 받기
			dataRecv();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 읽기
	private void dataRecv() {
		
		// 쓰레드만들기, 쓰레드 시작
		/*
		while(true) {
		String message;
		try {
			message = dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}*/
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				
			}});
		t.start();
	}

	// 쓰기
	private void dataSend() {
		
		Scanner sc = new Scanner(System.in);
		
		// 쓰레드
		/*
		while(true) {
		try {
			System.out.println("메세지:");
			String message=sc.nextLine();
			dos.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}*/
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						System.out.println("메세지:");
						String message=sc.nextLine();
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				
			}});
		t.start();
		
	}

	public static void main(String[] args) {
		
		Clientjar c=new Clientjar();
		
	}

}
