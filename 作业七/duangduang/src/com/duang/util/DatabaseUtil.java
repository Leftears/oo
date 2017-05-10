package com.duang.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DatabaseUtil {
    //��ȡproperties�ļ��е����ݣ�ע�⣺db.properties�ļ���λ�ñ����ڶ�ȡ���������ڵİ���
	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	//ֻ��������Ϣ���ص�ʱ��ִ��һ��
	static {
	    Properties prop = new Properties();	
	    InputStream in = 
	    		DatabaseUtil.class.getResourceAsStream("db.properties");
	    try {
			prop.load(in);
			//����properties�ļ����ṩ�ļ�ֵ������ȡ��Ӧ����Ϣ
			drivername = prop.getProperty("drivername");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//��ȡ���ݿ�����
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
	
	//������Դ
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
		//��ȡ���ݿ�����
		Connection conn = DatabaseUtil.getConnection();
		System.out.println(conn);
		//������Դ
		DatabaseUtil.close(null, null, conn);
	}
}
