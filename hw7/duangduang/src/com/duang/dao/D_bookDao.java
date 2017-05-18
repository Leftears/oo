package com.duang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.duang.pojo.Bookinfo;
import com.duang.pojo.D_book;
import com.duang.pojo.Managerinfo;
import com.duang.util.DatabaseUtil;

public class D_bookDao {
public void add(D_book bookinfo){		
		String sql="insert into d_book(book_id,type_num,book_name,book_price,book_explain,book_author,book_press,book_time,book_isbn,book_edit,book_page,book_wordNum,book_presstime,book_presscount,book_size,book_capacitor,book_package,book_synopsis,book_catalogue) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Connection conn=null;
		PreparedStatement pstm = null;
		
		
		try {
			conn = DatabaseUtil.getConnection();
			
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			pstm.setString(1,bookinfo.getBook_id());
			pstm.setString(2,bookinfo.getType_num());
			pstm.setString(3, bookinfo.getBook_name());
			pstm.setFloat(4, bookinfo.getBook_price());
			pstm.setString(5, bookinfo.getBook_explain());
			pstm.setString(6, bookinfo.getBook_author());
			pstm.setString(7, bookinfo.getBook_press());
			pstm.setDate(8, (java.sql.Date)bookinfo.getBook_time());
			pstm.setString(9, bookinfo.getBook_isbn());
			pstm.setInt(10, bookinfo.getBook_edit());
			pstm.setString(11, bookinfo.getBook_page());
			pstm.setInt(12, bookinfo.getBook_wordNum());
			pstm.setDate(13, (java.sql.Date)bookinfo.getBook_presstime());
			pstm.setInt(14, bookinfo.getBook_presscount());
			pstm.setString(15, bookinfo.getBook_size());
			pstm.setString(16, bookinfo.getBook_capacitor());
			pstm.setString(17, bookinfo.getBook_package());
			pstm.setString(18, bookinfo.getBook_synopsis());
			pstm.setString(19, bookinfo.getBook_catalogue());
			
			pstm.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}
	
	public void delete(String id){
		String sql="delete from d_book where book_id=?;";
		Connection conn=null;
		PreparedStatement pstm = null;
		String sql2="select * from d_book;" ;
		PreparedStatement pstm2 = null;
		ResultSet rs=null;
		int flag=0;
		
		try {
			conn = DatabaseUtil.getConnection();

			pstm2=conn.prepareStatement(sql2);
			rs=pstm2.executeQuery();
			while(rs.next()){
				String b_account=rs.getString("book_id");
				if(b_account.equals(id)){
					flag=1;
				}
			}
			if(flag==1){
			pstm = conn.prepareStatement(sql);
			//设置参数，从传递的userinfo中获取
			pstm.setString(1,id);
			pstm.executeUpdate();}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.close(null, pstm, conn);
		}
	}
	
		public List<D_book> selectAll() {
			// TODO Auto-generated method stub
			List<D_book>list = new ArrayList<D_book>();
			String sql = "select * from d_book;";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				conn = DatabaseUtil.getConnection();
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
					int book_edit = rs.getInt("book_edit");
					String book_page = rs.getString("book_page");
					int book_wordNum = rs.getInt("book_wordNum");
					Date book_presstime = rs.getDate("book_presstime");
					int book_presscount = rs.getInt("book_presscount");
					String book_size = rs.getString("book_size");
					String book_capacitor = rs.getString("book_capacitor");
					String book_package = rs.getString("book_package");
					String book_synopsis = rs.getString("book_synopsis");
					String book_catalogue = rs.getString("book_catalogue");
					//封装数据
					D_book bookinfo = new D_book();
				
					bookinfo.setBook_id(book_id);
					bookinfo.setType_num(type_num);
					bookinfo.setBook_name(book_name);
					bookinfo.setBook_price(book_price);
					bookinfo.setBook_explain(book_explain);
					bookinfo.setBook_author(book_author);
					bookinfo.setBook_press(book_press);
					bookinfo.setBook_isbn(book_isbn);
					bookinfo.setBook_edit(book_edit);
					bookinfo.setBook_page(book_page);
		            bookinfo.setBook_wordNum(book_wordNum);
					bookinfo.setBook_presstime(book_presstime);
					bookinfo.setBook_size(book_size);
					bookinfo.setBook_capacitor(book_capacitor);
					bookinfo.setBook_package(book_package);
					bookinfo.setBook_synopsis(book_synopsis);
				    bookinfo.setBook_catalogue(book_catalogue);
					
					//managerinfo.setBookAdmin_pwd(account);
					
					list.add(bookinfo);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DatabaseUtil.close(rs, pstm, conn);
			}
			return list;
		}
		public List<D_book> selectByType(String type) {
			// TODO Auto-generated method stub
			List<D_book>list = new ArrayList<D_book>();
			String sql = "select * from d_book where type_num like ";
			sql += "'%"+type+"%'";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				
				conn = DatabaseUtil.getConnection();
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
					int book_edit = rs.getInt("book_edit");
					String book_page = rs.getString("book_page");
					int book_wordNum = rs.getInt("book_wordNum");
					Date book_presstime = rs.getDate("book_presstime");
					int book_presscount = rs.getInt("book_presscount");
					String book_size = rs.getString("book_size");
					String book_capacitor = rs.getString("book_capacitor");
					String book_package = rs.getString("book_package");
					String book_synopsis = rs.getString("book_synopsis");
					String book_catalogue = rs.getString("book_catalogue");
					//封装数据
					D_book bookinfo = new D_book();
				
					bookinfo.setBook_id(book_id);
					bookinfo.setType_num(type_num);
					bookinfo.setBook_name(book_name);
					bookinfo.setBook_price(book_price);
					bookinfo.setBook_explain(book_explain);
					bookinfo.setBook_author(book_author);
					bookinfo.setBook_press(book_press);
					bookinfo.setBook_isbn(book_isbn);
					bookinfo.setBook_edit(book_edit);
					bookinfo.setBook_page(book_page);
		            bookinfo.setBook_wordNum(book_wordNum);
					bookinfo.setBook_presstime(book_presstime);
					bookinfo.setBook_size(book_size);
					bookinfo.setBook_capacitor(book_capacitor);
					bookinfo.setBook_package(book_package);
					bookinfo.setBook_synopsis(book_synopsis);
				    bookinfo.setBook_catalogue(book_catalogue);
					
					//managerinfo.setBookAdmin_pwd(account);
					
					list.add(bookinfo);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				DatabaseUtil.close(rs, pstm, conn);
			}
			return list;
		}
		public List<D_book> selectById(String id) {
			// TODO Auto-generated method stub
			List<D_book>list = new ArrayList<D_book>();
			String sql = "select * from d_book where book_id like ";
			sql += "'%"+id+"%'; ";
			System.out.print(sql);
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try{
				
				conn = DatabaseUtil.getConnection();
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
					int book_edit = rs.getInt("book_edit");
					String book_page = rs.getString("book_page");
					int book_wordNum = rs.getInt("book_wordNum");
					Date book_presstime = rs.getDate("book_presstime");
					int book_presscount = rs.getInt("book_presscount");
					String book_size = rs.getString("book_size");
					String book_capacitor = rs.getString("book_capacitor");
					String book_package = rs.getString("book_package");
					String book_synopsis = rs.getString("book_synopsis");
					String book_catalogue = rs.getString("book_catalogue");
					//封装数据
					D_book bookinfo = new D_book();
				
					bookinfo.setBook_id(book_id);
					bookinfo.setType_num(type_num);
					bookinfo.setBook_name(book_name);
					bookinfo.setBook_price(book_price);
					bookinfo.setBook_explain(book_explain);
					bookinfo.setBook_author(book_author);
					bookinfo.setBook_press(book_press);
					bookinfo.setBook_isbn(book_isbn);
					bookinfo.setBook_edit(book_edit);
					bookinfo.setBook_page(book_page);
		            bookinfo.setBook_wordNum(book_wordNum);
					bookinfo.setBook_presstime(book_presstime);
					bookinfo.setBook_size(book_size);
					bookinfo.setBook_capacitor(book_capacitor);
					bookinfo.setBook_package(book_package);
					bookinfo.setBook_synopsis(book_synopsis);
				    bookinfo.setBook_catalogue(book_catalogue);
					
					//managerinfo.setBookAdmin_pwd(account);
					
					list.add(bookinfo);
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
		D_book book =new D_book();
		D_bookDao bookdao=new D_bookDao();
		List<D_book>list = new ArrayList<D_book>();
		book.setBook_id("3");
		book.setType_num("bb");
		book.setBook_name("asdadd");
		bookdao.add(book);
		list=bookdao.selectAll();
		for(int i=0;i<list.size();i++){
			D_book temp=list.get(i);
			//System.out.println(temp.getBook_name());
		}
		list=bookdao.selectById("2");
		for(int i=0;i<list.size();i++){
			D_book temp=list.get(i);
			//System.out.println("id "+temp.getBook_id());
		}

		list=bookdao.selectByType("aa");
		for(int i=0;i<list.size();i++){
			D_book temp=list.get(i);
			//System.out.println("type "+temp.getType_num());
		}

		DatabaseUtil.close(null, null, conn);
	}
}
