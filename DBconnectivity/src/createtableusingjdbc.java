import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class createtableusingjdbc {
	static Connection connect;

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		scanner scan = new sacnner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/soujdatabase","root","Aishwarya@12041996");
			//preparing to execute all the statements
			Statement stmt=connect.createStatement();
			
			 int result =stmt.executeUpdate("create Table product product_id integer,name varchar)");
			System.out.println(result + "Table have been created");
			

		

	}

}
