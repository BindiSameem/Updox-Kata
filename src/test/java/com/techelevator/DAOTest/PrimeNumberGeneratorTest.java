package com.techelevator.DAOTest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.*;

import com.techelevator.DAO.PrimeNumberGenerator;

public class PrimeNumberGeneratorTest {

	private PrimeNumberGenerator target;
	
	@Before
	public void setup() {
		target = new PrimeNumberGenerator();
	}
	
	@Test
	public void the_range_of_2_to_2_returns_one_prime_number() {
		//arrange
		int startValue = 2;
		int endValue = 2;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(1, sizeOfResult);
	}
	
	@Test
	public void the_range_of_2_to_3_returns_two_prime_numbers() {
		//arrange
		int startValue = 2;
		int endValue = 3;
		
		//act
		List<Integer> result = target.generate(startValue, endValue);
		int sizeOfResult = result.size();
		
		//assert
		assertEquals(2, sizeOfResult);
		assertEquals(new Integer(2), result.get(0));
		assertEquals(new Integer(3), result.get(1));
	}
}
