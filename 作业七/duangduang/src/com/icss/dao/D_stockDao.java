package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.duang.util.DatabaseUtil;
import com.icss.pojo.D_book;
import com.icss.pojo.D_stock;
import com.icss.servlet.passwordChange;
import com.icss.util.DataBase;

public class D_stockDao {
	
	// 插入库存量
	public boolean insertstock(D_stock stockinfo) {
		boolean flag = true;
		String sql = "insert into d_stock values(?,?,?,?) ";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		try {
			connection = DataBase.getConnection();
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, stockinfo.getBook_id());
			preparedStatement.setInt(2, stockinfo.getBook_stock());
			preparedStatement.setInt(3, stockinfo.getBook_sell());
			// 将java.util.Date转换为java.sql.Date
			Date uploadtime = stockinfo.getBook_uploadtime();
			java.sql.Date d = null;
			if (uploadtime != null) {
				d = new java.sql.Date(uploadtime.getTime());
			}
			preparedStatement.setDate(4, d);
			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			DataBase.close(rs, preparedStatement, connection);
		}
		return flag;

	}
		
	//添加 庫存
	public boolean updatestock(D_stock stockinfo){
		boolean flag = true;
		String sql = "update d_stock set book_stock=book_stock+? where book_id=?";
		String sql2 = "select * from d_stock where book_id=?";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement2 =null;
		
		ResultSet rs = null;
		try {
			connection = DataBase.getConnection();
			preparedStatement = connection.prepareStatement(sql);
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement2.setString(1, stockinfo.getBook_id());
            rs=preparedStatement2.executeQuery();
            if(rs.next()){
            	preparedStatement.setInt(1, stockinfo.getBook_stock());
    			preparedStatement.setString(2, stockinfo.getBook_id());
    		
    			int i = preparedStatement.executeUpdate();
    			if (i > 0) {
    				flag = true;
    			} else {
    				flag = false;
    			}
            }		
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			DataBase.close(rs, preparedStatement, connection);
		}
		return flag;
	}
	
	//库存查询
	public List<D_stock> stockselect(String str) {
		// TODO Auto-generated method stub
		List<D_stock>list = new ArrayList<D_stock>();
		String sql = "select * from d_stock where book_id like";
		sql += "'%"+str+"%'";
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

}
