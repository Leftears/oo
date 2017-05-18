package com.icss.duangduang.domain;

import java.io.Serializable;

public class BookType implements Serializable{
	private String num;//类别编号
	private String name;//图书类别名
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookType [num=" + num + ", name=" + name + "]";
	}
	
	

}
