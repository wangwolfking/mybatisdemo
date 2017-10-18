package cn.itcast.mybatis.first;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itcast.mybatis.po.User;

/**
 * 
 * @ClassName: MybatisFirst
 * @Description: 入门程序
 * @company 通铭教育
 * @author wolfking
 * @date 2016年6月20日 上午9:30:06
 */
public class MybatisFirst {
	// 根据id查询用信息，得到记录结果
	@Test
	public void findUserById() {
		SqlSession sqlSession=null;
		try {
			//mybatis配置文件
			String resource = "SqlMapConfig.xml";
			//得到配置文件流
			InputStream inputStream=Resources.getResourceAsStream(resource);
			// 创建会话工厂
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂创建sqlsession			
			 sqlSession=sqlSessionFactory.openSession();
			// 通过sqlsession操作数据库
			//第一个参数：映射文件中的statement的id，等于=namespace+“.”+statemen的id
			//第二个参数：指定和映射文件中匹配的parameterType类型的参数
			User user= sqlSession.selectOne("test.findUserById", 1); 
			System.out.println(user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				try {
					sqlSession.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}
	//根据用户名模糊查询用户信息
	@Test
	public void findUserByName() {
		SqlSession sqlSession=null;
		try {
			//mybatis配置文件
			String resource = "SqlMapConfig.xml";
			//得到配置文件流
			InputStream inputStream=Resources.getResourceAsStream(resource);
			// 创建会话工厂
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂创建sqlsession			
			sqlSession=sqlSessionFactory.openSession();			
			// 通过sqlsession操作数据库
			//第一个参数：映射文件中的statement的id，等于=namespace+“.”+statemen的id
			//第二个参数：指定和映射文件中匹配的parameterType类型的参数
			List<User> userList= sqlSession.selectList("test.findUserByName", "wang"); 
			System.out.println(userList.size()+"就是好");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				try {
					sqlSession.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}
	//添加用户信息
	@Test
	public void insertUser() {
		SqlSession sqlSession=null;
		try {
			//mybatis配置文件
			String resource = "SqlMapConfig.xml";
			//得到配置文件流
			InputStream inputStream=Resources.getResourceAsStream(resource);
			// 创建会话工厂
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			// 通过工厂创建sqlsession			
			sqlSession=sqlSessionFactory.openSession();			
			// 通过sqlsession操作数据库
			User user= new User();
			user.setUsername("王志刚");
			user.setBirthday(new Date());
			user.setSex("1");
			user.setAddress("内蒙古通辽");
			//第一个参数：映射文件中的statement的id，等于=namespace+“.”+statemen的id
			//第二个参数：指定和映射文件中匹配的parameterType类型的参数
			sqlSession.insert("test.insertUser", user); 
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				try {
					sqlSession.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}		
	}
	public static void main(String[] args) {		
		MybatisFirst mybatisFirst=new MybatisFirst();
		mybatisFirst.findUserById();
		mybatisFirst.findUserByName();
		}
}
