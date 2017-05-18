package com.icss.duangduang.domain;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
	private String num;//订单编号
	private String bookname;//图书名
	private String useraccount;//用户账号
	private Integer booknum;//图书数量
	private Double totalprice;
	private Date date;//订单日期
	private String status;//订单状态
	private String name;//收货人姓名
    private String addr;
	private String src;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getUseraccount() {
		return useraccount;
	}
	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}
	public Integer getBooknum() {
		return booknum;
	}
	public void setBooknum(Integer booknum) {
		this.booknum = booknum;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	@Override
	public String toString() {
		return "Order [num=" + num + ", bookname=" + bookname
				+ ", useraccount=" + useraccount + ", booknum=" + booknum
				+ ", totalprice=" + totalprice + ", date=" + date + ", status="
				+ status + ", name=" + name + ", addr=" + addr + ", src=" + src
				+ "]";
	}
	
	
	

}
