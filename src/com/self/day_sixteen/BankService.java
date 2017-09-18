package com.self.day_sixteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankService {
	   //存钱
       public static void deposit(int id,double money,Connection connection) throws SQLException{
    	   String sql="update account set money=money+? where id=?";
    	   PreparedStatement preparedStatement=connection.prepareStatement(sql);
    	   preparedStatement.setDouble(1, money);
    	   preparedStatement.setInt(2, id);
    	   preparedStatement.executeUpdate();
       }
       //取钱
       public static void withdraw(int id,double money,Connection connection) throws Exception{
    	   //先判断剩余的金额能不能进行转账
    	   String sql1="select money from account where id=?";
    	   PreparedStatement preparedStatement=connection.prepareStatement(sql1);
    	   preparedStatement.setInt(1, id);
    	   ResultSet resultSet=preparedStatement.executeQuery();
    	   if (resultSet.next()) {
			if(resultSet.getDouble(1)>money){
				//进行转账操作
				String sql2="update account set money=money-? where id=?";
		    	   preparedStatement=connection.prepareStatement(sql2);
		    	   preparedStatement.setDouble(1, money);
		    	   preparedStatement.setInt(2, id);
		    	   preparedStatement.executeUpdate();
			}else{
				throw new Exception("当前余额为："+resultSet.getDouble(1)+"  余额不足，不能完成转账");
			}
		}
       }
}
