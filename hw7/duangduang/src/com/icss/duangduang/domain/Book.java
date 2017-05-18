package com.icss.duangduang.domain;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	private Integer id;
	private String typenum;
	private String name;
	private Double price;
	private String explain;
	private String author;
	private String press;//出版社
	private Date time;//出版时间
	private String isbn;//国际标准书号
	private String src;//图片地址
	private String category;//分类
	private String edit;
	private String page;
	private Integer wordNum;
	private Date pressTime;
	private Integer presscount;
	private String size;
	private String capacitor;
	private String package1;
	private Integer buynum;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypenum() {
		return typenum;
	}
	public void setTypenum(String typenum) {
		this.typenum = typenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Integer getWordNum() {
		return wordNum;
	}
	public void setWordNum(Integer wordNum) {
		this.wordNum = wordNum;
	}
	public Date getPressTime() {
		return pressTime;
	}
	public void setPressTime(Date pressTime) {
		this.pressTime = pressTime;
	}
	public Integer getPresscount() {
		return presscount;
	}
	public void setPresscount(Integer presscount) {
		this.presscount = presscount;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCapacitor() {
		return capacitor;
	}
	public void setCapacitor(String capacitor) {
		this.capacitor = capacitor;
	}
	
	public String getPackage1() {
		return package1;
	}
	public void setPackage1(String package1) {
		this.package1 = package1;
	}
	
	public Integer getBuynum() {
		return buynum;
	}
	public void setBuynum(Integer buynum) {
		this.buynum = buynum;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", typenum=" + typenum + ", name=" + name
				+ ", price=" + price + ", explain=" + explain + ", author="
				+ author + ", press=" + press + ", time=" + time + ", isbn="
				+ isbn + "]";
	}
	

}
