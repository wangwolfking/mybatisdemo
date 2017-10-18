package cn.itcast.mybatis.dao;

import java.util.List;

import cn.itcast.mybatis.po.User;

/**
 * 
 * @ClassName: UserDao
 * @Description: dao接口，用户管理
 * @company 通铭教育
 * @author wolfking
 * @date 2016年6月28日 上午10:59:29
 */

public interface UserDao {
	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;
	// 根据name查询用户信息
	public List<User> findUserByName(String name) throws Exception;

	// 添加用户信息
	public void insertUser(User user) throws Exception;

	// 删除用户信息
	public void deleteUser(int id) throws Exception;
}
