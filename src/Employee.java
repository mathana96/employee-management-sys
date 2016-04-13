
public class Employee
{
	private String firstName;
	private String secondName;
	private double hourlyRate;
	private int employeeID;
	private int age;
	
	public final static double NORMAL_WORKWEEK = 37.5;
	
	public Employee(String firstName, String secondName, double hourlyRate)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		if (hourlyRate >=0)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			this.hourlyRate = 0;
		}
//		this.employeeID = employeeID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getSecondName()
	{
		return secondName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setSecondName(String secondName)
	{
		this.secondName = secondName;
	}
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	public void setHourlyRate(int newRate)
	{
		if (newRate >= 0)
		{
			this.hourlyRate = newRate;
		}
	}
  public double calculateSalary(double numHours)
	{
  	if (numHours >= 0)
  	{
  		if (numHours <= NORMAL_WORKWEEK)
  		{
  			return ((getHourlyRate() * numHours) + calculateOvertime(numHours));
  		}
  		else
  		{
  			return ((getHourlyRate() * NORMAL_WORKWEEK) + calculateOvertime(numHours));
  		}
  	}
  	else
  	{
  		return 0.0;
  		
  	}
		 
	}
  
  private double calculateOvertime (double numHours)
  {
  	
  	if (numHours >= NORMAL_WORKWEEK)
  	{	
  		return ((numHours - NORMAL_WORKWEEK) * (2 * getHourlyRate()));
  	}
  	else
  	{
  		return 0.0;
  	}

  }
  
  public String employeeDetails()
  {
		String list = "";
		list += ("\nFirst name: " + getFirstName() + 
						 "\nSecond name: " + getSecondName() +
						 "\nHourly rate: " + getHourlyRate());
		list += "\n===============================\n";
		return list;
  }

}
