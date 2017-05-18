package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icss.pojo.D_book;
import com.icss.pojo.D_order;
import com.icss.util.DataBase;

public class D_orderDao {
      //查询所有的订单
	public List<D_order> searchAll(){
		List<D_order>list = new ArrayList<D_order>();
		String sql = "select * from d_order";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			
			conn = DataBase.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				String user_account = rs.getString("user_account");
				String order_num = rs.getString("order_num");
				Double totalprice = rs.getDouble("totalprice");
				Date order_date = rs.getDate("order_date");
				String order_status = rs.getString("order_status");
				String order_name = rs.getString("order_name");
				String order_addr = rs.getString("order_addr");
				Integer book_num = rs.getInt("book_num");
				String book_src = rs.getString("book_src");
				String book_name = rs.getString("book_name");
				
				//封装数据
				D_order  orderinfo = new D_order();
			
				orderinfo.setUser_account(user_account);
				orderinfo.setOrder_num(order_num);
				orderinfo.setTotalprice(totalprice);
				orderinfo.setOrder_date(order_date);
				orderinfo.setOrder_status(order_status);
				orderinfo.setOrder_name(order_name);
				orderinfo.setOrder_addr(order_addr);
				orderinfo.setBook_num(book_num);
				orderinfo.setBook_src(book_src);
				orderinfo.setBook_name(book_name);
				
				//managerinfo.setBookAdmin_pwd(account);
				
				list.add(orderinfo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DataBase.close(rs, pstm, conn);
		}
		return list;
	}
	
	//查詢部分訂單
	public List<D_order> searchPart(String str){
		List<D_order>list = new ArrayList<D_order>();
		String sql = "select * from d_order where order_num like";
		sql += "'%"+str+"%'";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			
			conn = DataBase.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				String user_account = rs.getString("user_account");
				String order_num = rs.getString("order_num");
				Double totalprice = rs.getDouble("totalprice");
				Date order_date = rs.getDate("order_date");
				String order_status = rs.getString("order_status");
				String order_name = rs.getString("order_name");
				String order_addr = rs.getString("order_addr");
				Integer book_num = rs.getInt("book_num");
				String book_src = rs.getString("book_src");
				String book_name = rs.getString("book_name");
				
				//封装数据
				D_order  orderinfo = new D_order();
			
				orderinfo.setUser_account(user_account);
				orderinfo.setOrder_num(order_num);
				orderinfo.setTotalprice(totalprice);
				orderinfo.setOrder_date(order_date);
				orderinfo.setOrder_status(order_status);
				orderinfo.setOrder_name(order_name);
				orderinfo.setOrder_addr(order_addr);
				orderinfo.setBook_num(book_num);
				orderinfo.setBook_src(book_src);
				orderinfo.setBook_name(book_name);
				
				//managerinfo.setBookAdmin_pwd(account);
				
				list.add(orderinfo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DataBase.close(rs, pstm, conn);
		}
		return list;
	}
	
	//删除订单
	public boolean delOrder(D_order orderinfo){
		boolean flag=true;
		String sql="delete from d_order where order_num=?";
		String sql2="select * from d_order where order_num=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		PreparedStatement preparedStatement2=null;
		ResultSet rs=null;
		ResultSet rs2=null;
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement2=connection.prepareStatement(sql2);
			preparedStatement2.setString(1, orderinfo.getOrder_num());
			rs2=preparedStatement2.executeQuery();
			if(rs2.next()){
				preparedStatement.setString(1,orderinfo.getOrder_num());

				rs=preparedStatement.executeQuery();
				if(rs.next()) {
					flag=true;
				}
				else{
					flag=false;
				}
			}
			else{
				flag=false;
			}
			
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}
		return flag;
		
	}
}
