package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.po.Orders;
import cn.itcast.mybatis.po.OrdersCustom;

public interface OrdersMapperCustom {
	// 查询订单关联查询用户
	public List<OrdersCustom> findOrderUser() throws Exception;

	// 查询订单关联查询用户使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;

	// 查询订单（关联查询用户）及订单明细
	public List<Orders> findOrdersAndDetailResultMap1() throws Exception;
}
