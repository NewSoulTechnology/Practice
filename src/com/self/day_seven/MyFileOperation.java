package com.self.day_seven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class MyFileOperation {
	/**
	 * 从文件读取数据
	 * @param pathname
	 */
	public static void InputFile(String pathname) {
		try {
			File file = new File(pathname);
			Reader reader = new InputStreamReader(new FileInputStream(file),"gbk");
			BufferedReader bufferedReader=new BufferedReader(reader);
//			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
			StringBuffer stringBuffer = new StringBuffer();
			String string;
			while ((string=bufferedReader.readLine()) != null) {
				stringBuffer.append(string+"\n");
			}
			System.out.println(stringBuffer);
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	/**
	 * 写入数据到文件
	 * @param pathname
	 * @param content
	 */
	public static void OutputFile(String pathname,String content){
		try {
			File file=new File(pathname);
			Writer writer=new OutputStreamWriter(new FileOutputStream(file,true), "gbk");
			BufferedWriter bufferedWriter=new BufferedWriter(writer);
			bufferedWriter.newLine();
			bufferedWriter.write(content);
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 根据给定的目录查找文件
	 * @param pathname
	 */
	public static void findFile(String pathname) {
		File file = new File(pathname);
		find(file);
	}

	public static void find(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				print(files);
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						find(files[i]);
					}
				}
			}
		} else {
			System.out.println("当前目录下为空！");
		}
	}
	
	public static void print(File[] files) {
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
