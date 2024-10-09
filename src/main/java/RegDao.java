

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegDao {


	 private String bdUrl = "jdbc:mysql://localhost:3306/nikdb";
	 private String dbUname = "root";
	 private String dbPassword ="mysql@kiit@123";
			 //"#Palak8218#";//"mysql@kiit@123"
	 private String dbDriver = "com.mysql.cj.jdbc.Driver";
	 
	 public void loadDriver(String dbDriver)
	 {
		 try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public Connection getConnection()
	 {
		 Connection con = null;
		 try {
			 con = DriverManager.getConnection(bdUrl,dbUname,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}         
		
	      return con;   
	 }
	 public  String insert(member member)
	 {                    
		 loadDriver(dbDriver);
		 Connection con = getConnection();
		 String result="data entered successfully";
		 String sql="insert into reg values(?,?,?,?)";
		 try
		 {
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setString(1,member.getUname());
		 ps.setString(2,member. getPassword());
		 ps.setString(3,member.getEmail());
		 ps.setString(4,member.getPhone());
		 ps.executeUpdate();
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
	         result="data not entered ";		  
		 }
		 return result;
	 }
	}
