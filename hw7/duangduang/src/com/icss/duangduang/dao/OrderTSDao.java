package com.icss.duangduang.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.domain.OrderTS;

public interface OrderTSDao {
	public void add(OrderTS orderTS);
	 public List<OrderTS> find(String sql, Object[] params, LinkedHashMap<String, String> orderByMap);
	 public void delete(String sql,Object[] params);

}
