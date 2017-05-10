package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.icss.pojo.D_users;
import com.icss.util.DataBase;

public class D_usersDao {
	
	public boolean addUsers(D_users userinfo){
		boolean flag=false;
		Connection conn=null;
		PreparedStatement pstm=null;
	//	ResultSet rs=null;
		String sql="insert into d_users(user_account,user_mail,user_pwd) values(?,?,?)";
		try{
			conn=DataBase.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, userinfo.getUser_account());
			int i=pstm.executeUpdate();
			if(i>0){//User user=new User();user.setAccount(request.getParameter("account"));
				flag=true;
			}
		}
		catch(Exception e){
			flag=false;
			e.printStackTrace();
		}finally{
			DataBase.close(null, pstm, conn);
		}
		return flag;
	}
	
}
