package com.icss.service;

import java.util.List;

import com.icss.dao.D_bookDao;
import com.icss.pojo.D_book;

public class D_bookService {
	D_bookDao bookDao=new D_bookDao();
	
	public boolean addbook(D_book bookinfo) { //���ͼ��
		return bookDao.addbook(bookinfo);
	}
	
	//ɾ��ͼ��
	public boolean delbook(D_book bookinfo){
		return bookDao.delbook(bookinfo);
	}
	
	//����Ų�ѯ
	public List<D_book> numsearch(String id) {
		return bookDao.numsearch(id);
	}
	
	//����Ų�ѯ
	public List<D_book>  selectByType(String type) {
		return bookDao.selectByType(type);
	}
	
	
}
