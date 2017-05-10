package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




import org.omg.CORBA.Request;

import com.icss.pojo.D_bookAdmin;
import com.icss.pojo.D_users;
import com.icss.util.DataBase;

public class D_bookAdminDao {
	//添加管理员
	public boolean addbookAdmin(D_bookAdmin bookadmininfo){
		boolean flag=true;
		String sql="insert into d_bookasdmin(bookAdmin_account,bookAdmin_pwd,role)values(?,?,?)";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, bookadmininfo.getBookAdmin_account());
            preparedStatement.setString(2, bookadmininfo.getBookAdmin_pwd());
            preparedStatement.setInt(3, bookadmininfo.getRole());
            int i = preparedStatement.executeUpdate();
            if(i>0){
            	flag=true;
            }
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}finally{
			DataBase.close(null, preparedStatement,connection);
		}
		return flag;
	}
	
	//查询图书管理员
	public List<D_bookAdmin> searchbookAdmin(D_bookAdmin bookadmininfo) {
		String sql="select * from d_bookadmin";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<D_bookAdmin> list=new ArrayList<D_bookAdmin>();
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			while (rs.next()) {
				Integer id = rs.getInt("bookAdmin_id");
				String account = rs.getString("bookAdmin_account");
				String pwd = rs.getString("bookAdmin_pwd");
				Integer role = rs.getInt("role");
				//封装对象
		//		D_bookAdmin bookadmininfo = new D_bookAdmin();
				bookadmininfo.setBookAdmin_id(id);
				bookadmininfo.setBookAdmin_account(account);
				bookadmininfo.setBookAdmin_pwd(pwd);
				bookadmininfo.setRole(role);
				
				list.add(bookadmininfo);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DataBase.close(rs, preparedStatement, connection);
		}
		
		return list;
	}
	//登录查询
	public boolean loginSearch(D_bookAdmin bookadmininfo) {
		boolean flag=true;
		String sql="select * from d_bookadmin where bookAdmin_account=? and bookAdmin_pwd=? and role=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, bookadmininfo.getBookAdmin_account());
			preparedStatement.setString(2, bookadmininfo.getBookAdmin_pwd());
			preparedStatement.setInt(3, bookadmininfo.getRole());
			
			rs=preparedStatement.executeQuery();
			if(rs.next()){
				flag=true;
			}
			else if(!rs.next()){
				flag=false;
			}
//			while (rs.next()) {
//				String account = rs.getString("bookAdmin_account");
//				String pwd = rs.getString("bookAdmin_pwd");
//				//封装对象
//		//		D_bookAdmin bookadmininfo = new D_bookAdmin();
//				bookadmininfo.setBookAdmin_account(account);
//				bookadmininfo.setBookAdmin_pwd(pwd);
//				
//			}
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}finally{
			DataBase.close(rs, preparedStatement, connection);
		}
		return flag;
		
	}
	
	// 密码修改
	public boolean pwdchange(D_bookAdmin bookAdmininfo) {
		boolean flag = true;

		String sql = "update d_bookAdmin set bookAdmin_pwd=? where bookAdmin_account=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			connection = DataBase.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bookAdmininfo.getBookAdmin_pwd());
			preparedStatement.setString(2, bookAdmininfo.getBookAdmin_account());
			int i = preparedStatement.executeUpdate();
			if(i>0){
				flag=true;
			}
			else{
				flag=false;
			}
			
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}finally{
			DataBase.close(null, preparedStatement, connection);
		}

		return flag;
	}
	

}
