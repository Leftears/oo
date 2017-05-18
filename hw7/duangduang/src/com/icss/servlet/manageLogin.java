package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.pojo.D_bookAdmin;
import com.icss.pojo.D_sysAdmin;
import com.icss.pojo.D_users;
import com.icss.service.D_bookAdminService;
import com.icss.service.D_sysAdminService;
import com.icss.service.D_usersService;

public class manageLogin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public manageLogin() {
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
		//获取网页表单内容
		String account = request.getParameter("account"); //获取账号
		String pwd = request.getParameter("pwd");         //获取密码
		String rolechoose = request.getParameter("rolechoose");//获取单选按钮选中的value值
		
		D_bookAdmin bookAdmininfo = new D_bookAdmin();
	    D_bookAdminService bookAdminService=new D_bookAdminService();
		bookAdmininfo.setBookAdmin_account(account);
		bookAdmininfo.setBookAdmin_pwd(pwd);
		bookAdmininfo.setRole(Integer.parseInt(rolechoose));
		
		D_sysAdmin sysAdmininfo = new D_sysAdmin();
		D_sysAdminService sysAdminService =new D_sysAdminService();
		sysAdmininfo.setSysAdmin_account(account);
		sysAdmininfo.setSysAdmin_pwd(pwd);
		sysAdmininfo.setRole(Integer.parseInt(rolechoose));
		
	    if(Integer.parseInt(rolechoose)==1){
			//进入系统管理员界面
	    	if(sysAdminService.searchsysAdmin(sysAdmininfo)){
	    		request.getSession().setAttribute("sysadmin", account);
				request.getRequestDispatcher("pages/sysmanager.jsp").forward(request,response);
	    	}
	    	else{
	    		request.setAttribute("message", "账号或密码不正确");
				request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/manageLogin.jsp").forward(request, response);
	    	}
		}
		else if(Integer.parseInt(rolechoose)==2){
			//进入图书管理员界面
			if(bookAdminService.loginSearch(bookAdmininfo)){
				//判断账号及密码是否正确
				request.getSession().setAttribute("bookadmin", account);
				request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/bookAdmin.jsp").forward(request,response);
			}
			else{
				request.setAttribute("message", "账号或密码不正确");
				request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/manageLogin.jsp").forward(request, response);
			}
		}
		else{
			
		}
		//把表单内容传给一个user对象
		
		
		
		
//		if(userService.addUser(userinfo)){
//			request.getSession().setAttribute("user", userinfo);
//			request.getRequestDispatcher("../.jsp").forward(request, response);
//		}else {
//			
//		}
		
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
