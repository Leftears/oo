package com.icss.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utils {
    
	public static void forwardTo(String path
			,HttpServletRequest request,HttpServletResponse response) 
					throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(path);	
		rd.forward(request, response);
	}
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	private static SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

	public static Date parseToDate (String strDate) {
		Date date = null;
		try {
			if (strDate != null && strDate.length() > 0) {
			    date = sdf.parse(strDate);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return date;		
	}
	
	public static String formatToStr (Date date) {
		String strDate = "";
		if (date != null) {
			strDate = sdf.format(date);
		}
		return strDate;
	}
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Date d = Utils.parseToDate("");
//		System.out.println(d);
//		
//	    String strDate = Utils.formatToStr(new Date());
//	    System.out.println(strDate);
//	}

}
