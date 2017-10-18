package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.po.User;
import cn.itcast.mybatis.po.UserCustom;
import cn.itcast.mybatis.po.UserQueryVo;

/**
 * 
 * @ClassName: UserMapper
 * @Description: mapper接口，用户管理
 * @company 通铭教育
 * @author wolfking
 * @date 2016年6月28日 上午10:59:29
 */

public interface UserMapper {
	// 综合查询用户信息
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// 综合查询用户信息数量
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;

	// 根据name查询用户信息
	public List<User> findUserByName(String name) throws Exception;

	// 添加用户信息
	public void insertUser(User user) throws Exception;

	// 删除用户信息
	public void deleteUser(int id) throws Exception;

	// resultMap
	public User findUserByIdResultMap(int id) throws Exception;
}
