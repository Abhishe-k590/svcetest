package pgms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
public class Database {

	public static void main(String[] args) throws Throwable {
		Driver driverref= new Driver();/* load or register the database */
		DriverManager.registerDriver(driverref);/* connect to database */
	
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		System.out.println("Done");
		/* create/issue SQL statement */
		Statement stat = conn.createStatement();
		String query = "select * from doc";
		/* execute query */
		ResultSet resultset = stat.executeQuery(query);
		while(resultset.next()){
			System.out.println(resultset.getString(2));
			
		}
		/* close the connection */
		conn.close();

	}

}
