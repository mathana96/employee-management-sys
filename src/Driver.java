import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	private Scanner	input;
	private ArrayList<Employee>	employees;

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
		System.out.println("1)	Add manager");
		System.out.println("2)	List manager");
		System.out.println("3)	Salary");
		System.out.println("4)	Employee details");
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
				addManager();
				break;

			case 2:
				System.out.println(listAll());
				break;
			//
			// case 3:
			// System.out.println(newsFeed.show());
			// break;

			default:
				System.out.println("Invalid option");
			}
			option = mainMenu();
		}
		System.out.println("Exiting");
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

	public String listAll()
	{
		String list = "";
		for (Employee employee : employees)
		{
			list += employee.employeeDetails(); 				
		}
		return list;
	}

}
