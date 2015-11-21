package admin;
 
import java.io.FileInputStream;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;

import dbconnection.DbConnection;


public class Admin{ 
	private Connection con=null;
	private PreparedStatement stmt =null;
	private ResultSet rs =null;
	private List result=null;
	private Map resultMap =null;
	private String sql="";
    
	DbConnection dbcon = new DbConnection();
	
	
	public List getAdminList(){
		try{
			
			con = dbcon.getDbConnection() ;
			sql ="select * from admin";
			stmt = con.prepareStatement(sql);  
			rs = stmt.executeQuery();
			
			result  = new ArrayList();	
			while ( rs.next() ) {
				resultMap = new HashMap();
				
				resultMap.put("admId",rs.getString("adm_id"));
				resultMap.put("fullName",rs.getString("full_name"));

				result.add(resultMap);
			}
		} catch (SQLException errSql){
			System.out.println("SQL Exception in getAdminList:"+errSql);			
		} catch (Exception err){
			System.out.println("Exception in getAdminList:"+err);
		} finally {
			try { 
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException errSql){}
		}
		
		return result;
		      
	}


	public List getAdminDetail(String admId){
		try{
			
			con = dbcon.getDbConnection() ;
			sql ="select * from admin where adm_id = ?";
			stmt = con.prepareStatement(sql); 
			stmt.setInt(1,Integer.parseInt(admId));
			rs = stmt.executeQuery();
			
			result  = new ArrayList();	
			while ( rs.next() ) {
				resultMap = new HashMap();
				
				resultMap.put("fullName",rs.getString("full_name"));
				resultMap.put("address",rs.getString("address"));
				resultMap.put("phone",rs.getString("phone"));
				resultMap.put("mobileNo",rs.getString("mobile_no"));
				resultMap.put("emailId",rs.getString("email_id"));
				
				result.add(resultMap);
			}
		} catch (SQLException errSql){
			System.out.println("SQL Exception in getAdminDetail:"+errSql);			
		} catch (Exception err){
			System.out.println("Exception in getAdminDetail:"+err);
		} finally {
			try { 
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException errSql){}
		}
		
		return result;
		      
	}
 }


	

