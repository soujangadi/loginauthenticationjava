import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleteoperation {
	static Connection connect;

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/soujdatabase","root","Aishwarya@12041996");
		//preparing to execute all the statements
		Statement stmt=connect.createStatement();
		int result=stmt.executeUpdate("Delete from emp where empno=7369");
		System.out.println(result+"records have been removed");
		//int updateresult =stmt.executeUpdate("Update emp set name =\"manu\"where empno =7369");
		//System.out.println(update result + "record have been updated");
		

	}

}
