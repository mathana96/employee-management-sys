import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	private Scanner input;
	private ArrayList<Employee> employees; 

	public static void main(String[] args)
	{
		Driver driver = new Driver();
		driver.run();
	}
	
	public Driver()
	{
		input = new Scanner(System.in);
		employees = new ArrayList<Employee>();
	}
	public int mainMenu()
	{
		System.out.println("1)	Add an employee");
		System.out.println("1)	Assign employee to a department");
		System.out.println("1)	Salary");
		System.out.println("1)	Employee details");
		int option = input.nextInt();
		return option;
	}
	
	public void run()
	{
int option = mainMenu();
		
//		while (option != 0)
//		{
//			switch(option)
//			{
//			case 1:
//				textPost();
//				break;
//				
//			case 2:
//				photoPost();	
//				break;
//				
//			case 3: 
//				System.out.println(newsFeed.show());
//				break;
//				
//			default:
//				System.out.println("Invalid option");
//			}
//			option = mainMenu();
//		}
//		System.out.println("Exiting");
//		System.exit(0);
//	
//	
	}
}
