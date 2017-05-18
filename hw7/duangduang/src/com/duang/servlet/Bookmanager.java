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
import com.duang.pojo.D_bookAdmin;

/**
 * Servlet implementation class Bookmanager
 */
@WebServlet("/Bookmanager")
public class Bookmanager extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Bookmanager() {
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
		List<D_bookAdmin>list = new ArrayList<D_bookAdmin>();
		list=bookmanager.selectAll();
        StringBuilder html = new StringBuilder ();
        int size = list.size();
        for(int i=0;i<size;i++){
        	D_bookAdmin temp=list.get(i);
        	String account=temp.getBookAdmin_account();
        	html.append("<tr>");
        	html.append("<td>");
        	html.append(account);
        	html.append("</td>");
        	html.append("</tr>");
        }
        request.setAttribute("html", html);
		request.getRequestDispatcher("pages/sysmanager.jsp").forward(request,response);
		
	}

}
