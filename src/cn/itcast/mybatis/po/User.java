package cn.itcast.mybatis.po;

import java.util.Date;

/**
 * 
 * @ClassName: User
 * @Description: 用户po
 * @company 通铭教育
 * @author wolfking
 * @date 2016年6月17日 下午4:49:06
 */
public class User {
	private int id; //id
	private String username;//用户名	
	private String sex;//性别	
	private String address;//地址
	private Date birthday;//出生年月
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
