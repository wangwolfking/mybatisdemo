package cn.itcast.mybatis.po;

public class UserQueryVo {
	// 用户的查询条件
	private UserCustom userCustom;

	// 可以包装其他的查询条件，比如订单、商品等
	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
}
