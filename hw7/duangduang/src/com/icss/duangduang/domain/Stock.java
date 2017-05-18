package com.icss.duangduang.domain;

import java.io.Serializable;

public class Stock implements Serializable{
	private String id;
	private Integer bookstock;//库存量
	private Integer booksell;//图书销量
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBookstock() {
		return bookstock;
	}
	public void setBookstock(Integer bookstock) {
		this.bookstock = bookstock;
	}
	public Integer getBooksell() {
		return booksell;
	}
	public void setBooksell(Integer booksell) {
		this.booksell = booksell;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", bookstock=" + bookstock + ", booksell="
				+ booksell + "]";
	}
	

}
