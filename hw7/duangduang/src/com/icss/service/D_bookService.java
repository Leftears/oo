package com.icss.service;

import java.util.List;

import com.icss.dao.D_bookDao;
import com.icss.pojo.D_book;

public class D_bookService {
	D_bookDao bookDao=new D_bookDao();
	
	public boolean addbook(D_book bookinfo) { //添加图书
		return bookDao.addbook(bookinfo);
	}
	
	//删除图书
	public boolean delbook(D_book bookinfo){
		return bookDao.delbook(bookinfo);
	}
	
	//按编号查询
	public List<D_book> numsearch(String id) {
		return bookDao.numsearch(id);
	}
	
	//按编号查询
	public List<D_book>  selectByType(String type) {
		return bookDao.selectByType(type);
	}
	
	
}
