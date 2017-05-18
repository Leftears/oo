package com.icss.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DataBase {
      //��ȡproperty�ļ�
	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	//static�飬ֻ��������Ϣ���ص�ʱ��ִ��һ��
	static{
		Properties prop=new Properties();
		InputStream in=DataBase.class.getResourceAsStream("db.property");
		try{
			prop.load(in);
			drivername=prop.getProperty("drivername");
			url=prop.getProperty("url");
			username=prop.getProperty("username");
			password=prop.getProperty("password");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){ //�������ݿ�
		Connection conn=null;
		try{
			Class.forName(drivername);
			conn=DriverManager.getConnection(url, username, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs,PreparedStatement pstm,
			Connection conn){  //������Դ
		try{
			if(rs != null){
				rs.close();
			}
			if(pstm != null){
				pstm.close();
			}
			if(conn != null){
				conn.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
