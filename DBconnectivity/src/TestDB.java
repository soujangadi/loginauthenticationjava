import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class TestDB {
public static void main(String[] args) {
	Connection connect1 =null;
		try {
		//Establishing the driver object for mysal driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//using the driver manager establishing the connection with the mysql instance that is present in the specified host
		//jdbc:mysql://localhost:3306 ->Host Name
		//root -> username to connect to the database
		//Aishwarya@12041996 -> password for the username
		//As the getconnection method,returns a connection object,we refer that by creating the instance variable of connection
		//interface
		connect1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/soujdatabase","root","Aishwarya@12041996");
		
		//preparing to execute sql statements
		   Statement stmt=connect1.createStatement();
		   
		   
		   //there are differnt quaries that can be used ,we are using the DQl query which gives a resultset object in return
		   ResultSet rs=stmt.executeQuery("select * from emp");
		   //till there are records that are present in the resultset,we iterate
		   while(rs.next()) {
			   System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		   }
	}
	catch(ClassNotFoundException|SQLException e) {
		System.out.println(e.getMessage());
	}
//Closing the heavy weight object -connection
	finally{
		try{
			connect1.close();
		}
		catch(SQLException sq) {
			System.out.println(sq.getMessage());
		}
	}
}
}
