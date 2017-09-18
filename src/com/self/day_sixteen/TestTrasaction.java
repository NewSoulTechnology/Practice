package com.self.day_sixteen;

import java.sql.Connection;
import java.sql.SQLException;

import com.self.day_thirteen.DBHelper;

public class TestTrasaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = DBHelper.getConnection();
		try {
			//设置自动提交事务为false
			connection.setAutoCommit(false);
			//id为1的用户向id为2的用户转200.50块钱
			BankService.deposit(1, 200.50, connection);
			//id为2的用户接收id为1的用户转的200.50块钱
			BankService.withdraw(2, 200.50, connection);
			//手动提交事务
			connection.commit();
			//设置自动提交事务为true
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
