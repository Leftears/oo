package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.dao.D_orderDao;
import com.icss.pojo.D_order;
import com.icss.service.D_orderService;

public class OrderSearchPart extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public OrderSearchPart() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String num = request.getParameter("search");
		if(num ==null){
			request.setAttribute("message", "订单号不能为空");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/order_select2.jsp")
			.forward(request, response);
		}
		D_order orderinfo = new D_order();
//		D_orderService orderService = new D_orderService();
		D_orderDao orderDao = new D_orderDao();
		
		orderinfo.setOrder_num(num);

		List<D_order> list = new ArrayList<D_order>();
		list = orderDao.searchPart(num);
		StringBuilder html = new StringBuilder();
		int len = list.size();
		for (int i = 0; i < len; i++) {
			D_order temp = list.get(i);
			String user_account = temp.getUser_account();
			String order_num = temp.getOrder_num();
			Double totalprice = temp.getTotalprice();
			Date order_date = temp.getOrder_date();
			String order_status = temp.getOrder_status();
			String order_name = temp.getOrder_name();
			String order_addr = temp.getOrder_addr();
			Integer book_num = temp.getBook_num();
			String book_name = temp.getBook_name();

			html.append("<tr>");
			html.append("<td>");
			html.append(user_account);
			html.append("</td>");
			html.append("<td>");
			html.append(order_num);
			html.append("</td>");
			html.append("<td>");
			html.append(totalprice);
			html.append("</td>");
			html.append("<td>");
			html.append(order_date);
			html.append("</td>");
			html.append("<td>");
			html.append(order_status);
			html.append("</td>");
			html.append("<td>");
			html.append(order_name);
			html.append("</td>");
			html.append("<td>");
			html.append(order_addr);
			html.append("</td>");
			html.append("<td>");
			html.append(book_num);
			html.append("</td>");
			html.append("<td>");
			html.append(book_name);
			html.append("</td>");
			html.append("<tr>");
		}
		request.setAttribute("html", html);
		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/order_select2.jsp")
				.forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
