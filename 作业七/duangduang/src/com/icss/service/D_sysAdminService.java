package com.icss.service;

import com.icss.dao.D_sysAdminDao;
import com.icss.pojo.D_sysAdmin;

public class D_sysAdminService {
	D_sysAdminDao sysAdminDao = new D_sysAdminDao();
	public boolean searchsysAdmin(D_sysAdmin sysAdmininfo) {
		return sysAdminDao.searchsysAdmin(sysAdmininfo);
	}
}
