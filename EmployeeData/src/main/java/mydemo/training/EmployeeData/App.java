package mydemo.training.EmployeeData;
import java.util.Scanner;

import mydemo.training.EmployeeData.service.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private StudentService serviceobj;
	private Scanner sc;
	public App()
	{
		sc=new Scanner(System.in);
		serviceobj=new StudentService();
		
	}
	public void menu()
	{
		String choice="y";
		while(choice.equals("y"))
		{
			System.out.println("1. Insert ");
			System.out.println("2. Update ");
			System.out.println("3. Delete ");
			System.out.println("4. View ");
			System.out.println("5. Exit ");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
					serviceobj.insert();
					break;
			case 2:
					serviceobj.update();
					break;
			case 3:
					serviceobj.delete();
					break;
			case 4:
					serviceobj.display();
					break;
			case 5:
					System.exit(0);
			}
			System.out.println("do u want to continue");
			choice=sc.next();
		}
		
	}
    public static void main( String[] args )
    {
    	App apobj=new App();
    	apobj.menu();

    }
}