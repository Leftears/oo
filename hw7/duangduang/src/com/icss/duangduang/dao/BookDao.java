package com.icss.duangduang.dao;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.domain.Book;
import com.icss.duangduang.domain.User;

public interface BookDao {
	public void addBook(Book book);
	public void deleteBook(Book book);
	//public void updateBook(User user,String password);
	//public void updateUserinfo(User user,String name,String gender,Date birthday,String mail);
	public Book load(Integer id);
	public List<Book> findAll();
	 public List<Book> find(String sql, Object[] params, LinkedHashMap<String, String> orderByMap);
}
