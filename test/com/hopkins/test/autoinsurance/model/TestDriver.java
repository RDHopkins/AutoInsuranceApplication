package com.hopkins.test.autoinsurance.model;

import com.hopkins.autoinsurance.model.Driver;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDriver {
	private Driver driver;
	
	@Before
	public void setUp() {
		driver = new Driver("Ryan", "Hopkins");
		driver.setAge(30);
		driver.setDOB("06-25-1988");
		driver.setSSN("123-56-7890");
	}
	
	@Test
	public void testConstructor() {
		assertNotNull("Error: Failed to create object", driver);
	}
	
	@Test
	public void getFirstName() {
		assertTrue("Error: Failed to get first name", 
				driver.getFirstName().equals("Ryan"));
	}
	
	@Test
	public void setFirstName() {
		driver.setFirstName("Joaquin");
		assertTrue("Error: Failed to set first name as Joaquin", 
				driver.getFirstName().equals("Joaquin"));
	}
	
	@Test
	public void getLastName() {
		assertTrue("Error: Failed to get last name", 
				driver.getLastName().equals("Hopkins"));
	}
	
	@Test
	public void setLastName() {
		driver.setLastName("Rosales");
		assertTrue("Error: Failed to set last name Rosales", 
				driver.getLastName().equals("Rosales"));
	}
	
	@Test
	public void getAge() {
		assertTrue("Error: Failed to get age",
				driver.getAge() == 30);
	}
	
	@Test
	public void setAge() {
		driver.setAge(29);
		assertTrue("Error: Failed to set age to 29",
				driver.getAge() == 29);
	}
	
	@Test
	public void getDOB() {
		assertTrue("Error: Failed to get DOB",
				driver.getDOB().equals("06-25-1988"));
	}
	
	@Test
	public void setDOB() {
		driver.setDOB("12-25-1990");
		assertTrue("Error: Failed to set DOB to 12-25-1990",
				driver.getDOB().equals("12-25-1990"));
	}
	
	@Test
	public void getSSN() {
		assertTrue("Error: Failed to get SSN",
				driver.getSSN().equals("123-56-7890"));
	}
	
	@Test
	public void setSSN() {
		driver.setSSN("098-76-5432");
		assertTrue("Error: Failed to set SSN to 098-76-5432",
				driver.getSSN().equals("098-76-5432"));
	}
}
