import java.util.ArrayList;

public class Manager extends Employee
{
	private double managerBonus;
	private ArrayList<Employee> department;

	public Manager(String firstName, String secondName, double hourlyRate, int managerBonus)
	{
		super(firstName, secondName, hourlyRate);
		if (managerBonus >= 0)
		{
			this.managerBonus = managerBonus;
		}
		else
		{
			this.managerBonus = 0;
		}
		this.department = new ArrayList<Employee>();
	}

	public double getBonus()
	{
		return managerBonus;
	}

	public void setBonus(int newBonus)
	{
		if (newBonus >= 0)
		{
			this.managerBonus = newBonus;
		}

		// if (this.managerBonus == 0)
		// {
		// if (newBonus >= 0)
		// {
		// this.managerBonus = newBonus;
		// }
		// else
		// {
		// this.managerBonus = 0;
		// }
		// }

	}

	public Object numberInDept()
	{
		return this.department.size();
	}

	//

	//
	// public Object numberInDept()
	// {
	// return null;
	// }
	//
	//

	//

	//
	// public double calculateSalary(double d)
	// {
	// return 0;
	// }
	//
	// public void addDeptEmployee(Employee sales1)
	// {
	//
	// }
	//
	// public ArrayList<Employee> getDept()
	// {
	// return null;
	// }
	//
	// public void setDept(ArrayList<Employee> tempDepartment)
	// {
	//
	// }

}
