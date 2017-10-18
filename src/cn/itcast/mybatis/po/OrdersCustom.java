package cn.itcast.mybatis.po;

//通过此类映射订单和用户查询的结果，此类继承包括字段较多的pojo类
public class OrdersCustom extends Orders {
	/*
	 * 添加用户信息属性 user.username 
	 * user.sex 
	 * user.address
	 */
	private String username;
	private String sex;
	private String adderss;

	// private String username;
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

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

}
