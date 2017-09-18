package com.self.day_thirteen;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class DoProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection connection=DBHelper.getConnection();
        try {
        	//调用带in类型或者不带任何参数的的存储过程
        	String prodedure="{call find_id()}";
			CallableStatement callableStatement=connection.prepareCall(prodedure);
			System.out.println(callableStatement.execute());
        	//调用带out参数类型的存储过程
        	//注意：在对应的存储过程中，需要给输出的参数赋值
			String pString="call find_goods(?,?)";
			CallableStatement callableStatement3=connection.prepareCall(pString);
			callableStatement3.setInt(1, 30);
			callableStatement3.registerOutParameter(2, Types.INTEGER);
			callableStatement3.execute();
			int count=callableStatement3.getInt(2);
			System.out.println(count);
			//调用带inout参数类型的存储过程
			String pString2="{call find_good(?)}";
			CallableStatement callableStatement2=connection.prepareCall(pString2);
			callableStatement2.setInt(1, 30);
			callableStatement2.registerOutParameter(1, Types.INTEGER);
			callableStatement2.execute();
			System.out.println(callableStatement2.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
