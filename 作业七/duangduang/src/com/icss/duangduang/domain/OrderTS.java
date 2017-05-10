package com.icss.duangduang.domain;

import java.io.Serializable;

public class OrderTS implements Serializable{
	private Integer id;
	private Integer bookid;//书的编号
	private String useraccount;//用户账号
	private Integer num;//图书数量
	private boolean buy;//true为买，false为不买
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getUseraccount() {
		return useraccount;
	}
	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public boolean isBuy() {
		return buy;
	}
	public void setBuy(boolean buy) {
		this.buy = buy;
	}
	@Override
	public String toString() {
		return "OrderTS [id=" + id + ", bookid=" + bookid + ", useraccount="
				+ useraccount + ", num=" + num + ", buy=" + buy + "]";
	}
	

}
