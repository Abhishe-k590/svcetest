package pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Non_se_quer {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try{
		Driver d1= new Driver();
		DriverManager.registerDriver(d1);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	Statement sts = conn.createStatement(); 
	String st = "insert into doc values('deepa','rt nagar','ece',90)";
	int RE = sts.executeUpdate(st);
	System.out.println(RE);
		if(RE ==1)
		{
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	
	}catch (Exception e){
	e.printStackTrace();
	}
	finally{
		
		conn.close();
	}

	}}
