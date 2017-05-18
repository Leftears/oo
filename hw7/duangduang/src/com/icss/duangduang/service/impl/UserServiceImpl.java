package com.icss.duangduang.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.icss.duangduang.dao.UserDao;
import com.icss.duangduang.dao.impl.UserDaoImpl;
import com.icss.duangduang.domain.User;
import com.icss.duangduang.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao=new UserDaoImpl();

	
	public User checkLogin(String account, String password) {
		User user=null;
		String sql="select * from d_users where user_account=? and user_pwd=?";
		Object[] params=new Object[]{account,password};
		List<User> userList=this.userDao.find(sql, params, null);
		if(CollectionUtils.isNotEmpty(userList)){
			user=userList.get(0);
		}
		
		return user;
	}


	
	

}
