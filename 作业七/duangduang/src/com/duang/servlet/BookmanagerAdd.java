package com.duang.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.duang.dao.D_bookAdminDao;

/**
 * Servlet implementation class BookmanagerAdd
 */
@WebServlet("/BookmanagerAdd")
public class BookmanagerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookmanagerAdd() {
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
		D_bookAdminDao bookmanager=new D_bookAdminDao();
        String addop= (String)request.getParameter("add");
        String deleteop= (String)request.getParameter("delete");
        if(addop!=null){
        	String add_account= (String)request.getParameter("add_account");
        	bookmanager.add(add_account);
        //	request.setAttribute("message1", "添加成功");
        }
        else if(deleteop!=null){
        	String delete_account= (String)request.getParameter("delete_account");
            bookmanager.delete(delete_account);
        //    request.setAttribute("message2", "删除成功");
        }
		request.getRequestDispatcher("bookmanager").forward(request,response);
		

	}

}
