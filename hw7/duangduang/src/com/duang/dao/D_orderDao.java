package com.duang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.duang.pojo.D_order;
import com.duang.pojo.D_stock;
import com.duang.pojo.Userinfo;
import com.duang.util.DatabaseUtil;

public class D_orderDao {
	

	public void delete(int order_no){
		String sql="delete from d_order where order_no=?;";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_order;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		
		try {
			conn = DatabaseUtil.getConnection();
			
			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				int order=rs.getInt("order_no");
				if(order==order_no){
					flag=1;
				}
			}
			if(flag==1){
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			pstm.setInt(1,order_no);
			pstm.executeUpdate();}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}

		public List<D_order> selectAll() {
			// TODO Auto-generated method stub
			List<D_order>list = new ArrayList<D_order>();
			String sql = "select * from d_order;";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while (rs.next()) {
					int order_no = rs.getInt("order_no");
					String book_id = rs.getString("book_id");
					String user_account = rs.getString("user_account");
					int order_num = rs.getInt("order_num");
					int totalprice = rs.getInt("totalprice");
					Date order_date = rs.getDate("order_date");
					String order_status = rs.getString("order_status");
					String order_name = rs.getString("order_name");
					String order_addr = rs.getString("order_addr");
					String order_postcode = rs.getString("order_postcode");
					//封装数据
				    D_order d_order = new D_order();
				   
					d_order.setOrder_no(order_no);
					d_order.setBook_id(book_id);
					d_order.setUser_account(user_account);
					d_order.setOrder_num(order_num);
					d_order.setTotalprice(totalprice);
					d_order.setOrder_status(order_status);
					d_order.setOrder_date(order_date);
					d_order.setOrder_name(order_name);
					d_order.setOrder_addr(order_addr);
					d_order.setOrder_postcode(order_postcode);
					
					list.add(d_order);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DatabaseUtil.close(rs, pstm, conn);
			}
			return list;
		}
		public List<D_order> select(int sorder_no) {
			// TODO Auto-generated method stub
			List<D_order>list = new ArrayList<D_order>();
			String sql = "select * from d_order where order_no = ? ";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1,sorder_no);

				rs = pstm.executeQuery();
				
				while (rs.next()) {
					int order_no = rs.getInt("order_no");
					String book_id = rs.getString("book_id");
					String user_account = rs.getString("user_account");
					int order_num = rs.getInt("order_num");
					int totalprice = rs.getInt("totalprice");
					Date order_date = rs.getDate("order_date");
					String order_status = rs.getString("order_status");
					String order_name = rs.getString("order_name");
					String order_addr = rs.getString("order_addr");
					String order_postcode = rs.getString("order_postcode");
					//封装数据
					 D_order d_order = new D_order();
					   
						d_order.setOrder_no(order_no);
						d_order.setBook_id(book_id);
						d_order.setUser_account(user_account);
						d_order.setOrder_num(order_num);
						d_order.setTotalprice(totalprice);
						d_order.setOrder_status(order_status);
						d_order.setOrder_date(order_date);
						d_order.setOrder_name(order_name);
						d_order.setOrder_addr(order_addr);
						d_order.setOrder_postcode(order_postcode);
						
						list.add(d_order);
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
			System.out.println(conn);
			//清理资源
			D_order order =new D_order();
			//stock.setBook_uploadtime("0000-00-00");
			List<D_order>list = new ArrayList<D_order>();
			D_orderDao orderdao=new D_orderDao();
			list = orderdao.selectAll();
			for(int i=0;i<list.size();i++){
				D_order temp=list.get(i);
				System.out.println(temp.getOrder_no());
				System.out.println(temp.getTotalprice());
			}
			orderdao.delete(1);
			list = orderdao.selectAll();
			for(int i=0;i<list.size();i++){
				D_order temp=list.get(i);
				System.out.println(temp.getOrder_no());
				System.out.println(temp.getTotalprice());
			}
			
			DatabaseUtil.close(null, null, conn);
		}
}
