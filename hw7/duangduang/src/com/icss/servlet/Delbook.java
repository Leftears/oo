package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.pojo.D_book;
import com.icss.pojo.D_stock;
import com.icss.service.D_bookService;
import com.icss.service.D_stockService;

public class Delbook extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Delbook() {
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
		//获取表单内容
		String delid = request.getParameter("bookdel");
		
		D_book bookinfo = new D_book();
		D_bookService bookService =new D_bookService();
		
    	bookinfo.setBook_id(delid);
    	
    	if(bookService.delbook(bookinfo)){
    		request.setAttribute("message1", "删除成功");
    		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/bookdel.jsp").forward(request, response);
    	}
    	else{
    		request.setAttribute("message2", "删除失败或没有该图书");
    		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/bookdel.jsp").forward(request, response);

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
