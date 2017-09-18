package com.self.day_thirteen;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	//元数据的两个类: DatabaseMetaDate  和    Result
            Connection connection=DBHelper.getConnection();
			DatabaseMetaData data=connection.getMetaData();
//			while(resultSet.next()){
//				System.out.println("----------------");
//		    	System.out.println(resultSet.getString(3));
//		    }
			System.out.println(data.getURL());
			System.out.println(data.getDatabaseMajorVersion()+"."+data.getDatabaseMinorVersion());
		    ResultSet resultSet2=data.getTables(null, null, null, new String[]{"TABLE"});
		    while(resultSet2.next()){
		    	System.out.println(resultSet2.getString(3));
		    }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
