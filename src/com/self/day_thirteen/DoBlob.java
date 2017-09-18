package com.self.day_thirteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoBlob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DBHelper dbHelper=new DBHelper();
       Connection connection=dbHelper.getConnection();
       //存二进制文件
       String sql="insert into test values(?)";
       try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		File file=new File("C:\\Users\\54061\\Desktop\\timg.jpg");
		//使用setBinaryStream函数来读入数据
		preparedStatement.setBinaryStream(1, new FileInputStream(file));
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       //读二进制文件
       String string="select * from test";
       try {
		PreparedStatement preparedStatement2=connection.prepareStatement(string);
		ResultSet resultSet=preparedStatement2.executeQuery();
		while(resultSet.next()){
			//使用getBinaryStream获取数据
			InputStream inputStream=resultSet.getBinaryStream("image");
			File file2=new File("C:\\Users\\54061\\Desktop\\test.jpg");
			OutputStream outputStream=new FileOutputStream(file2);
			byte[] content=new byte[1024];
			//将数据写入到文件中
			while(inputStream.read(content)>0){
				outputStream.write(content);
			}
		}
	} catch (SQLException e) {
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
