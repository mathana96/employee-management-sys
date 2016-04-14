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
		
		int option = 0;
		boolean errorFree = false;
		do
		{
			try
			{
				System.out.println("1)	Add an employee");
				System.out.println("2)	List employees");
				System.out.println("3)	Add employee to a department");
				System.out.println("4)	Employee details");
				System.out.println("\n0)	Exit system");
				option = input.nextInt();
				errorFree = true;
				
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
			
		} while (!errorFree);
		
		System.out.println(option);
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
				
			case 3:
//				System.out.println(listManagers());
				addToDept();
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
	
	public int workerMenu()
	{
		int option = 0;
		boolean errorFree = false;
		do
		{
			try
			{
				System.out.println("Please select which type of employee you would like to add");
				System.out.println("1)	Manager");
				System.out.println("2)	Sales worker");
				System.out.println("3)	Temporary worker");
				System.out.println("\n0)	Return to main menu");
				option = input.nextInt();
				errorFree = true;
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		}
		while (!errorFree);
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
				
			case 3:
				addTempWorker();
				option = 0;
				break;

			default:
				System.out.println("Invalid option\n");
				option = workerMenu();
			}		
		}
	}

	public void addManager()
	{
	
		input.nextLine();
		System.out.println("First name: ");
		String firstName = input.nextLine();
		
		System.out.println("Second name: ");
		String secondName = input.nextLine();

		double hourlyRate = 0.0;
		boolean errorFree = false;
		do
		{
			try
			{
    		System.out.println("Hourly rate: ");
    		hourlyRate = input.nextDouble();
    		errorFree = true;
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		}	while (!errorFree);	
		
		double bonus = 0.0;
	  errorFree = false;
		do
		{
			try
			{
    		System.out.println("Manager bonus: ");
    		bonus = input.nextDouble();
    		errorFree = true;

			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		} while (!errorFree);

		employees.add(new Manager(firstName, secondName, hourlyRate, bonus));

	}
	
	public void addSalesWorker() 
	{
		input.nextLine();
		System.out.println("First name: ");
		String firstName = input.nextLine();

		System.out.println("Second name: ");
		String secondName = input.nextLine();

		double hourlyRate = 0.0;
		boolean errorFree = false;
		do
		{
			try
			{
    		System.out.println("Hourly rate: ");
    		hourlyRate = input.nextDouble();
    		errorFree = true;
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		}	while (!errorFree);	
		
		double bonus = 0.0;
	  errorFree = false;
		do
		{
			try
			{
    		System.out.println("Sales bonus: ");
    		bonus = input.nextDouble();
    		errorFree = true;

			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		} while (!errorFree);

		employees.add(new SalesWorker(firstName, secondName, hourlyRate, bonus));

	}
	
	public void addTempWorker() 
	{
		input.nextLine();
		System.out.println("First name: ");
		String firstName = input.nextLine();

		System.out.println("Second name: ");
		String secondName = input.nextLine();

		double hourlyRate = 0.0;
		boolean errorFree = false;
		do
		{
			try
			{
    		System.out.println("Hourly rate: ");
    		hourlyRate = input.nextDouble();
    		errorFree = true;
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		}	while (!errorFree);	

		employees.add(new TempWorker(firstName, secondName, hourlyRate));

	}

	public void addToDept()
	{
		System.out.println(listAll());
		
		input.nextLine();
		System.out.println("Please select the employee (worker ID)  you wish to assign");
		int employeeSelected = input.nextInt();
		
		
		Employee employee = employees.get(employeeSelected-1);
		
		listManagers();
		System.out.println("Please select the manager (worker ID) whose department you wish to assign an employee to");
		int managerSelected = input.nextInt();
		
		Manager manager = (Manager) employees.get(managerSelected-1);

		manager.addDeptEmployee(employee);

	}

	public String listAll() 
	{
		String list = "";
		int i = 0;
		
		for (Employee employee : employees)
		{
			list += "\n===============================\nWorker ID: " + (i+1) + employee.toString() + "\n===============================\n"; 	
			i++;
		}
		return list;
	}	
	
		public String listManagers() 
		{
			String list = "";
			int i = 0;
			
			for (Employee employee : employees)
			{
				if (employee.getClass().equals(Manager.class))
				{
					list += "\n===============================\nWorker ID: " + (i+1) + 
							    "\nPosition: Manager" + 
							    "\n" + "First name: " + employee.getFirstName() + 
							    "\nSecond name: " + employee.getSecondName() +
							    "\n===============================\n"; 	
				}
				i++;
			}	
		return list;
		}

}
