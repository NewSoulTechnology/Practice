package com.self.day_thirteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoAffair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBHelper dbHelper=new DBHelper();
		Connection connection=dbHelper.getConnection();
		try {
			DoAffair(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
     public static void DoAffair(Connection connection) throws SQLException{
    	 try {
    		 //关闭事务自动提交
			connection.setAutoCommit(false);
			//执行操作
			String sql="update o set much=5 where oid=1";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			String sql2="update g set num=95 where id=30";
			preparedStatement=connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			//手动提交事务
			connection.commit();
			//开启事务自动提交
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//事务异常，操作回滚
			connection.rollback();
			e.printStackTrace();
		}
     }
}
