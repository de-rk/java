package com.soft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
/**
 * 分开的数据库连接
*/
public class Linked {

	public static void main(String[] args) {
		// 创建sql语句
		String sql="select * from emp";
		// 查询条件另外写一个String字符串
		String sql1=" where sal>? and deptno=?";
		Object[] oj= {1400,30};
		
		// 创建Db类的实例，连接数据库
		// 将查询到的对象集合用ResultSet集合保存
		Db db = new Db();
		// 更改查询条件
//		ResultSet re=db.executeQ(sql);
		ResultSet re=db.executeQ(sql+sql1, oj);
		
		// 遍历集合中的数据，用getString或者setInt读取
		try {
			while (re.next()) {
				for (int i=1;i<9;i++)
					System.out.println(re.getString(i));
			}
			
		// 处理异常表示出来不萌比
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 结束连接
		db.close();
	}
}
