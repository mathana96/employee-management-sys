import java.util.ArrayList;

public class Manager extends Employee
{
	private double managerBonus;
	private ArrayList<Employee> department;

	public Manager(String firstName, String secondName, double hourlyRate, double managerBonus)
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

	}

	public Object numberInDept()
	{
		return this.department.size();
	}
	
  public double calculateSalary(double numHours)
	{
  	return super.calculateSalary(numHours) + this.managerBonus;
	}
  
  public String toString() 
  {
		return "\n===============================\nPostion: Manager\n" + 
					 super.toString() + 
					 "\nManager bonus: " + 
					 managerBonus +
					 "\n===============================\n";
  }


	
  public void addDeptEmployee(Employee employee)
	{
  	department.add(employee);
	}
	
	public ArrayList<Employee> getDept()
  {
	  return department;
	}
	
	public void setDept(ArrayList<Employee> newDepartment)
	{
		this.department = newDepartment;
	}

}
