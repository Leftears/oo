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

import com.icss.dao.D_bookDao;
import com.icss.pojo.D_book;
import com.icss.service.D_bookService;

public class BookNumsearch extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookNumsearch() {
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
		String delnum=request.getParameter("bookdel");
		
		D_book bookinfo=new D_book();
		D_bookService bookService=new D_bookService();
		D_bookDao bookDao=new D_bookDao();
		
		bookinfo.setBook_id(delnum);
		List<D_book> list=new ArrayList<D_book>();
		list = bookDao.numsearch(delnum);
		StringBuilder html = new StringBuilder();
		int len = list.size();
		for(int i=0;i<len;i++){
			D_book temp=list.get(i);
	//		String id=temp.getBook_id();
			String num=temp.getType_num();
			String name=temp.getBook_name();
			Float price=temp.getBook_price();
//			String explain= temp.getBook_explain();
			String author =temp.getBook_author();
			String press=temp.getBook_press();
			Date time=temp.getBook_time();
			String isbn = temp.getBook_isbn();
			String edit = temp.getBook_edit();
	//		String pageString = temp.getBook_page();
	//		Integer wordnum = temp.getBook_wordNum();
	//		Date presstime = temp.getBook_presstime();
			Integer presscount = temp.getBook_presscount();
			String size = temp.getBook_size();
			String capacitor = temp.getBook_capacitor();
			String packages = temp.getBook_package();
//			String synopsis = temp.getBook_synopsis();
//			String catalogue = temp.getBook_catalogue();
//			String src = temp.getBook_src();
			html.append("<tr>");
			html.append("<td>");
			html.append(num);
			html.append("</td>");
			html.append("<td>");
			html.append(name);
			html.append("</td>");
			html.append("<td>");
			html.append(price);
			html.append("</td>");
			html.append("<td>");
			html.append(author);
			html.append("</td>");
			html.append("<td>");
			html.append(press);
			html.append("</td>");
			html.append("<td>");
			html.append(time);
			html.append("</td>");
			html.append("<td>");
			html.append(isbn);
			html.append("</td>");
			html.append("<td>");
			html.append(edit);
			html.append("</td>");
			html.append("<td>");
			html.append(presscount);
			html.append("</td>");
			html.append("<td>");
			html.append(size);
			html.append("</td>");
			html.append("<td>");
			html.append(capacitor);
			html.append("</td>");
			html.append("<td>");
			html.append(packages);
			html.append("</td>");
			html.append("<tr>");	
		}
		
		request.setAttribute("html", html);
		request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/numSearch.jsp").forward(request, response);
		
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
