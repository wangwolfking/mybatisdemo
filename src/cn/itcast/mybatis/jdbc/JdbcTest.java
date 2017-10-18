package cn.itcast.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @ClassName: JdbcTest
 * @Description: 通过jdbc程序来总结jdbc存在的问题
 * @company 通铭教育
 * @author wolfking
 * @date 2016年6月16日 下午3:50:19
 */
public class JdbcTest {

	public static void main(String[] args) {
		//数据库连接
		Connection conn = null;
		//预编译的statement 可以提高数据库性能
		PreparedStatement ps = null;
		//结果集对象
		ResultSet rs = null;
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动管理类获取数据库链接
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "manager1");
			//定义sql语句，？表示占位符
			String sqlString="select * from user where username=?";
			//获取预处理statement
			ps=conn.prepareStatement(sqlString);
			//设置参数，第一个参数为sql语句中的参数序号（从1开始）第二个为设置的参数值
			ps.setString(1, "wangwu");
			//向数据库发出sql查询出结果集
			rs=ps.executeQuery();
			//遍历查询结果
			while (rs.next()) {
				System.out.println(rs.getString("id")+"*******"+rs.getString("username")+"*******"+rs.getDate("birthday"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(ps!=null){
				try {
					ps.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

}
