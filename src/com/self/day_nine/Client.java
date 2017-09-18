package com.self.day_nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	/**
	 * 在使用readline()读取输入数据时，因为他是读取的一行，包括了\n,所以我们可以在数据传送时
	 * 人为加入\n，达到使用enter键后结束输入的目的
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			// 输出流
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 输入流
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader keybuffer = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter.write("请求建立连接。。。\n");
			bufferedWriter.flush();
			System.out.println("server:"+bufferedReader.readLine());
			String string=keybuffer.readLine();
			bufferedWriter.write(string+"\n");
			bufferedWriter.flush();
			while (!string.equals("bye")) {
				string=bufferedReader.readLine();
				System.out.println("Server:" + string);
				string=keybuffer.readLine();
				bufferedWriter.write(string+"\n");
				bufferedWriter.flush();
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
