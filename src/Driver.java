import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver
{
	private Scanner	input;
	private List<Employee> employees;

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
		System.out.println("2)	List employees");
		System.out.println("3)	Assign employee to a department");
		System.out.println("4)	Employee details");
		System.out.println("\n0)	Exit system");
		int option = input.nextInt();
		return option;
	}

	public void run()
	{
		int option = mainMenu();

		while (option != 0)
		{
			switch (option)
			{
			case 1:
				chooseWorker();
				break;

			case 2:
				System.out.println(listAll());
				break;
			//
			// case 3:
			// System.out.println(newsFeed.show());
			// break;

			default:
				System.out.println("Invalid option selected");
			}
			option = mainMenu();
		}
		System.out.println("Exiting system");
		System.exit(0);
	}

	public void addManager()
	{
		input.nextLine();
		System.out.println("First name: ");
		String firstName = input.nextLine();

		System.out.println("Second name: ");
		String secondName = input.nextLine();

		System.out.println("Hourly rate: ");
		double hourlyRate = input.nextDouble();

		System.out.println("Manager bonus: ");
		double bonus = input.nextDouble();

		employees.add(new Manager(firstName, secondName, hourlyRate, bonus));

	}
	
	public void addSalesWorker()
	{
		input.nextLine();
		System.out.println("First name: ");
		String firstName = input.nextLine();

		System.out.println("Second name: ");
		String secondName = input.nextLine();

		System.out.println("Hourly rate: ");
		double hourlyRate = input.nextDouble();

		System.out.println("Sales bonus percentage (eg. 10): \nSet as 0 if worker does not qualify");
		double bonus = input.nextDouble();

		employees.add(new SalesWorker(firstName, secondName, hourlyRate, bonus));

	}
	
	public int workerMenu()
	{
		System.out.println("Please select which type of employee you would like to add");
		System.out.println("1)	Manager");
		System.out.println("2)	Sales worker");
		System.out.println("3)	Temporary worker");
		System.out.println("\n0)	Return to main menu");
		int option = input.nextInt();
		return option;	
	}
	
	public void chooseWorker()
	{
		int option = workerMenu();

		while (option != 0)
		{
			switch (option)
			{
			case 1:
				addManager();
				option = 0;
				break;

			case 2:
				addSalesWorker();
				option = 0;
				break;
			//
			// case 3:
			// 	addTempWorker();
			// 	break;
				
			default:
				System.out.println("Invalid option\n");
				option = workerMenu();
			}		
		}
	}

	public String listAll()
	{
		String list = "";
		
		for (Employee employee : employees)
		{
			list += employee.toString(); 	
		}
		return list;
	}

}
