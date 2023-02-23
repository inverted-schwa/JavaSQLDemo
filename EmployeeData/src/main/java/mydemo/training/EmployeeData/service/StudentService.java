package mydemo.training.EmployeeData.service;
import java.util.*;
import mydemo.training.EmployeeData.dto.*;
import mydemo.training.EmployeeData.dao.*;
public class StudentService {
	StudentDao sdao;
	private Scanner scobj;
	public StudentService()
	{
		scobj=new Scanner(System.in);
		sdao=new StudentDao();
	}
	
	public void insert() {
		System.out.println("Enter the number of users you want to enter:");
		int nostu=scobj.nextInt();
		for(int x=1;x<=nostu;x++)
		{
			Student s1 = new Student();
			System.out.println("Enter Student code");
			s1.setStudentcode(scobj.nextInt());
			System.out.println("Enter Student name ");
			s1.setStudentname(scobj.next());
			System.out.println("Enter Score ");
			s1.setScore(scobj.nextInt());
			sdao.insertData(s1);
		}
	}
	

	public void delete()
	{
		System.out.println("Enter student id which u want to delete");
		int studentid=scobj.nextInt();
		sdao.deleteData(studentid);
	}
	
	public void update() {
		Student s1=new Student();
		System.out.println("Enter student ID you wish to update");
		int studentid=scobj.nextInt();
		System.out.println("Enter new student name");
		String studentname = scobj.next();
		s1.setStudentcode(studentid);
		s1.setStudentname(studentname);
		sdao.updateData(s1);
		
	}
	
	public void display()
	{
		sdao.retreiveData();
	}
}
