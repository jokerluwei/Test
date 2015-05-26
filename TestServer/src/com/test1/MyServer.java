package com.test1;

import java.net.*;
import java.io.*;
import com.common.User;

public class MyServer {
	ServerSocket ss;
	Socket s;
	ObjectInputStream ois;
	public static void main(String[] args) {
		new MyServer();
	}

	public MyServer() {
		try {
			ss = new ServerSocket(2550);
			s = ss.accept();
			// 以对象流读取
			ois = new ObjectInputStream(s.getInputStream());
			User u = (User) ois.readObject();
			System.out.println(u.getName());
			System.out.println(u.getPass());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
