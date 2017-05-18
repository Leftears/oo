package com.duang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.duang.pojo.Managerinfo;
import com.duang.pojo.Userinfo;
import com.duang.util.DatabaseUtil;

public class UsermanagerOP {
	public void add(String account){
		Userinfo userinfo=new Userinfo();
		
		userinfo.setUser_account(account);
		userinfo.setUser_pwd(account);
		String sql="insert into d_users(user_account,user_mail,user_pwd) value(?,\"xxxxxxx@123.com\",?);";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_users;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		try {
			conn = DatabaseUtil.getConnection();
			
			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				String u_account=rs.getString("user_account");
				if(u_account.equals(account)){
					System.out.println("插入账号名已存在！");
					flag=1;
				}
			}
			if(flag==0){
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			
			pstm.setString(1,userinfo.getUser_account());
			pstm.setString(2, userinfo.getUser_pwd());
			
			pstm.executeUpdate();}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}
	
	public void delete(String account){
		String sql="delete from d_users where user_account=?;";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_users;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		
		try {
			conn = DatabaseUtil.getConnection();
			
			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				String u_account=rs.getString("user_account");
				if(u_account.equals(account)){
					flag=1;
				}
			}
			if(flag==1){
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			pstm.setString(1,account);
			pstm.executeUpdate();}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}
	
		public List<Userinfo> selectAll() {
			// TODO Auto-generated method stub
			List<Userinfo>list = new ArrayList<Userinfo>();
			String sql = "select * from d_users;";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				System.out.println("having run here");
				while (rs.next()) {
					String account = rs.getString("user_account");
					String name = rs.getString("user_name");
					String gender = rs.getString("user_gender");
					String mail = rs.getString("user_mail");
					java.sql.Date birth = rs.getDate("user_birth");
					
					//封装数据
				    Userinfo userinfo = new Userinfo();
				   
					userinfo.setUser_account(account);
					userinfo.setUser_name(name);
					userinfo.setUser_mail(mail);
					userinfo.setUser_gender(gender);
					userinfo.setUser_birth(birth);
					
					list.add(userinfo);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DatabaseUtil.close(rs, pstm, conn);
			}
			return list;
		}
		public List<Userinfo> select(String u_account) {
			// TODO Auto-generated method stub
			List<Userinfo>list = new ArrayList<Userinfo>();
			String sql = "select * from d_users where user_account like ";
			sql += "'%"+u_account+"%'";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
				pstm = conn.prepareStatement(sql);
				//pstm.setString(1,u_account);

				rs = pstm.executeQuery();
				
				while (rs.next()) {
					String account = rs.getString("user_account");
					String name = rs.getString("user_name");
					String gender = rs.getString("user_gender");
					String mail = rs.getString("user_mail");
					java.sql.Date birth = rs.getDate("user_birth");
					
					//封装数据
				    Userinfo userinfo = new Userinfo();
				   
					userinfo.setUser_account(account);
					userinfo.setUser_name(name);
					userinfo.setUser_mail(mail);
					userinfo.setUser_gender(gender);
					userinfo.setUser_birth(birth);
					
					list.add(userinfo);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DatabaseUtil.close(rs, pstm, conn);
			}
			return list;
		}
	
	public static void main(String [] args) {
		//获取数据库连接
		Connection conn = DatabaseUtil.getConnection();
		//System.out.println(conn);
		//清理资源
		List<Userinfo>list = new ArrayList<Userinfo>();
		UsermanagerOP usermanager=new UsermanagerOP();
		list=usermanager.select("ad");
		for(int i=0;i<list.size();i++){
			Userinfo temp=list.get(i);
			System.out.println(temp.getUser_account());
		}
		DatabaseUtil.close(null, null, conn);
	}
	
}
