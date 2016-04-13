import java.util.ArrayList;

public class SalesWorker extends Employee
{

	private double salesBonus;
	
	public SalesWorker(String firstName, String secondName, double hourlyRate, double salesBonus)
	{
		super(firstName, secondName, hourlyRate);

		if (salesBonus >= 0 && salesBonus <= 20)
		{
			this.salesBonus = (salesBonus/100.0);
		}
		else
		{
			this.salesBonus = 0;
		}
	}

	public double getBonus()
	{
		return salesBonus;
	}

	public void setBonus(int newBonus)
	{
		if (newBonus >= 0 && newBonus <= 20)
		{
			this.salesBonus = (newBonus/100.0);
		}
	}
	
	public double calculateSalary(double numHours)
	{
  	return super.calculateSalary(numHours) + calculateBonus(numHours);
	}
	
	public double calculateBonus(double numHours)
	{
		this.salesBonus = (this.salesBonus * super.calculateSalary(numHours));
		return this.salesBonus;
	}
  
  public String employeeDetails()
  {
		return "\n===============================\nPostion: Manager\n" + 
					 super.toString() + 
					 "\nSales bonus: " + 
					 salesBonus +
					 "\n===============================\n";
  }

}
