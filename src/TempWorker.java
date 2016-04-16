/**
 * This class stores information specific to employees 
 * of type TempWorker who do not have a bonus
 * 
 * @author Mathana Nair Sreedaran
 *
 */
public class TempWorker extends Employee
{
	public TempWorker(String firstName, String secondName, double hourlyRate)
	{
		super(firstName, secondName, hourlyRate);
	}

	/**
	 * Calculates and returns  salary of temp worker
	 */
  public double calculateSalary(double numHours)
	{
  	return super.calculateSalary(numHours);
	}
  
  /**
   * Returns a String of the sales worker's details and position
   */
  public String toString() 
  {
		return "\nPostion: Temporary Worker\n" + 
					 super.toString();
  }
}
