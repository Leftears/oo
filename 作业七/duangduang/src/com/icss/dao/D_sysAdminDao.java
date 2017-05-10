package com.icss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.icss.pojo.D_sysAdmin;
import com.icss.util.DataBase;

public class D_sysAdminDao {
	//µÇÂ¼²éÑ¯±í
	public boolean searchsysAdmin(D_sysAdmin sysAdmininfo) {
		boolean flag=true;
		String sql="select * from d_sysadmin where sysAdmin_account=? and sysAdmin_pwd=? and role=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		try{
			connection=DataBase.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, sysAdmininfo.getSysAdmin_account());
			preparedStatement.setString(2, sysAdmininfo.getSysAdmin_pwd());
			preparedStatement.setInt(3, sysAdmininfo.getRole());
			
			rs=preparedStatement.executeQuery();
			if(rs.next()) {
				flag=true;
			}
			else{
				flag=false;
			}
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}
		return flag;
		
	}
	

}
