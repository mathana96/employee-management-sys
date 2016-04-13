import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalesWorkerTest
{
	private SalesWorker	sales1;
	
	@Before
	public void setUp() throws Exception
	{
		 sales1 = new SalesWorker("Selly", "Seller", 12, 15);
	}
	
	@Test
	 public void testGettersValidData() {
	 assertEquals("Selly", sales1.getFirstName());
	 assertEquals("Seller", sales1.getSecondName());
	 assertEquals(12, sales1.getHourlyRate(), 0.01);
	 assertEquals(510.6, sales1.calculateSalary(37), 0.01);
	 assertEquals(66.6, sales1.getBonus(), 0.01);

	 }


}
