package com.icss.service;

import java.util.List;

import com.icss.dao.D_bookAdminDao;
import com.icss.pojo.D_bookAdmin;

public class D_bookAdminService {
	D_bookAdminDao bookado=new D_bookAdminDao();
	//��ӹ���Ա
	public boolean addbookAdmin(D_bookAdmin bookadmininfo){
	    return bookado.addbookAdmin(bookadmininfo);
	}
	//��ѯ
	public List<D_bookAdmin> searchbookAdmin(D_bookAdmin bookadmininfo) {
		return bookado.searchbookAdmin(bookadmininfo);
	}
	//��¼��ѯ
	public boolean loginSearch(D_bookAdmin bookadmininfo) {
		return bookado.loginSearch(bookadmininfo);
	}
	//�����޸�
	public boolean pwdchange(D_bookAdmin bookAdmininfo) {
		return bookado.pwdchange(bookAdmininfo);
	}


}
