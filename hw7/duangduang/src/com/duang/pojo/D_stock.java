package com.duang.pojo;

import java.util.Date;

public class D_stock {
	private String book_id;
	private int book_stock;
	private int book_sell;
	private Date  book_uploadtime;
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public int getBook_stock() {
		return book_stock;
	}
	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}
	public int getBook_sell() {
		return book_sell;
	}
	public void setBook_sell(int book_sell) {
		this.book_sell = book_sell;
	}
	public Date getBook_uploadtime() {
		return book_uploadtime;
	}
	public void setBook_uploadtime(Date book_uploadtime) {
		this.book_uploadtime = book_uploadtime;
	}
}
