package com.icss.service;

import java.util.List;

import com.icss.dao.D_orderDao;
import com.icss.pojo.D_order;

public class D_orderService {
	D_orderDao orderDao = new D_orderDao();
	//��ѯ���ж���
	public List<D_order> searchAll(){
		return orderDao.searchAll();
	}
	
	//��ѯ���ֶ���
	public List<D_order> searchPart(String str){
		return orderDao.searchPart(str);
	}
	//ɾ������
	public boolean delOrder(D_order orderinfo){
		return orderDao.delOrder(orderinfo);
	}
}
