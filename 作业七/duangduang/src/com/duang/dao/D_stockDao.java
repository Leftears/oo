package com.duang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.duang.pojo.D_stock;
import com.duang.pojo.Userinfo;
import com.duang.util.DatabaseUtil;

public class D_stockDao {
	public void add(D_stock d_stock){
	String sql="insert into d_stock(book_id,book_stock,book_sell,book_uploadtime) value(?,?,?,?);";
	Connection conn=null;
	PreparedStatement pstm = null;
	String sql2="select * from d_stock;" ;
	PreparedStatement pstm2 = null;
	ResultSet rs=null;
	int flag=0;
	try {
		conn = DatabaseUtil.getConnection();
		
		pstm2=conn.prepareStatement(sql2);
		rs=pstm2.executeQuery();
		while(rs.next()){
			String book=rs.getString("book_id");
			if(book.equals(d_stock.getBook_id())){
				System.out.println("插入书已存在！");
				flag=1;
			}
		}
		if(flag==0){
		pstm = conn.prepareStatement(sql);
		//设置参数，从传递的userinfo中获取
		
		pstm.setString(1,d_stock.getBook_id());
		pstm.setInt(2, d_stock.getBook_stock());
		pstm.setInt(3,d_stock.getBook_sell());
		pstm.setDate(4,(java.sql.Date)d_stock.getBook_uploadtime());
		
		pstm.executeUpdate();}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		DatabaseUtil.close(null, pstm, conn);
	}
}

public void delete(String book_id){
	String sql="delete from d_stock where book_id=?;";
	Connection conn=null;
	PreparedStatement pstm = null;
	String sql2="select * from d_stock;" ;
	PreparedStatement pstm2 = null;
	ResultSet rs=null;
	int flag=0;
	
	try {
		conn = DatabaseUtil.getConnection();
		
		pstm2=conn.prepareStatement(sql2);
		rs=pstm2.executeQuery();
		while(rs.next()){
			String booktest=rs.getString("book_id");
			if(book_id.equals(booktest)){
				flag=1;
			}
		}
		if(flag==1){
		pstm = conn.prepareStatement(sql);
		//设置参数，从传递的userinfo中获取
		pstm.setString(1,book_id);
		pstm.executeUpdate();}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		DatabaseUtil.close(null, pstm, conn);
	}
}

	public List<D_stock> selectAll() {
		// TODO Auto-generated method stub
		List<D_stock>list = new ArrayList<D_stock>();
		String sql = "select * from d_stock;";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			conn = DatabaseUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				String book_id = rs.getString("book_id");
				int book_stock = rs.getInt("book_stock");
				int book_sell = rs.getInt("book_sell");
				java.sql.Date book_uploadtime = rs.getDate("book_uploadtime");
				
				//封装数据
			    D_stock d_stock = new D_stock();
			   
				d_stock.setBook_id(book_id);
				d_stock.setBook_stock(book_stock);
				d_stock.setBook_sell(book_sell);
				d_stock.setBook_uploadtime(book_uploadtime);
				
				list.add(d_stock);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(rs, pstm, conn);
		}
		return list;
	}
	public void update(String book_id,int d_stock) {
		// TODO Auto-generated method stub
		List<D_stock>list = new ArrayList<D_stock>();
		String sql = "update d_stock set  book_stock = ? where book_id =?";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			conn = DatabaseUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,d_stock);
            pstm.setString(2, book_id);
            
            pstm.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(rs, pstm, conn);
		}
	}
		public static void main(String [] args) {
			//获取数据库连接
			Connection conn = DatabaseUtil.getConnection();
			System.out.println(conn);
			//清理资源
			D_stock stock =new D_stock();
			stock.setBook_id("1");
			stock.setBook_stock(123);
			stock.setBook_sell(23);
			//stock.setBook_uploadtime("0000-00-00");
			List<D_stock>list = new ArrayList<D_stock>();
			D_stockDao stockdao=new D_stockDao();
			stockdao.add(stock);
			list = stockdao.selectAll();
			for(int i=0;i<list.size();i++){
				D_stock temp=list.get(i);
				System.out.println(temp.getBook_id());
				System.out.println(temp.getBook_stock());
				System.out.println(temp.getBook_uploadtime());
			}
			stockdao.update("1", 434);
			list = stockdao.selectAll();
			for(int i=0;i<list.size();i++){
				D_stock temp=list.get(i);
				System.out.println(temp.getBook_id());
				System.out.println(temp.getBook_stock());
			}
			DatabaseUtil.close(null, null, conn);
		}
	}

