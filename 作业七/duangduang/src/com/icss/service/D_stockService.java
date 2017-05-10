package com.icss.service;

import java.util.List;

import com.icss.dao.D_stockDao;
import com.icss.pojo.D_stock;

public class D_stockService {
	D_stockDao stockDao = new D_stockDao();
	//添加圖片信息時調用
	public boolean insertstock(D_stock stockinfo) {
	   return stockDao.insertstock(stockinfo);
	}
	//添加庫存
	public boolean updatestock(D_stock stockinfo){
		return stockDao.updatestock(stockinfo);
	}
	
	//库存查询
	public List<D_stock> stockselect(String str) {
		return stockDao.stockselect(str);
	}

}
