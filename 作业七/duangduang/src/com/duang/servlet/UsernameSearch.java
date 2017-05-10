package com.duang.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.duang.dao.D_usersDao;
import com.duang.pojo.D_users;

/**
 * Servlet implementation class UsernameSearch
 */
@WebServlet("/UsernameSearch")
public class UsernameSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsernameSearch() {
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
		List<D_users>list = new ArrayList<D_users>();
		String selectop=(String)request.getParameter("s_select");
		String s_account = (String)request.getParameter("t_search");
		if(selectop!=null){
		list = usermanager.select(s_account);
        StringBuilder html = new StringBuilder ();
        int size = list.size();
        
        for(int i=0;i<size;i++)
        {
        	D_users temp=list.get(i);
        	String account = temp.getUser_account();
        	String name = temp.getUser_name();
        	String mail = temp.getUser_mail();
        	String gender = temp.getUser_gender();
        	java.util.Date birth = temp.getUser_birth();
        	html.append("<tr>");
        	html.append("<td>");
        	html.append(account);
        	html.append("</td>");
        	html.append("<td>");
        	html.append(name);
        	html.append("</td>");
        	html.append("<td>");
        	html.append(mail);
        	html.append("</td>");
        	html.append("<td>");
        	html.append(gender);
        	html.append("</td>");
        	html.append("<td>");
        	html.append(birth);
        	html.append("</td>");
        	html.append("</tr>");
        }
        request.setAttribute("html", html);
        //System.out.print(html);
		request.getRequestDispatcher("pages/usermanager.jsp").forward(request,response);
		}
	}

}
