package com.self.day_thirteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	    //数据库连接地址
        private static final String url="jdbc:mysql://localhost:3306/new?useUnicode=true&characterEncoding=utf8";
        //数据库用户名
        private static final String user="root";
        //数据库密码
        private static final String password="123";
        //数据库驱动来源
        private static final String source="com.mysql.jdbc.Driver";
        //数据库连接
        private static Connection connection=null;
        //静态模块加载驱动
        static{
        	try {
				Class.forName(source);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        /**
         * 获取数据库连接
         * @return 数据库连接。
         *         如果为空，返回结果为null，否则返回Connection
         */
        public static Connection getConnection(){
        	try {
        		if (connection==null) {
        			connection=DriverManager.getConnection(url, user, password);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return connection;
        }
        /**
         * 关闭数据库Connection连接
         */
        public static void closeConnection(){
        	try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
}
