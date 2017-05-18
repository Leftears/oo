package com.duang.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.duang.pojo.*;
import com.duang.util.*;

public class BookmanagerOP {


	public void add(String account){
		Managerinfo managerinfo=new Managerinfo();
		managerinfo.setBookAdmin_account(account);
		managerinfo.setBookAdmin_pwd(account);
		String sql="insert into d_bookAdmin(bookAdmin_account,bookAdmin_pwd,role) value(?,?,1);";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_bookAdmin;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		try {
			conn = DatabaseUtil.getConnection();
			
			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				String b_account=rs.getString("bookAdmin_account");
				if(b_account.equals(account)){
					System.out.println("插入账号名已存在！");
					flag=1;
				}
			}
			if(flag==0){
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			pstm.setString(1,managerinfo.getBookAdmin_account());
			pstm.setString(2, managerinfo.getBookAdmin_pwd());
			pstm.executeUpdate();}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}
	
	public void delete(String account){
		String sql="delete from d_bookAdmin where bookAdmin_account=?;";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_bookAdmin;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		
		try {
			conn = DatabaseUtil.getConnection();

			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				String b_account=rs.getString("bookAdmin_account");
				if(b_account.equals(account)){
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
	
		public List<Managerinfo> selectAll() {
			// TODO Auto-generated method stub
			List<Managerinfo>list = new ArrayList<Managerinfo>();
			String sql = "select * from d_bookAdmin;";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while (rs.next()) {
					String account = rs.getString("bookAdmin_account");
					
					//封装数据
					Managerinfo managerinfo = new Managerinfo();
					
					managerinfo.setBookAdmin_account(account);
					//managerinfo.setBookAdmin_pwd(account);
					
					list.add(managerinfo);
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
		BookmanagerOP bookmanager=new BookmanagerOP();
		List<Managerinfo>list = new ArrayList<Managerinfo>();
		list=bookmanager.selectAll();
		for(int i=0;i<list.size();i++){
			Managerinfo temp=list.get(i);
			System.out.println(temp.getBookAdmin_account());
		}
		DatabaseUtil.close(null, null, conn);
	}

	
}
