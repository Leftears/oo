package com.icss.service;

import java.util.List;

import com.icss.dao.D_stockDao;
import com.icss.pojo.D_stock;

public class D_stockService {
	D_stockDao stockDao = new D_stockDao();
	//��ӈDƬ��Ϣ�r�{��
	public boolean insertstock(D_stock stockinfo) {
	   return stockDao.insertstock(stockinfo);
	}
	//��ӎ��
	public boolean updatestock(D_stock stockinfo){
		return stockDao.updatestock(stockinfo);
	}
	
	//����ѯ
	public List<D_stock> stockselect(String str) {
		return stockDao.stockselect(str);
	}

}
