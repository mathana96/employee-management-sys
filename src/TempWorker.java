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
		return "\nPostion: Temporary Worker\n" + 
					 super.toString();
  }

/*	void addDeptEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
	}*/
}
