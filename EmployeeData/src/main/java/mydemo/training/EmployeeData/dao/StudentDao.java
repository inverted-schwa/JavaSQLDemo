package mydemo.training.EmployeeData.dao;
import mydemo.training.EmployeeData.connect.DataConnect;
import mydemo.training.EmployeeData.dto.*;
import java.sql.*;

public class StudentDao {
	private Connection con;
	private PreparedStatement stat;
	public StudentDao()
	{
		con=DataConnect.getConnect();
	}
	public void insertData(Student s1) 
	{
		try
		{
		stat=con.prepareStatement("insert into Student values(?,?,?)");
		stat.setInt(1, s1.getStudentcode());
		stat.setString(2, s1.getStudentname());
		stat.setInt(3,  s1.getScore());
		int result=stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data Inserted");
		}
		else
		{
			System.out.println("Not inserted");
		}
		}catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	public void deleteData(int id)
	{
		try
		{
		stat=con.prepareStatement("delete from student where studentcode=?");
		
		stat.setInt(1, id);
		int result=stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data deleted successfully");
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex.getMessage());
		}
	}
	
	public void updateData(Student s)
	{
		try
		{
			System.out.println("Student code is "+s.getStudentcode());
			System.out.println("Student name is "+s.getStudentname());
	stat=con.prepareStatement("update Student set studentname=? where studentcode=?");
	stat.setString(1,s.getStudentname());
	stat.setInt(2, s.getStudentcode());
	int result=stat.executeUpdate();
	if(result>0)
	{
		System.out.println("Data updated");
	}
	else {
		System.out.println("Data not updated");
	}
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void retreiveData()
	{
		try
		{
		stat=con.prepareStatement("select * from Student");
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			System.out.println("Student code "+result.getInt(1));
			System.out.println("Student name is "+result.getString(2));
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex.getMessage());
		}
		
	}
}
