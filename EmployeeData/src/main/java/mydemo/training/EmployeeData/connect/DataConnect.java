package mydemo.training.EmployeeData.connect;
import java.sql.*;
public class DataConnect {
	private static Connection con;
	private DataConnect()//no other class can make an object of the class
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DataConnect","root","Sn@kefing3r");
			System.out.println("Data Connected");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static Connection getConnect()
	{
		DataConnect d1 = new DataConnect();
		return con;
	}
	
	public static void main (String[] args) {
		getConnect();
	}
}
