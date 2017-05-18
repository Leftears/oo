package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.pojo.D_order;
import com.icss.service.D_orderService;

public class OrderDel extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public OrderDel() {
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
		String ordernum =request.getParameter("orderdel");
		
		D_order order =new D_order();
		D_orderService orderService = new D_orderService();
		order.setOrder_num(ordernum);
		
		if(orderService.delOrder(order)){
			request.setAttribute("message1", "删除成功");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/order_del.jsp").forward(request, response);
		}
		else{
			request.setAttribute("message2", "删除不成功或订单号不存在");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/order_del.jsp").forward(request, response);
		}
		
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
