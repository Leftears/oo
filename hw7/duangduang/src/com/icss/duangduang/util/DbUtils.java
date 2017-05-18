package com.icss.duangduang.util;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import com.icss.duangduang.common.exception.DuangDuangException;

public class DbUtils {
	private static Properties properties;
	private static DataSource dataSource;
	
	static{
		
			try {
				properties=new Properties();
				properties.load(DbUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
				dataSource=BasicDataSourceFactory.createDataSource(properties);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
				  new ExceptionInInitializerError("数据源获取不到");
	        }
			}
		
	
	
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn=dataSource.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Statement getStatement(Connection conn){
		Statement stmt=null;
		if(conn==null){
			throw new DuangDuangException("连接为空，无法获得语句对象");
		}
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	public static PreparedStatement getpreparedStatement(Connection conn,String sql){
		 PreparedStatement pstmt=null;
		 if(conn==null){
			 throw new DuangDuangException("连接对象为空，无法获得语句对象");
		 }
		 if(sql==null||"".equals(sql)){
			 throw new DuangDuangException("sql语句为空，无法获得语句对象");
		 }
		 try {
			pstmt=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return pstmt;
	}
	
	public static PreparedStatement getPreparedStatement(Connection conn,String sql,Boolean flag){
		PreparedStatement pstmt=null;
		if(conn==null){
			 throw new DuangDuangException("连接对象为空，无法获得语句对象");
		 }
		 if(sql==null||"".equals(sql)){
			 throw new DuangDuangException("sql语句为空，无法获得语句对象");
		 }
		 try {
			if(flag){
				 pstmt=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			 }else{
				 pstmt=conn.prepareStatement(sql);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return pstmt;
	}
	public static CallableStatement getCallableStatement(Connection conn,String sql){
		CallableStatement cstmt=null;
		if(conn==null){
			throw new DuangDuangException("连接对象为空，无法获得语句对象");
		}
		if(sql==null||"".equals(sql)){
			throw new DuangDuangException("sql语句为空，无法获得语句对象");
		}
		try {
			cstmt=conn.prepareCall(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cstmt;
	}
	public static void closeConnection(Connection conn){
		if(conn==null){
			return;
		}
		try {
//			if(!conn.isClosed()){
				conn.close();
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	public static void closeStatement(PreparedStatement stmt){
		if(stmt==null){
			return;
		}
		try {
//			if(!stmt.isClosed()){
				stmt.close();
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeResultSet(ResultSet rs){
		if(rs==null){
			return;
		}
		try {
//			if(!rs.isClosed()){
				rs.close();
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
