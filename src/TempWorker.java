public class TempWorker extends Employee
{
	public TempWorker(String firstName, String secondName, double hourlyRate)
	{
		super(firstName, secondName, hourlyRate);
	}

	
  public double calculateSalary(double numHours)
	{
  	return super.calculateSalary(numHours);
	}
  
  public String toString() 
  {
		return "\n===============================\nPostion: Temporary Worker\n" + 
					 super.toString() + 
					 "\n===============================\n";
  }
}
