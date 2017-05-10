package com.icss.service;

import com.icss.dao.D_usersDao;
import com.icss.pojo.D_users;

public class D_usersService {
	
	D_usersDao userdao = new D_usersDao();
	
	public boolean addUser(D_users userinfo){
		return userdao.addUsers(userinfo);
	}

}
