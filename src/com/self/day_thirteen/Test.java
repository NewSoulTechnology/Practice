package com.self.day_thirteen;

import java.sql.Connection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBHelper dbHelper = new DBHelper();
		Connection connection = dbHelper.getConnection();
		// boolean statue=UseDBHelper.insert("g", "id,name,num", "8,'商品5',20",
		// connection);
		// if(statue==false){
		// System.out.println("数据插入失败！");
		// }else {
		// System.out.println("数据插入成功！");
		// }
		// boolean statue=UseDBHelper.delete("g", "", connection);
		// if(statue==false){
		// System.out.println("数据删除失败！");
		// }else {
		// System.out.println("数据删除成功！");
		// }
		// boolean statue = UseDBHelper.select("name,num", "g", "name like
		// '商品%'", connection);
		// if (statue == false) {
		// System.out.println("数据查询失败！");
		// } else {
		// System.out.println("数据查询成功！");
		// }
//		boolean statue = UseDBHelper.mutilInsert(connection);
//		if (statue == false) {
//			System.out.println("数据插入失败！");
//		} else {
//			System.out.println("数据插入成功！");
//		}
//		boolean statue = UseDBHelper.mutilSelect(6,connection);
//		if (statue == false) {
//			System.out.println("数据查询失败！");
//		} else {
//			System.out.println("数据查询成功！");
//		}
		// System.out.println(UseDBHelper.simpUpdate(connection));
		System.out.println(UseDBHelper.simpSelect(connection));
	}
}
