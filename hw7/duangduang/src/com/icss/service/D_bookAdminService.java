package com.icss.service;

import java.util.List;

import com.icss.dao.D_bookAdminDao;
import com.icss.pojo.D_bookAdmin;

public class D_bookAdminService {
	D_bookAdminDao bookado=new D_bookAdminDao();
	//添加管理员
	public boolean addbookAdmin(D_bookAdmin bookadmininfo){
	    return bookado.addbookAdmin(bookadmininfo);
	}
	//查询
	public List<D_bookAdmin> searchbookAdmin(D_bookAdmin bookadmininfo) {
		return bookado.searchbookAdmin(bookadmininfo);
	}
	//登录查询
	public boolean loginSearch(D_bookAdmin bookadmininfo) {
		return bookado.loginSearch(bookadmininfo);
	}
	//密码修改
	public boolean pwdchange(D_bookAdmin bookAdmininfo) {
		return bookado.pwdchange(bookAdmininfo);
	}


}
