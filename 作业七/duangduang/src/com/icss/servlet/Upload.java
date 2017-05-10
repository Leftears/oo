package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.dao.D_bookDao;
import com.icss.pojo.D_book;
import com.icss.pojo.D_stock;
import com.icss.service.D_bookService;
import com.icss.service.D_stockService;
import com.icss.util.TypeConvert;
import com.icss.util.Utils;
import com.mysql.jdbc.Util;

public class Upload extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Upload() {
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
		String id=request.getParameter("book_id");
		String num=(String)request.getParameter("type_num");  //乱码问题
		//乱码处理
		num = new String(num.getBytes("ISO8859_1"),"utf-8");
		System.out.println(num);
		String name=request.getParameter("book_name");
		String price=request.getParameter("book_price");
		String explain=request.getParameter("book_explain");
		String author=request.getParameter("book_aurthor");
		String press=request.getParameter("book_press");
		String time=request.getParameter("book_time"); //date
		String isbn=request.getParameter("book_isbn");
		String edit=request.getParameter("book_edit");
		String page=request.getParameter("book_page");
		String wordnum=request.getParameter("book_wordnum");
		String presstime=request.getParameter("book_presstime");
		String presscount=request.getParameter("book_presscount");
		String size=request.getParameter("book_size");
		String capacitor=request.getParameter("book_capacitor");
		String packages=request.getParameter("book_package");
		String synopsis=request.getParameter("book_synopsis");
		String catalogue=request.getParameter("book_catalogue");
		String src=request.getParameter("book_src");
		String stock=request.getParameter("book_stock");//获取库存
		
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		D_book bookinfo=new D_book();
		D_bookService bookService=new D_bookService();
		D_stock stockinfo=new D_stock();
		D_stockService stockService=new D_stockService();
		
		bookinfo.setBook_id(id);
		bookinfo.setType_num(num);
		bookinfo.setBook_name(name);
		bookinfo.setBook_price(Float.parseFloat(price));
		bookinfo.setBook_explain(explain);
		bookinfo.setBook_author(author);
		bookinfo.setBook_press(press);
		bookinfo.setBook_time(Utils.parseToDate(time));
		bookinfo.setBook_isbn(isbn);
		bookinfo.setBook_edit(edit);
		bookinfo.setBook_page(page);
		bookinfo.setBook_wordNum(Integer.parseInt(wordnum));
		bookinfo.setBook_presstime(Utils.parseToDate(presstime));
		bookinfo.setBook_presscount(Integer.parseInt(presscount));
		bookinfo.setBook_size(size);
		bookinfo.setBook_capacitor(capacitor);
		bookinfo.setBook_package(packages);
		bookinfo.setBook_synopsis(synopsis);
		bookinfo.setBook_catalogue(catalogue);
		bookinfo.setBook_src(src);
		
		stockinfo.setBook_id(id); //d_stock表
		stockinfo.setBook_stock(Integer.parseInt(stock));
		stockinfo.setBook_sell(0);
		Date now = new Date();
		java.sql.Date uploadtime = new java.sql.Date(now.getTime());
		stockinfo.setBook_uploadtime(uploadtime);
		
		if(bookService.addbook(bookinfo) && stockService.insertstock(stockinfo)){ //判断是否添加成功
			request.setAttribute("message1","上传成功");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/bookupload.jsp").forward(request, response);	
		}
		else {
			request.setAttribute("message2", "上传失败或图书编号重复");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/bookupload.jsp").forward(request, response);
	
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
