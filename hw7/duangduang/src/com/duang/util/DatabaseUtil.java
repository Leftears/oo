package com.duang.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DatabaseUtil {
    //读取properties文件中的内容，注意：db.properties文件的位置必须在读取它的类所在的包中
	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	//只会在类信息加载的时候执行一次
	static {
	    Properties prop = new Properties();	
	    InputStream in = 
	    		DatabaseUtil.class.getResourceAsStream("db.properties");
	    try {
			prop.load(in);
			//根据properties文件中提供的键值对来获取相应的信息
			drivername = prop.getProperty("drivername");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取数据库连接
	public static Connection getConnection () {
		Connection conn = null;
		try {
			Class.forName(drivername);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;		
	}
	
	//清理资源
	public static void close (ResultSet rs,
			PreparedStatement pstm,Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args) {
		//获取数据库连接
		Connection conn = DatabaseUtil.getConnection();
		System.out.println(conn);
		//清理资源
		DatabaseUtil.close(null, null, conn);
	}
}
