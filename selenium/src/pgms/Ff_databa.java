package pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Ff_databa {
	public static void main(String[] args) throws Throwable {
		Driver d1=new Driver();
		DriverManager.registerDriver(d1);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement sts = conn.createStatement();
		String qr = "select * from doc";
		ResultSet resultset = sts.executeQuery(qr);
		while(resultset.next())
		{
			System.out.println(resultset.getString(1));
		}
		conn.close();

}
}