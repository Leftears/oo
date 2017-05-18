package com.icss.duangduang.dao;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;


import com.icss.duangduang.domain.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user,String password);
	public void updateUserinfo(User user,String name,String gender,Date birthday,String mail);
	public User load(Integer id);
	public List<User> findAll();
	 public List<User> find(String sql, Object[] params, LinkedHashMap<String, String>
     orderByMap);


}
