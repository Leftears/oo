package com.icss.duangduang.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.common.dao.AbstractDao;
import com.icss.duangduang.dao.OrderDao;
import com.icss.duangduang.domain.Order;

public class OrderDaoImpl extends AbstractDao implements OrderDao{

	@Override
	public void addOrder(Order order) {
		this.execute("insert into d_order(user_account,book_name,order_num,totalprice,order_status,book_src,order_addr) values(?,?,?,?,?,?,?)", new Object[]{
				order.getUseraccount(),
				order.getBookname(),
				order.getNum(),
				order.getTotalprice(),
				order.getStatus(),
				order.getSrc(),
				order.getAddr()
		});
		
	}

	@Override
	public Object rowMap(ResultSet rs) {
		Order order=null;
		try {
			order=new Order();
			order.setNum(rs.getString("order_num"));
			order.setBookname(rs.getString("book_name"));
			order.setUseraccount(rs.getString("user_account"));
			order.setBooknum(rs.getInt("book_num"));
			order.setTotalprice(rs.getDouble("totalprice"));
			order.setDate(rs.getDate("order_date"));
			order.setStatus(rs.getString("order_status"));
			order.setName(rs.getString("order_name"));
			order.setAddr(rs.getString("order_addr"));
			order.setSrc(rs.getString("book_src"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public List<Order> find(String sql, Object[] params,
			LinkedHashMap<String, String> orderByMap) {
		return this.list(sql, params, orderByMap);
	}

	@Override
	public List<Order> findAll() {
		
		return this.list("select * from d_order");
	}

}
