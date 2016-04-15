import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver
{
	private Scanner	input;
	private List<Employee> employees;
	private List<Employee> managers; 

	public static void main(String[] args)
	{
		Driver driver = new Driver();
		driver.run();
	}

	public Driver()
	{
		input = new Scanner(System.in);
		employees = new ArrayList<Employee>();
		managers = new ArrayList<Employee>();
	}

	public int mainMenu()
	{
		
		int option = 0;
		boolean errorFree = false;
		while (!errorFree)
		{
			try
			{
				System.out.println("\n============= MAIN MENU =============\n");
				System.out.println("1)	Add an employee");
				System.out.println("2)	List employees");
				System.out.println("3)	Assign employee to a department");
				System.out.println("4)	Calculate salary");
				System.out.println("\n0)	Exit system");
				option = input.nextInt();
				errorFree = true;
				
			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
			
		}
		
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
				addToDept();
				break;

			//
			// case 3:
			// System.out.println(newsFeed.show());
			// break;

			default:
				System.out.println("Invalid option. Please try again.");
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
		while (!errorFree)
		{
			try
			{
				System.out.println("\n============= WORKER MENU =============\n");
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
				System.out.println("Invalid option. Please try again.\n");
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
		while (!errorFree)
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
		}	
		
		double bonus = 0.0;
	  errorFree = false;
	  while (!errorFree)
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
		}

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
		while (!errorFree)
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
		}
		
		double bonus = 0.0;
	  errorFree = false;
	  while (!errorFree)
		{
			try
			{
    		System.out.println("Sales bonus percentage (only values between 0 and 20): ");
    		bonus = input.nextDouble();
    		errorFree = true;

			}
			catch (Exception e)
			{
				input.nextLine();
				System.out.println("\nOnly numeric values accepted. Please try again.\n");
			}
		} 

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
		while (!errorFree)
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
		}	

		employees.add(new TempWorker(firstName, secondName, hourlyRate));

	}

	public void addToDept()
	{
		if (!listManagers().isEmpty())
		{
    		System.out.println(listAll());
    		int selectedEmployee = 0;
    		int selectedManager = 0;
    		boolean errorFree = false;
    		while (!errorFree)
    		{
    			try
    			{
        		System.out.println("Please select employee (Employee ID): ");
        		selectedEmployee = input.nextInt() - 1;
        		if (selectedEmployee < employees.size())
        		{
        			
        			if (employees.get(selectedEmployee).getClass().equals(Manager.class))
        			{
        				System.out.println("Cannot add Manager to department. Please try again.\n");
        			}
        			else
        			{
        				errorFree = true;
        			}
        		}	
        		else
        		{
        			System.out.println("Invalid option. Please try again. ");
        		}
    			}	
    			catch (Exception e)
    			{
    				input.nextLine();
    				System.out.println("\nOnly numeric values accepted. Please try again.\n");
    			}
    			
    		}		
    		Employee employee = employees.get(selectedEmployee);
    		
    		errorFree = false;
    		boolean isManager = false;
    		
    		while (!isManager)
    		{
    			while (!errorFree)
    			{
    				try
    				{
        			input.nextLine();
        			System.out.println("\n============= MANAGER LIST =============");
        			System.out.println(listManagers());
        			System.out.println("Please select the manager whose department you wish to assign the employee to: ");
        		  selectedManager = input.nextInt() - 1;
        		  if (selectedManager < employees.size())
          		{
          			errorFree = true;
          		}	
          		else
          		{
          			System.out.println("Invalid option. Please try again. ");
          		}
    				}
    				catch (Exception e)
    				{
    					System.out.println("\nOnly numeric values accepted. Please try again.\n");
    				}
    			}	
    			Employee emp = employees.get(selectedManager);
    			
    			if (emp.getClass().equals(Manager.class))
    			{
    				Manager man = (Manager) employees.get(selectedManager);
    				man.addDeptEmployee(employee);
    				isManager = true;
    			}
    			else
    			{
    				System.out.println("Invalid option. Please try again. ");
    				errorFree = false;
    			}
    		}
		}
		else
		{
			System.out.println("\nExisting managers not found. At least 1 manager required to add employee to department\n");
		}
	}

	public String listAll() 
	{
		String list = "";
		int i = 0;
		list += "\n============= EMPLOYEE LIST =============\n";
		if (employees.size() > 0)
		{
			for (Employee employee : employees)
			{
				
				list += "\n===============================\nWorker ID: " + (i+1) + employee.toString() + "\n===============================\n"; 	
				i++;
			}
			
		}
		else
		{
			list += "\nNo employees\n";
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
