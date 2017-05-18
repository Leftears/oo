package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.pojo.D_bookAdmin;
import com.icss.pojo.D_users;
import com.icss.service.D_bookAdminService;
import com.icss.service.D_usersService;

public class PasswordChangeData extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PasswordChangeData() {
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
		String change_pwd =request.getParameter("change_pwd");
		String sure_pwd =request.getParameter("sure_pwd");
		
		D_bookAdmin bookAdmininfo = new D_bookAdmin();
		D_bookAdminService bookAdminService = new D_bookAdminService();
		Object object=request.getSession().getAttribute("bookadmin");
		String account="";
		if(object!=null){
		  account=object.toString();
		}
		if(change_pwd.equals(sure_pwd)){
			//新密码相同
			bookAdmininfo.setBookAdmin_account(account);
			bookAdmininfo.setBookAdmin_pwd(change_pwd);
			if(bookAdminService.pwdchange(bookAdmininfo)){
				request.setAttribute("message2", "密码修改成功");
				request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/passwordChange.jsp").forward(request, response);	
			}
			else{
				request.setAttribute("message3", "密码修改失败，请重新修改");
				request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/passwordChange.jsp").forward(request, response);	

			}
		}
		else{
			request.setAttribute("message1", "密码不相同");
			request.getRequestDispatcher("./WEB-INF/jsp/bookAdmin/passwordChange.jsp").forward(request, response);	

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
