
public class Employee
{
	private String firstName;
	private String secondName;
	private double hourlyRate;
	private int employeeID;
	private int age;
	
	private final static double NORMAL_WORKWEEK = 37.5;
	
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
}
