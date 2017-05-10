package com.icss.duangduang.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.icss.duangduang.domain.Book;
import com.icss.duangduang.domain.Order;
import com.icss.duangduang.domain.OrderTS;

public interface OrderDao {
  public void addOrder(Order order);
  public List<Order> findAll();
  public List<Order> find(String sql, Object[] params, LinkedHashMap<String, String> orderByMap);
 
}
