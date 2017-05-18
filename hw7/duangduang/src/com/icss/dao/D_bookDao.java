package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icss.pojo.D_book;
import com.icss.util.DataBase;

public class D_bookDao {
	//添加图书
	public boolean addbook(D_book bookinfo) {
		boolean flag=true;
		String sql="insert into d_book values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String sql2="select * from d_book where book_id=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		PreparedStatement preparedStatement2=null;
		ResultSet rs=null;
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement2=connection.prepareStatement(sql2);
			preparedStatement2.setString(1, bookinfo.getBook_id());
			rs=preparedStatement2.executeQuery();
			
			if(!rs.next()){
        		preparedStatement.setString(1, bookinfo.getBook_id());
				preparedStatement.setString(2, bookinfo.getType_num());
				preparedStatement.setString(3, bookinfo.getBook_name());
				preparedStatement.setFloat(4, bookinfo.getBook_price());
				preparedStatement.setString(5, bookinfo.getBook_explain());
				preparedStatement.setString(6, bookinfo.getBook_author());
				preparedStatement.setString(7, bookinfo.getBook_press());
				//将java.util.Date转换为java.sql.Date
				Date book_time = bookinfo.getBook_time();
				java.sql.Date d = null; 				
				if (book_time != null) {
					d = new java.sql.Date(book_time.getTime());
				}
				preparedStatement.setDate(8, d); //date型
				preparedStatement.setString(9, bookinfo.getBook_isbn());
				preparedStatement.setString(10, bookinfo.getBook_edit());
				preparedStatement.setString(11, bookinfo.getBook_page());
				preparedStatement.setInt(12, bookinfo.getBook_wordNum());//int
				
				Date book_presstime=bookinfo.getBook_presstime();
				java.sql.Date p=null;
				if(book_presstime!=null){
					p=new java.sql.Date(book_presstime.getTime());
				}
				
				preparedStatement.setDate(13, p);//date
				preparedStatement.setInt(14, bookinfo.getBook_presscount());//int
				preparedStatement.setString(15, bookinfo.getBook_size());
				preparedStatement.setString(16, bookinfo.getBook_capacitor());
				preparedStatement.setString(17, bookinfo.getBook_package());
				preparedStatement.setString(18, bookinfo.getBook_synopsis());
				preparedStatement.setString(19, bookinfo.getBook_catalogue());
				preparedStatement.setString(20, bookinfo.getBook_src());
				
				int i=preparedStatement.executeUpdate();
				if(i>0){
					flag=true;
				}
				else{
					flag=false;
				}
			}else{
				flag=false;
			}			
		
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}finally{
			DataBase.close(rs, preparedStatement, connection);
		}
		
		return flag;
	}
	
	//删除图书
	public boolean delbook(D_book bookinfo){
		boolean flag=true;
		String sql="delete from d_book where book_id=?";
		String sql2="select * from d_book where book_id=?";
		Connection conn=null;
		PreparedStatement pstm = null;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		try {
			conn = DataBase.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm2=conn.prepareStatement(sql2);
			pstm2.setString(1, bookinfo.getBook_id());
			rs=pstm2.executeQuery();
			if(rs.next()){   //有才能删
				pstm.setString(1, bookinfo.getBook_id());
				int i=pstm.executeUpdate();
				if(i>0){
					flag=true;
				}
				else {
					flag=false;
				}
			}else{
				flag=false;
			}
		} catch(Exception e) {
			flag=false;
			e.printStackTrace();
		} finally {
			DataBase.close(rs, pstm, conn);
		}
		return flag;
	}
	
	//按图书编号查询
	public List<D_book> numsearch(String id) {
		// TODO Auto-generated method stub
		List<D_book>list = new ArrayList<D_book>();
		String sql = "select * from d_book where book_id like";
		sql += "'%"+id+"%'";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			conn = DataBase.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				String book_id = rs.getString("book_id");
				String type_num = rs.getString("type_num");
				String book_name = rs.getString("book_name");
				float book_price = rs.getFloat("book_price");
				String book_explain = rs.getString("book_explain");
				String book_author = rs.getString("book_author");
				String book_press = rs.getString("book_press");
				Date book_time = rs.getDate("book_time");
				String book_isbn = rs.getString("book_isbn");
				String book_edit = rs.getString("book_edit");
				String book_page = rs.getString("book_page");
				int book_wordNum = rs.getInt("book_wordNum");
				Date book_presstime = rs.getDate("book_presstime");
				int book_presscount = rs.getInt("book_presscount");
				String book_size = rs.getString("book_size");
				String book_capacitor = rs.getString("book_capacitor");
				String book_package = rs.getString("book_package");
				String book_synopsis = rs.getString("book_synopsis");
				String book_catalogue = rs.getString("book_catalogue");
				String book_src = rs.getString("book_src");
				//封装数据
				D_book bookinfo = new D_book();
			
				bookinfo.setBook_id(book_id);
				bookinfo.setType_num(type_num);
				bookinfo.setBook_name(book_name);
				bookinfo.setBook_price(book_price);
				bookinfo.setBook_explain(book_explain);
				bookinfo.setBook_author(book_author);
				bookinfo.setBook_press(book_press);
				bookinfo.setBook_time(book_time);
				bookinfo.setBook_isbn(book_isbn);
				bookinfo.setBook_edit(book_edit);
				bookinfo.setBook_page(book_page);
	            bookinfo.setBook_wordNum(book_wordNum);
				bookinfo.setBook_presstime(book_presstime);
				bookinfo.setBook_presscount(book_presscount);
				bookinfo.setBook_size(book_size);
				bookinfo.setBook_capacitor(book_capacitor);
				bookinfo.setBook_package(book_package);
				bookinfo.setBook_synopsis(book_synopsis);
			    bookinfo.setBook_catalogue(book_catalogue);
			    bookinfo.setBook_src(book_src);
				
				//managerinfo.setBookAdmin_pwd(account);
				
				list.add(bookinfo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DataBase.close(rs, pstm, conn);
		}
		return list;
	}
	
	//按图书类别查询
	public List<D_book> selectByType(String type) {
		// TODO Auto-generated method stub
		List<D_book>list = new ArrayList<D_book>();
		String sql = "select book_id,type_num,book_name from d_book where type_num like ";
		sql += "'%"+type+"%'";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			
			conn = DataBase.getConnection();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				String book_id = rs.getString("book_id");
				String type_num = rs.getString("type_num");
				String book_name = rs.getString("book_name");
				//封装数据
				D_book bookinfo = new D_book();
			
				bookinfo.setBook_id(book_id);
				bookinfo.setType_num(type_num);
				bookinfo.setBook_name(book_name);
				
				//managerinfo.setBookAdmin_pwd(account);
				
				list.add(bookinfo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DataBase.close(rs, pstm, conn);
		}
		return list;
	}

}
