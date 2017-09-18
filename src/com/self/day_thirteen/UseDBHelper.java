package com.self.day_thirteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseDBHelper {
//    static int totalNumberOfValuesLeftToBatch=75;
    public static List<Integer>  getBatchSize( int totalNumberOfValuesLeftToBatch){
        List<Integer> batches= new ArrayList<Integer>();
    	//参数集合的几个自定义划分
        final int LARGE_BATCH = totalNumberOfValuesLeftToBatch/2;
        final int MEDIUM_BATCH = totalNumberOfValuesLeftToBatch/3;
        final int SMALL_BATCH = totalNumberOfValuesLeftToBatch/4;
    	final int SINGLE_BATCH = 1; //注意：为了把参数集合完整划分，这个值为1的批量数是必须的

         while ( totalNumberOfValuesLeftToBatch > 0 ) {
             int batchSize = SINGLE_BATCH;
             if ( totalNumberOfValuesLeftToBatch >= LARGE_BATCH ) {
              batchSize = LARGE_BATCH;
            } else if ( totalNumberOfValuesLeftToBatch >= MEDIUM_BATCH ) {
              batchSize = MEDIUM_BATCH;
            } else if ( totalNumberOfValuesLeftToBatch >= SMALL_BATCH ) {
              batchSize = SMALL_BATCH;
            }
            batches.add(batchSize);
            totalNumberOfValuesLeftToBatch -= batchSize;
//            System. out.println(batchSize);
        }
         return batches;
   }
    public static boolean mutilSelect(int selectnum ,Connection connection){
		StringBuffer sql=new StringBuffer("select gid from o where oid in (");
		int curLength=sql.length();
    	List<Integer> list=getBatchSize(selectnum);
    	Iterator<Integer> iterator=list.iterator();
    	while(iterator.hasNext()){
    		int temp=iterator.next();
    		for(int i=0;i<temp;i++){
    			 sql.append('?');
    		     if(i!=temp-1){
    		    	 sql.append(',');
    		     }
    		}
    		sql.append(")");
    		try {
    			PreparedStatement preparedStatement=connection.prepareStatement(sql.toString());
    			sql.delete(curLength, sql.length());
    			//赋值
    			for(int i=0;i<temp;i++){
    				//自定义赋值
    				preparedStatement.setInt((i+1), (i+1));
    			}
    			//执行查询，并返回结果集
    			ResultSet resultSet=preparedStatement.executeQuery();
                int  statue=0;
    			//解析结果集
    			while(resultSet.next()){
    				statue++;
    				System.out.println(resultSet.getString("gid"));
    			}
    			if(statue==0)
    			{
    				return true;
    			}			
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}	
		return true;
	}
	/**
	 * 根据表名，在对应列插入对应数据
	 * 
	 * @param tablename
	 *            表名
	 * @param dataline
	 *            数据插入目标列
	 * @param insertdata
	 *            插入数据
	 * @param connection
	 *            数据库连接
	 * @return
	 */
	public static boolean insert(String tablename, String dataline, String insertdata, Connection connection) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into ");
		sql.append(tablename);
		sql.append("(");
		sql.append(dataline);
		sql.append(") ");
		sql.append("values(");
		sql.append(insertdata);
		sql.append(")");
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
			System.out.println(preparedStatement.toString());
			int statue = preparedStatement.executeUpdate();
			if (statue != 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 根据表名，以及提供的条件来删除数据库中的数据
	 * 
	 * @param tablename
	 *            数据库对应的表名
	 * @param conditiondata
	 *            对应的删除条件
	 * @param connection
	 *            数据库连接
	 * @return 返回删除数据操作是否成功，boolean,成功为true，否则为false
	 */
	public static boolean delete(String tablename, String conditiondata, Connection connection) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from ");
		sql.append(tablename);
		if (conditiondata.trim().length() != 0) {
			sql.append(" where ");
			sql.append(conditiondata);
		}
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
			int statue = preparedStatement.executeUpdate();
			if (statue != 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static boolean update() {

		return false;
	}

	public static boolean select(String selectdata,String tablename,String selectcondition ,Connection connection) {
        StringBuffer sql=new StringBuffer();
        sql.append("select ");
        sql.append(selectdata);
        sql.append(" from ");
        sql.append(tablename);
        if(selectcondition.trim().length()!=0){
        	sql.append(" where ");
        	sql.append(selectcondition);
        }
        try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql.toString());
		    ResultSet resultSet=preparedStatement.executeQuery();
		    if(resultSet.next()!=false){
		    String[] strings=selectdata.split(",");
		    System.out.println(resultSet.getString(strings[0])+" "+resultSet.getString(strings[1]));
		    while(resultSet.next()){
		    	for(int i=0;i<strings.length;i++){
		    		System.out.print(resultSet.getString(strings[i])+" ");
		    	}
		    	System.out.println();
		    }
		    return true;
		    }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static boolean mutilInsert(Connection connection){
		String sql="insert into g(name,num) values(?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//首先把Auto commit设置为false,不让它自动提交
			connection.setAutoCommit(false);
			//设置sql语句
			preparedStatement.setString(1, "可口可乐");
			preparedStatement.setInt(2, 19);
			//将一组参数添加到此 PreparedStatement 对象的批处理命令中。    
			preparedStatement.addBatch();
			preparedStatement.setString(1, "乐事薯片");
			preparedStatement.setInt(2, 32);
			preparedStatement.addBatch();
			preparedStatement.setString(1, "香飘飘");
			preparedStatement.setInt(2, 123);
			preparedStatement.addBatch();
			preparedStatement.setString(1, "一口香");
			preparedStatement.setInt(2, 64);
			preparedStatement.addBatch();
			preparedStatement.setString(1, "妙脆角");
			preparedStatement.setInt(2, 90);
			preparedStatement.addBatch();
			//将一批参数提交给数据库来执行，如果全部命令执行成功，则返回更新计数组成的数组。
			int[] counts=preparedStatement.executeBatch();
			if(counts.length==5){
				//插入成功
				System.out.println(counts.length);
				//手动提交
				connection.commit();
				//恢复现场（开启自动提交事务）
				connection.setAutoCommit(true);
				return true;
			}else{
				//插入失败，事务回滚
				connection.rollback();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public static boolean simpUpdate(Connection connection){
		String sql="update g set num=? where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, 100);
			preparedStatement.setInt(2, 30);
			int statue=preparedStatement.executeUpdate();
			if(statue!=0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static boolean simpSelect(Connection connection){
		String sql="select id,name,num from g";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
//			System.out.println(preparedStatement.toString());
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getInt("num"));
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
