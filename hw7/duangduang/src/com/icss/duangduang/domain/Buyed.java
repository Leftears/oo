package com.icss.duangduang.domain;

import java.io.Serializable;

public class Buyed implements Serializable{
	private String useracccount;
	private String ordernum;
	public String getUseracccount() {
		return useracccount;
	}
	public void setUseracccount(String useracccount) {
		this.useracccount = useracccount;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	@Override
	public String toString() {
		return "Buyed [useracccount=" + useracccount + ", ordernum=" + ordernum
				+ "]";
	}
	

}
