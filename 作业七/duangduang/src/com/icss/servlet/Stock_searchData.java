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

import com.icss.dao.D_stockDao;
import com.icss.pojo.D_book;
import com.icss.pojo.D_stock;
import com.icss.service.D_stockService;

public class Stock_searchData extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Stock_searchData() {
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
		String bookid=request.getParameter("stocksearch");
		
		D_stock stockinfo = new D_stock();
		D_stockService stockService = new D_stockService();
		D_stockDao stockDao = new D_stockDao();
		
		stockinfo.setBook_id(bookid);
		List<D_stock> list=new ArrayList<D_stock>();
		list = stockDao.stockselect(bookid);
		StringBuilder html = new StringBuilder();
		int len = list.size();
		for(int i=0;i<len;i++){
			D_stock temp=list.get(i);
			String id=temp.getBook_id();
			Integer stock=temp.getBook_stock();
			Integer sell=temp.getBook_sell();
			Date uploadtime =temp.getBook_uploadtime();
		
			html.append("<tr>");
			html.append("<td>");
			html.append(id);
			html.append("</td>");
			html.append("<td>");
			html.append(stock);
			html.append("</td>");
			html.append("<td>");
			html.append(sell);
			html.append("</td>");
			html.append("<td>");
			html.append(uploadtime);
			html.append("</td>");
			html.append("</tr>");
				
		}
		
		request.setAttribute("html", html);
		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/stock_search.jsp").forward(request, response);
		
		
		
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
