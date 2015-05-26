package com.test2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.common.User;

public class MyClient {

	public static void main(String[] args) {
		new MyClient();
	}
	
	public MyClient() {
		
		try {
			Socket s = new Socket("127.0.0.1", 2550);
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			User u = new User();
			u.setName("joker");
			u.setPass("maskjoker");
			oos.writeObject(u);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
