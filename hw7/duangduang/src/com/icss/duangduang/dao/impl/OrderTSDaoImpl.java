package com.icss.duangduang.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.common.dao.AbstractDao;
import com.icss.duangduang.dao.OrderTSDao;
import com.icss.duangduang.domain.OrderTS;

public class OrderTSDaoImpl extends AbstractDao implements OrderTSDao{

	@Override
	public void add(OrderTS orderTS) {
		this.execute("insert into d_orderts(book_id,user_account,order_num,order_buy) values(?,?,?,?)", new Object[]{
				orderTS.getBookid(),
				orderTS.getUseraccount(),
				orderTS.getNum(),
				orderTS.isBuy()
		});
		
	}


	
	public Object rowMap(ResultSet rs) {
		OrderTS orderTS=null;
		try {
			orderTS=new OrderTS();
			orderTS.setId(rs.getInt("shop_no"));
			orderTS.setBookid(rs.getInt("book_id"));
			orderTS.setUseraccount(rs.getString("user_account"));
			orderTS.setNum(rs.getInt("order_num"));
			orderTS.setBuy(rs.getBoolean("order_buy"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  return orderTS;
	}

	@Override
	public List<OrderTS> find(String sql, Object[] params,
			LinkedHashMap<String, String> orderByMap) {
		return this.list(sql, params, orderByMap);
	}



	@Override
	public void delete(String sql, Object[] params) {
		this.execute(sql, params);
		
	}

}
