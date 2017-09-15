package com.lin.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lin.bean.Admin;
import com.lin.bean.PageModel;
import com.lin.service.PageModelService;
import com.lin.utils.DbUtil;

@Service 
public class PageModelServiceImpl implements PageModelService {

	@Override
	public PageModel<Admin> findAdmins(int pageNo, int pageSize) {
		Connection conn=DbUtil.getConn();  
        String sql="select * from admin limit ?,?";  
        PageModel<Admin> pageModel=null;  
        PreparedStatement pstm=null;  
        ResultSet rs=null;  
        Admin admin=null;  
        List<Admin> list=new ArrayList<Admin>();  
        try {  
            pstm=conn.prepareStatement(sql);  
            pstm.setInt(1, (pageNo-1)*pageSize);  
           pstm.setInt(2, pageSize);  
            rs=pstm.executeQuery();;  
            while(rs.next()){  
                admin=new Admin();  
                admin.setId(rs.getInt("id"));  
                admin.setName(rs.getString("name"));  
                admin.setPassword(rs.getString("password"));  
                list.add(admin);  
            }  
          
            
            ResultSet rs2=pstm.executeQuery("select count(*) from admin");  
            int total=0;  
            if(rs2.next()){  
                total=rs2.getInt(1);  
            }  
            pageModel=new PageModel<Admin>();  
            pageModel.setPageNo(pageNo);  
            pageModel.setPageSize(pageSize);  
            pageModel.setTotalRecords(total);  
            pageModel.setList(list);  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally{  
        	DbUtil.close(rs, pstm, conn);
        }  
        return pageModel;  
	}

}
