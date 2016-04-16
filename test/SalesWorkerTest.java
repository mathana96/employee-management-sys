import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for the Sales Worker class
 */

/**
 * @author Siobhan Drohan, Mairead Meagher & Mathana Nair Sreedaran
 */

public class SalesWorkerTest
{
	private SalesWorker sales1;
	private SalesWorker salesValidation1, salesValidation2, salesValidation3, salesValidation4;

	/**
	 * Method to set up data for testing. 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		sales1 = new SalesWorker("Selly", "Seller", 12, 15);

		salesValidation1 = new SalesWorker("Mary", "Contrary", -1, -1);
		salesValidation2 = new SalesWorker("Mike", "Contrary", 0, 0);
		salesValidation3 = new SalesWorker("Mark", "Contrary", 1, 1);
		salesValidation4 = new SalesWorker("Mark", "Contrary", 1, 25);
	}

	/**
	 * Test method for SalesWorker constructor using valid data
	 */
	@Test
	public void testGettersValidData()
	{
		assertEquals("Selly", sales1.getFirstName());
		assertEquals("Seller", sales1.getSecondName());
		assertEquals(12, sales1.getHourlyRate(), 0.01);
		assertEquals(15, sales1.getBonus(), 0.01);

	}

	/**
	 * Test method for SalesWorker constructor using Invalid data
	 */
	@Test
	public void testManagerInvalidData()
	{
		assertEquals(0, salesValidation1.getHourlyRate(), 0.01);
		assertEquals(0, salesValidation1.getBonus(), 0.01);
		
		assertEquals(0, salesValidation2.getHourlyRate(), 0.01);
		assertEquals(0, salesValidation2.getBonus(), 0.01);
		
		assertEquals(1, salesValidation3.getHourlyRate(), 0.01);
		assertEquals(1, salesValidation3.getBonus(), 0.01);
		
		assertEquals(1, salesValidation4.getHourlyRate(), 0.01);
		assertEquals(0, salesValidation4.getBonus(), 0.01);
		
	}
	
	/**
	 * Test method for first name getter and setter (No validation on this field)
	 */
	@Test
	public void testGetSetFirstName() 
	{
		assertEquals(sales1.getFirstName(), "Selly");
		sales1.setFirstName("Selling");
		assertEquals(sales1.getFirstName(),"Selling");
	}
	
	/**
	 * Test method for second name getter and setter. (No validation on this field)
	 */
	@Test
	public void testGetSetSecondName() 
	{
		assertEquals(sales1.getSecondName(), "Seller");
		sales1.setSecondName("Sold");
		assertEquals(sales1.getSecondName(),"Sold");
	}
	
	/**
	 * Test method for getHourlyRate and setHourlyRate. (Validation on this field)
	 */
	@Test
	public void testGetSetHourlyRate() 
	{
		assertEquals(12, sales1.getHourlyRate(), 0.01);
		sales1.setHourlyRate(-1);
		assertEquals(12, sales1.getHourlyRate(), 0.01);
		sales1.setHourlyRate(0);
		assertEquals(0, sales1.getHourlyRate(), 0.01);
		sales1.setHourlyRate(20);
		assertEquals(20, sales1.getHourlyRate(), 0.01);
	}
	
	/**
	 * Test method for getBonus and setBonus. (Validation on this field)
	 */
	@Test
	public void testGetSetBonus() 
	{
		assertEquals(15, sales1.getBonus(), 0.01);
		sales1.setBonus(-1);
		assertEquals(15, sales1.getBonus(), 0.01);
		sales1.setBonus(0);
		assertEquals(0, sales1.getBonus(), 0.01);
		sales1.setBonus(12);
		assertEquals(12, sales1.getBonus(), 0.01);
		sales1.setBonus(25);
		assertEquals(12, sales1.getBonus(), 0.01);
	}
	

	/**
	 * Test method for calculateBonus()
	 */
	@Test
	public void testCalculateBonus() 
	{
		assertEquals(66.6, sales1.calculateBonus(37), 0.01);
		assertEquals(67.5, sales1.calculateBonus(37.5), 0.01);
		assertEquals(69.3, sales1.calculateBonus(38), 0.01);
		assertEquals(71.34, sales1.calculateBonus(38.5674), 0.01);
	}
	
	/**
	 * Test method for calculateSalary()
	 */
	@Test
	public void testCalculateSalary() 
	{
		assertEquals(510.6, sales1.calculateSalary(37), 0.01);
		assertEquals(517.5, sales1.calculateSalary(37.5), 0.01);
		assertEquals(531.3, sales1.calculateSalary(38), 0.01);
		assertEquals(546.96, sales1.calculateSalary(38.5674), 0.01);
	}
	
	


}
