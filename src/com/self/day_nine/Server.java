package com.self.day_nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
       public static void main(String[] args) {
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			BufferedWriter bufferedWriter=null;
			BufferedReader bufferedReader=null;
			BufferedReader keybuffer=null;
			Socket socket=serverSocket.accept();
			if(socket!=null){
				//输出流
				bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	            //输入流
				bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				keybuffer=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("client:"+bufferedReader.readLine());
				bufferedWriter.write("连接建立成功！\n");
				bufferedWriter.flush();
				String string=bufferedReader.readLine();
				System.out.println("client:"+string);
				while(!string.equals("bye")){	
					string=keybuffer.readLine();
					bufferedWriter.write(string+"\n");
					bufferedWriter.flush();
					string=bufferedReader.readLine();
					System.out.println("client:"+string);
				}
			}
			keybuffer.close();
			bufferedWriter.close();
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
