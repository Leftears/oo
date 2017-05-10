package com.icss.duangduang.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.common.dao.AbstractDao;
import com.icss.duangduang.dao.BookDao;
import com.icss.duangduang.domain.Book;
import com.icss.duangduang.domain.User;

public class BookDaoImpl extends AbstractDao implements BookDao{

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book load(Integer id) {
		return (Book) this.load("select * from d_book where book_id=?", id);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object rowMap(ResultSet rs) {
		Book book=null;
		try {
			book=new Book();
			book.setId(rs.getInt("book_id"));
			book.setTypenum(rs.getString("type_num"));
			book.setName(rs.getString("book_name"));
			book.setPrice(rs.getDouble("book_price"));
			book.setExplain(rs.getString("book_explain"));
			book.setAuthor(rs.getString("book_author"));
			book.setPress(rs.getString("book_press"));
			book.setTime(rs.getDate("book_time"));
			book.setIsbn(rs.getString("book_isbn"));
			book.setSrc(rs.getString("book_src"));
			//book.setCategory();
			book.setEdit(rs.getString("book_edit"));
			book.setPage(rs.getString("book_page"));
			book.setWordNum(rs.getInt("book_wordnum"));
			book.setPressTime(rs.getDate("book_presstime"));
			book.setPresscount(rs.getInt("book_presscount"));
			book.setSize(rs.getString("book_size"));
			book.setCapacitor(rs.getString("book_capacitor"));
			book.setPackage1(rs.getString("book_package"));
			book.setCategory(rs.getString("book_category"));
			book.setBuynum(rs.getInt("book_buynum"));
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return book;
	}


	public List<Book> find(String sql, Object[] params,
			LinkedHashMap<String, String> orderByMap) {
		
		return this.list(sql, params, orderByMap);
	}

	
	

	

}
