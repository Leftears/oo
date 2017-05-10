package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.dao.D_bookDao;
import com.icss.pojo.D_book;
import com.icss.service.D_bookService;

public class BookTypesearch extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookTypesearch() {
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
		String typenum = request.getParameter("bookdel");
		
		D_book bookinfo = new D_book();
		D_bookService bookService = new D_bookService();
		D_bookDao bookDao = new D_bookDao();
		
		bookinfo.setType_num(typenum);
		List<D_book> list=new ArrayList<D_book>();
		list = bookDao.selectByType(typenum);
		StringBuilder html = new StringBuilder();
		int len = list.size();
		for(int i=0;i<len;i++){
			D_book temp=list.get(i);
			String num=temp.getType_num();
			String id=temp.getBook_id();
			String name=temp.getBook_name();
			html.append("<tr>");
			html.append("<td>");
			html.append(num);
			html.append("</td>");
			html.append("<td>");
			html.append(id);
			html.append("</td>");
			html.append("<td>");
			html.append(name);
			html.append("</td>");
			html.append("<tr>");
		}
		
		request.setAttribute("html", html);
		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/typeSearch.jsp").forward(request, response);
		
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
