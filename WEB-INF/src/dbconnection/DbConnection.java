package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {

	public static void main(String[] args){
		Connection con = getDbConnection();
		System.out.println("Connection : "+con); 
		
			
	}
	
	public static Connection getDbConnection() {   
        Connection con = null; 
        try{                      
        	  Class.forName("com.mysql.jdbc.Driver").newInstance();     
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineAirTicketing","root","123456"); 
             //con.setAutoCommit(true);                                                                                                                                                                                                                                                
        } catch (Exception err){                                                                                                                                                                 
             System.out.println("Unable to connect: "+err);                                                                                                   
                                                                                            
        }                                            
        return con;                                                                                                                                 
    }     	
  

}
