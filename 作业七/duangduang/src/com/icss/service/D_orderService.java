package com.icss.service;

import java.util.List;

import com.icss.dao.D_orderDao;
import com.icss.pojo.D_order;

public class D_orderService {
	D_orderDao orderDao = new D_orderDao();
	//查询所有订单
	public List<D_order> searchAll(){
		return orderDao.searchAll();
	}
	
	//查询部分订单
	public List<D_order> searchPart(String str){
		return orderDao.searchPart(str);
	}
	//删除订单
	public boolean delOrder(D_order orderinfo){
		return orderDao.delOrder(orderinfo);
	}
}
