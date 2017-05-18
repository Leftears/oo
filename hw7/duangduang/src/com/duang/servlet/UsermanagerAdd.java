package com.duang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.duang.dao.D_usersDao;

/**
 * Servlet implementation class UsermanagerAdd
 */
@WebServlet("/UsermanagerAdd")
public class UsermanagerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsermanagerAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		D_usersDao usermanager=new D_usersDao();
        String addop= (String)request.getParameter("add");
        String deleteop= (String)request.getParameter("delete");
        if(addop!=null){
        	String add_account= (String)request.getParameter("add_account");
        	usermanager.add(add_account);
        }
        else if(deleteop!=null){
        	String delete_account= (String)request.getParameter("delete_account");
        	usermanager.delete(delete_account);
        }
        
		request.getRequestDispatcher("usermanager").forward(request,response);
		
		
		

	}

}
