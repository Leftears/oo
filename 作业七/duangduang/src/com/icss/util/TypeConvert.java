package com.icss.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeConvert {
	public static String converToString(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}
	
	public static Date convertToDate(String str) throws Exception{
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.parse(str);
		
	}

}
