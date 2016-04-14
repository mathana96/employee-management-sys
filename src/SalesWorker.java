public class SalesWorker extends Employee
{

	private double salesBonus;
	
	public SalesWorker(String firstName, String secondName, double hourlyRate, double salesBonus)
	{
		super(firstName, secondName, hourlyRate);

		if (salesBonus >= 0 && salesBonus <= 20)
		{
			this.salesBonus = salesBonus;
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
			this.salesBonus = newBonus;
		}
	}
	
	public double calculateSalary(double numHours)
	{
  	return super.calculateSalary(numHours) + calculateBonus(numHours);
	}
	
	public double calculateBonus(double numHours)
	{
		return ((this.salesBonus/100.0) * super.calculateSalary(numHours));
	}
  
  public String toString()
  {
		return "\nPostion: Sales Worker\n" + 
					 super.toString() + 
					 "\nSales bonus: " + 
					 salesBonus + "%";
  }

}
