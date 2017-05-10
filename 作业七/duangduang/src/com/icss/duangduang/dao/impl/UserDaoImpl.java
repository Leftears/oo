package com.icss.duangduang.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.common.dao.AbstractDao;
import com.icss.duangduang.dao.UserDao;
import com.icss.duangduang.domain.User;

public class UserDaoImpl extends AbstractDao implements UserDao{

	public void addUser(User user) {
		this.execute("insert into d_users(user_account,user_pwd,user_mail) values(?,?,?)",new Object[]{
				user.getAccount(),
			    user.getPassword(),
				user.getMail()
				
				
		});
		
	}

	public void deleteUser(User user) {
		this.execute("delete from d_users where user_id=?", new Object[]{user.getId()});
		
	}

	

   
	public User load(Integer id) {
		return (User) this.load("select * from d_users where user_id=?", id);
	}

	
	public List<User> findAll() {
		
		return this.list("select * from d_users");
	}

	
	public Object rowMap(ResultSet rs) {
		User user=null;
		try {
			user=new User();
			user.setId(rs.getInt("user_id"));
			user.setAccount(rs.getString("user_account"));
			user.setMail(rs.getString("user_mail"));
			user.setPassword(rs.getString("user_pwd"));
			user.setName(rs.getString("user_name"));
			user.setGender(rs.getString("user_gender"));
			user.setBirthday(rs.getDate("user_birth"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> find(String sql, Object[] params,
			LinkedHashMap<String, String> orderByMap) {
		return this.list(sql, params, orderByMap);
	}

	@Override
	public void updateUser(User user, String password) {
		this.execute("update d_users set user_pwd=? where user_id=?", new Object[]{
				password,
				user.getId()
				
		});
		
	}

	@Override
	public void updateUserinfo(User user, String name, String gender,Date birthday,String mail) {
		this.execute("update d_users set user_name=?,user_gender=?,user_birth=?,user_mail=? where user_id=?", new Object[]{
				name,
				gender,
				birthday,
				mail,
				user.getId()
				
		});
	}

}
