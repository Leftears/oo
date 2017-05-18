package com.icss.duangduang.domain;

import java.io.Serializable;

public class SystemAdmin implements Serializable{
	private Integer id;
	private String account;
	private String password;
	private Integer roleId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "SystemAdmin [id=" + id + ", account=" + account + ", password="
				+ password + ", roleId=" + roleId + "]";
	}
	

}
