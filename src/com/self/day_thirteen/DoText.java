package com.self.day_thirteen;

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
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Connection connection=DBHelper.getConnection();
       //存文本数据
       String sql="insert into text values(?)";
       try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		File file=new File("C:\\Users\\54061\\Desktop\\Vue.txt");
		//使用setCharacterStream函数，将文件以字符流的形式输入到数据库
		preparedStatement.setCharacterStream(1, new InputStreamReader(new FileInputStream(file), "gbk"));
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       //读文本数据
       String string="select * from text";
       try {
		PreparedStatement preparedStatement2=connection.prepareStatement(string);
		//查找并返回数据
		ResultSet resultSet2=preparedStatement2.executeQuery();
		File file2=new File("C:\\Users\\54061\\Desktop\\Vue_copy.txt");
		Writer writer=new OutputStreamWriter(new FileOutputStream(file2), "utf-8");
		int length=0;
		while(resultSet2.next()){
			//读入数据
			Reader reader=resultSet2.getCharacterStream("text");
			char[] content=new char[1024];
			//将数据写到文件当中
			while((length=reader.read(content))>0){
				writer.write(new String(content,0,length));
				writer.flush();
			}
		}
		writer.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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

}
